package io.byteIO_02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.stream.ImageInputStream;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Demo01 {
	public static void main(String[] args) {
		File file = new File("C:/Users/Administrator/Desktop/IOTest/allPeoplePay.sql");
		InputStream is = null;
		try {
			is = new FileInputStream(file);
			int len = 0;//每次读取的字节长度
			byte [] info = new byte[1024];
			while(-1 != (len = is.read(info))) {
				String cont = new String(info);
				System.out.println(cont);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("文件不存在");
		} catch (IOException e) {
			System.out.println("文件读写异常");
		} finally {
			try {
				if(null != is) {
					is.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("关闭输出流");
			}
		}
	}
}
