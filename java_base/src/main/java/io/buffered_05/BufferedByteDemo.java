package io.buffered_05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/**
 * 使用缓冲流可以提高效率
 * InputStream is = new BufferedInputStream(new FileInputStream(src));
 * @author Administrator
 *
 */
public class BufferedByteDemo {
	public static void main(String[] args) throws IOException {
		String src = "C:/Users/Administrator/Desktop/IOTest/qqq.mkv";
		String dest = "C:/Users/Administrator/Desktop/IOTest/ccc.mkv";
		long start = System.currentTimeMillis();
		copyFile(src, dest);
		long end = System.currentTimeMillis();
		System.out.println(end-start);//27561  24554 25166
	}
	
	public static void copyFile(String srcPath,String destPath) throws IOException {
		File src = new File(srcPath);
		File dest = new File(destPath);
		if(! src.exists()) {
			System.out.println("只能拷贝文件");
			throw new IOException("只能拷贝文件");
		}
		InputStream is = new BufferedInputStream(new FileInputStream(src));
		OutputStream os = new BufferedOutputStream(new FileOutputStream(dest));
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
