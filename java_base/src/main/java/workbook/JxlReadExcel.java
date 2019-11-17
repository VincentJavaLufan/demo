package workbook;

import java.io.File;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;


public class JxlReadExcel {
	public static void main(String[] args) throws Exception {
		Workbook wb = Workbook.getWorkbook(new File("C:/Users/Administrator/Desktop/2018_date.xls"));
		Sheet sheet = wb.getSheet(0);

		for (int i = 0; i < sheet.getRows() - 1; i++) {
			for (int j = 0; j < sheet.getRows() - 1; j++) {
				Cell cell = sheet.getCell(i, j);
				System.out.println(cell.getContents());
			}
		}
	}
}
