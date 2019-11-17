package workbook;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PoiReadExcel02 {
	public static void main(String[] args) {
		String[] title = {"id","name","sex"};
		XSSFWorkbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet();
		Row row = sheet.createRow(0);
		Cell cell = null;
		for(int i=0;i<title.length;i++) {
			cell = row.createCell(i);
			cell.setCellValue(title[i]);
		}
		for(int i=1;i<=10;i++) {
			Row nextrow = sheet.createRow(i);
			Cell cell2 = nextrow.createCell(0);
			cell2.setCellValue("a" +i);
			cell2 = nextrow.createCell(1);
			cell2.setCellValue("user" +i);
			cell2 = nextrow.createCell(2);
			cell2.setCellValue("��");
		}
		File file = new File("c:/Users/Administrator/Desktop/javaExcel/poi_test.xlsx");
		try {
			file.createNewFile();
			FileOutputStream stream = FileUtils.openOutputStream(file);
			workbook.write(stream);
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
