package io.others;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.channels.ScatteringByteChannel;

/**
 * PrintStream  打印流--> 处理流
 * @author Administrator
 *
 */
public class PrintStreamDemo {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("test");
		PrintStream ps = System.out;
		ps.println(false);
		
		//输出到文件
		File file = new File("C:/Users/Administrator/Desktop/IOTest/test.txt");
		ps = new PrintStream(new BufferedOutputStream(new FileOutputStream(file)));
		ps.println("io is so easy!");
		ps.close();
		
	}
}
