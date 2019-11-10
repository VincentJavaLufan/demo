package workbook;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class PoiReadExcel {
	public static void main(String[] args) {
		File file = new File("c:/Users/Administrator/Desktop/javaExcel/poi_test.xls");
		try {
			HSSFWorkbook workbook = 
				new HSSFWorkbook(FileUtils.openInputStream(file));
//			HSSFSheet sheet = workbook.getSheet("sheet0");
			HSSFSheet sheet2 = workbook.getSheetAt(0);
			int firstRowNum = 0;
			int lastRowNum = sheet2.getLastRowNum();
			for(int i=firstRowNum;i<=lastRowNum;i++){
				HSSFRow row = sheet2.getRow(i);
				int lastCellNum = row.getLastCellNum();
				for(int j=0;j<lastCellNum;j++) {
					HSSFCell cell = row.getCell(j);
					String value = cell.getStringCellValue();
					System.out.print(value+"  ");
				}
				System.out.println();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
