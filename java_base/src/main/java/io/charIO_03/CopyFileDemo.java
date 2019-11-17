package io.charIO_03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CopyFileDemo {
	public static void main(String[] args) {
		//字节流可以复制一切文件
		//字符流只能复制字符的纯文本
//		File src = new File("C:/Users/Administrator/Desktop/IOTest/aaa.png");
//		File dest = new File("C:/Users/Administrator/Desktop/IOTest/bbb.png");
		
		File src = new File("C:/Users/Administrator/Desktop/IOTest/copyFile.txt");
		File dest = new File("C:/Users/Administrator/Desktop/IOTest/copyFile11.txt");
		Reader reader = null;
		Writer writer = null;
		try {
			reader = new FileReader(src);
			writer = new FileWriter(dest);
			char [] info = new char[1024];
			int len = 0;
			while(-1 != (len = reader.read(info))) {
				writer.write(info,0,len);
			}
			writer.flush();//强制刷出
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("源文件未找到");
		} catch (IOException e2) {
			e2.printStackTrace();
			System.out.println("文件读取失败");
		} finally {
			try {
				if(null != reader) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("关闭字符流异常");
			}
		}
		
	}
}
