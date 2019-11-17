package workbook;

import java.io.File;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
public class jxlExpExcel {
	public static void main(String[] args) {
		String[] title = {"日期表"};
		int titleLen = title.length;
		File file = new File("C:/Users/Administrator/Desktop/2018_date.xls");
		try {
			file.createNewFile();
			WritableWorkbook workbook = Workbook.createWorkbook(file);
			WritableSheet sheet = workbook.createSheet("sheet123",0 );
			Label label = null;
			for(int i=0;i<titleLen;i++) {
				label = new Label(i,0,title[i]);
				sheet.addCell(label);
			}
			String[] vacation = {
					"20180101",
					"20180215","20180216","20180217","20180218","20180219","20180220","20180221",
					"20180405","20180406","20180407",
					"20180429","20180430","20180501",
					"20180616","20180617","20180618",
					"20180922","20180923","20180924",
					"20181001","20181002","20181003","20181004","20181005","20181006","20181007",
			};
			List<String> vacationList = new ArrayList<String>();
			vacationList = Arrays.asList(vacation); 
			
			int dayId = 1;
			int sum = 1;
			for(int m=1;m<=12;m++) {
				if(m==2) {
					for(int d=1;d<=28;d++) {
						if((dayId%7)!=2 & (dayId%7)!=5) { 
							dayId++; 
							continue; 
						}
						if(d<10){
							label = new Label(0,sum,"2018020"+d); 
						} else {
							label = new Label(0,sum,"201802"+d); 
						}
						if(vacationList.contains(label.getContents())) { 
							dayId++; 
							continue; 
						}
						sheet.addCell(label);
						dayId++;
						sum++;
					}
				}else if (m==11) {
					for(int d=1;d<=30;d++) {
						if((dayId%7)!=2 & (dayId%7)!=5) { 
							dayId++; 
							continue; 
						}
						if(d<10){
							label = new Label(0,sum,"201811"+"0"+d); 
						} else {
							label = new Label(0,sum,"201811"+d); 
						}
						if(vacationList.contains(label.getContents())) { 
							dayId++; 
							continue; 
						}
						sheet.addCell(label);		
						dayId++;
						sum++;
					}
				}else if (m==10 | m==12) {
					for(int d=1;d<=31;d++) {
						if((dayId%7)!=2 & (dayId%7)!=5) { 
							dayId++; 
							continue; 
						}
						if(d<10){
							label = new Label(0,sum,"2018"+m+"0"+d); 
						} else {
							label = new Label(0,sum,"2018"+m+d); 
						}
						if(vacationList.contains(label.getContents())) { 
							dayId++; 
							continue; 
						}
						sheet.addCell(label);		
						dayId++;
						sum++;
					}
				}else if(m==1 | m==3 | m==5 | m==7 | m==8) {
					for(int d=1;d<=31;d++) {
						if((dayId%7)!=2 & (dayId%7)!=5) { 
							dayId++; 
							continue; 
						}
						if(d<10) {
							label = new Label(0,sum,"20180"+m+"0"+d); 
						} else {
							label = new Label(0,sum,"20180"+m+d); 
						}
						if(vacationList.contains(label.getContents())) { 
							dayId++; 
							continue; 
						}
						sheet.addCell(label);		
						dayId++;
						sum++;
					}
				} else {
					for(int d=1;d<=30;d++) {
						if((dayId%7)!=2 & (dayId%7)!=5) { 
							dayId++; 
							continue; 
						}
						if(d<10) {
							label = new Label(0,sum,"20180"+m+"0"+d);
						} else {
							label = new Label(0,sum,"20180"+m+d); 
						}
						if(vacationList.contains(label.getContents())) { 
							dayId++; 
							continue; 
						}
						sheet.addCell(label);		
						dayId++;
						sum++;
					}
				}
			}
			for(int s=1;s<sum;s++) {
				label = new Label(1,s,"72"); 
				sheet.addCell(label);
				label = new Label(2,s,"18:00-21:00"); 
				sheet.addCell(label);
			}
			workbook.write();
			workbook.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
