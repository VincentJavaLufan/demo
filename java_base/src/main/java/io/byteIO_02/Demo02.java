package io.byteIO_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Demo02 {
	public static void main(String[] args) {
		File file = new File("C:/Users/Administrator/Desktop/IOTest/test.txt");
		OutputStream os = null;
		try {
			os = new FileOutputStream(file,false);//false覆盖  true追加
			String string = "baijing shangxuetang is very good!\r\n";
			byte[] bb = string.getBytes();
			os.write(bb, 0, bb.length);
			os.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("文件未找到");
		} catch (IOException ee) {
			ee.printStackTrace();
			System.out.println("写入失败");
		} finally {
			try {
				if(null != os) {
					os.close();
				}
			} catch (Exception eee) {
				eee.printStackTrace();
				System.out.println("关闭输出流失败");
			}
		}
	}
}
