package io.byteIO_02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;

public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
//		CopyFileDemo();
		File src = new File("C:/Users/Administrator/Desktop/IOTest/qqq.mkv");
		File dest = new File("C:/Users/Administrator/Desktop/IOTest/www.mkv");
		copyFile(src,dest);
	}
	
	//方法的重载
	public static void copyFile(String srcPath,String destPath) throws IOException {
		File src = new File(srcPath);
		File dest = new File(destPath);
		copyFile(src, dest);
	}
	
	public static void copyFile(File src,File dest) throws IOException  {
		if(! src.exists()) {
			System.out.println("只能拷贝文件");
			throw new IOException("只能拷贝文件");
		}
		InputStream is = new FileInputStream(src);
		OutputStream os = new FileOutputStream(dest);
		byte [] info = new byte[1024];
		int len = 0;
		while(-1 != (len=is.read(info))) {
			os.write(info, 0, len);
		}
		os.flush();
		os.close();
		is.close();
	}
}
