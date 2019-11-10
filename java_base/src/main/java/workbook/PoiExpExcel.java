package workbook;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * https://www.cnblogs.com/skyislimit/articles/10514719.html
 * @author Administrator
 *
 */

public class PoiExpExcel {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String[] title = {"1","2","3","4","5","6","7","8","9","10","1","2","3","4","5","6","7","8","9","10","1","2","3","4","5","6"};
		SXSSFWorkbook workbook = new SXSSFWorkbook();
//		XSSFWorkbook workbook = new XSSFWorkbook();
//		HSSFWorkbook workbook = new HSSFWorkbook();
		Sheet sheet = workbook.createSheet();
		Row row = sheet.createRow(0);
		Cell cell = null;
		for(int i=0;i<title.length;i++) {
			cell = row.createCell(i);
			cell.setCellValue(title[i]);
		}
		for(int i=1;i<=65535;i++) {
			Row nextrow = sheet.createRow(i);
			Cell cell2 = nextrow.createCell(0);
			cell2.setCellValue("java");
			cell2 = nextrow.createCell(1);
			cell2.setCellValue("java");
			cell2 = nextrow.createCell(2);
			cell2.setCellValue("java");
			cell2 = nextrow.createCell(3);
			cell2.setCellValue("java");
			cell2 = nextrow.createCell(4);
			cell2.setCellValue("java");
			cell2 = nextrow.createCell(5);
			cell2.setCellValue("java");
			cell2 = nextrow.createCell(6);
			cell2.setCellValue("java");
			cell2 = nextrow.createCell(7);
			cell2.setCellValue("java");
			cell2 = nextrow.createCell(8);
			cell2.setCellValue("java");
			cell2 = nextrow.createCell(9);
			cell2.setCellValue("java");
			cell2 = nextrow.createCell(10);
			cell2.setCellValue("java");
			cell2 = nextrow.createCell(11);
			cell2.setCellValue("java");
			cell2 = nextrow.createCell(12);
			cell2.setCellValue("java");
			cell2 = nextrow.createCell(13);
			cell2.setCellValue("java");
			cell2 = nextrow.createCell(14);
			cell2.setCellValue("java");
			cell2 = nextrow.createCell(15);
			cell2.setCellValue("java");
			cell2 = nextrow.createCell(16);
			cell2.setCellValue("java");
			cell2 = nextrow.createCell(17);
			cell2.setCellValue("java");
			cell2 = nextrow.createCell(18);
			cell2.setCellValue("java");
			cell2 = nextrow.createCell(19);
			cell2.setCellValue("java");
			cell2 = nextrow.createCell(20);
			cell2.setCellValue("java");
			cell2 = nextrow.createCell(21);
			cell2.setCellValue("java");
			cell2 = nextrow.createCell(22);
			cell2.setCellValue("java");
			cell2 = nextrow.createCell(23);
			cell2.setCellValue("java");
			cell2 = nextrow.createCell(24);
			cell2.setCellValue("java");
			cell2 = nextrow.createCell(25);
			cell2.setCellValue("java");
		}
		File file = new File("c:/Users/Administrator/Desktop/javaExcel/poi_test.xls");
		try {
			file.createNewFile();
			FileOutputStream stream = FileUtils.openOutputStream(file);
			workbook.write(stream);
			workbook.close();
			stream.close();
			long end = System.currentTimeMillis();
			System.out.println("用时" + (end-start));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
