package workbook;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.hssf.usermodel.DVConstraint;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFDataValidation;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.CellRangeAddress;
import org.apache.poi.hssf.util.CellRangeAddressList;
import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

public class CreateTemplate {
	public static void main(String[] args) {
		String path = System.getProperty("user.dir") + "/bin/student.xml";
//		String path = System.getProperty("user.dir")+"/bin/student2.xml";
		File file = new File(path);
		SAXBuilder builder = new SAXBuilder();
		try {
			Document parse = builder.build(file);
			HSSFWorkbook wb = new HSSFWorkbook();
			HSSFSheet sheet = wb.createSheet("Sheet0");
			Element root = parse.getRootElement();
			String templateName = root.getAttribute("name").getValue();
			int rownum = 0;
			int column = 0;
			Element colgroup = root.getChild("colgroup");
			setColumnWidth(sheet, colgroup);
			Element title = root.getChild("title");
			List<Element> trs = title.getChildren("tr");
			for (int i = 0; i < trs.size(); i++) {
				Element tr = trs.get(i);
				List<Element> tds = tr.getChildren("td");
				HSSFRow row = sheet.createRow(rownum);
				HSSFCellStyle cellStyle = wb.createCellStyle();
				cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
				for (column = 0; column < tds.size(); column++) {
					Element td = tds.get(column);
					HSSFCell cell = row.createCell(column);
					Attribute rowSpan = td.getAttribute("rowspan");
					Attribute colSpan = td.getAttribute("colspan");
					Attribute value = td.getAttribute("value");
					if (value != null) {
						String val = value.getValue();
						cell.setCellValue(val);
						int rspan = rowSpan.getIntValue() - 1;
						int cspan = colSpan.getIntValue() - 1;
						HSSFFont font = wb.createFont();
						font.setFontName("����_GB2312");
						font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
//						font.setFontHeight((short)120);
						font.setFontHeightInPoints((short) 12);
						cellStyle.setFont(font);
						cell.setCellStyle(cellStyle);
						sheet.addMergedRegion(new CellRangeAddress(rspan, rspan, 0, cspan));
					}
				}
				rownum++;
			}
			Element thead = root.getChild("thead");
			trs = thead.getChildren("tr");
			for (int i = 0; i < trs.size(); i++) {
				Element tr = trs.get(i);
				HSSFRow row = sheet.createRow(rownum);
				List<Element> ths = tr.getChildren("th");
				for (column = 0; column < ths.size(); column++) {
					Element th = ths.get(column);
					Attribute valueAttr = th.getAttribute("value");
					HSSFCell cell = row.createCell(column);
					if (valueAttr != null) {
						String value = valueAttr.getValue();
						cell.setCellValue(value);
					}
				}
				rownum++;
			}
			Element tbody = root.getChild("tbody");
			Element tr = tbody.getChild("tr");
			int repeat = tr.getAttribute("repeat").getIntValue();
			List<Element> tds = tr.getChildren("td");
			for (int i = 0; i < repeat; i++) {
				HSSFRow row = sheet.createRow(rownum);
				for (column = 0; column < tds.size(); column++) {
					Element td = tds.get(column);
					HSSFCell cell = row.createCell(column);
					setType(wb, cell, td);
				}
				rownum++;
			}

			File tempFile = new File("c:/Users/Administrator/Desktop/javaExcel/" + templateName + ".xls");
			tempFile.delete();
			tempFile.createNewFile();
			FileOutputStream stream = FileUtils.openOutputStream(tempFile);
			wb.write(stream);
			stream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void setType(HSSFWorkbook wb, HSSFCell cell, Element td) {
		Attribute typeAttr = td.getAttribute("type");
		String type = typeAttr.getValue();
		HSSFDataFormat format = wb.createDataFormat();
		HSSFCellStyle cellStyle = wb.createCellStyle();
		if ("NUMERIC".equalsIgnoreCase(type)) {
			cell.setCellType(HSSFCell.CELL_TYPE_NUMERIC);
			Attribute formatAttr = td.getAttribute("format");
			String formatValue = formatAttr.getValue();
			formatValue = StringUtils.isNotBlank(formatValue) ? formatValue : "#,##0.00";
			cellStyle.setDataFormat(format.getFormat(formatValue));
		} else if ("STRING".equalsIgnoreCase(type)) {
			cell.setCellValue("");
			cell.setCellType(HSSFCell.CELL_TYPE_STRING);
			cellStyle.setDataFormat(format.getFormat("@"));
		} else if ("DATE".equalsIgnoreCase(type)) {
			cell.setCellType(HSSFCell.CELL_TYPE_NUMERIC);
			cellStyle.setDataFormat(format.getFormat("yyyy-m-d"));
		} else if ("ENUM".equalsIgnoreCase(type)) {
			@SuppressWarnings("deprecation")
			CellRangeAddressList regions = new CellRangeAddressList(cell.getRowIndex(), cell.getRowIndex(),
					cell.getColumnIndex(), cell.getColumnIndex());
			Attribute enumAttr = td.getAttribute("format");
			String enumValue = enumAttr.getValue();
			DVConstraint constraint = DVConstraint.createExplicitListConstraint(enumValue.split(","));
			HSSFDataValidation dataValidation = new HSSFDataValidation(regions, constraint);
			wb.getSheetAt(0).addValidationData(dataValidation);
		}
		cell.setCellStyle(cellStyle);
	}

	private static void setColumnWidth(HSSFSheet sheet, Element colgroup) {
		List<Element> cols = colgroup.getChildren("col");
		for (int i = 0; i < cols.size(); i++) {
			Element col = cols.get(i);
			Attribute width = col.getAttribute("width");
			String unit = width.getValue().replaceAll("[0-9,\\.]", "");
			String value = width.getValue().replaceAll(unit, "");
			int v = 0;
			if (StringUtils.isBlank(unit) || "px".endsWith(unit)) {
				v = Math.round(Float.parseFloat(value) * 37F);
			} else if ("em".endsWith(unit)) {
				v = Math.round(Float.parseFloat(value) * 267.5F);
			}
			sheet.setColumnWidth(i, v);
		}
	}
}
