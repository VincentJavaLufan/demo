package io.others;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * 三个常亮
 * 1,System.in	输入流	键盘输入
 * 2,System.out	输出流	控制台输出
 * 	 System.err
 * @author Administrator
 *
 * 重定向
 * setIn()
 * setOut()
 * setErr()
 */
public class SystemDemo01 {
	public static void main(String[] args) throws FileNotFoundException {
//		test1();
//		test2();
		test3();
	}
	
	public static void test1() {
		System.out.println("test");
		System.err.println("test");
	}
	
	public static void test2() throws FileNotFoundException {
		InputStream is = System.in;		//scanner 其实使用的是输入流（键盘输入）
//		Scanner sc = new Scanner(is);
//		System.out.println("清输入：");
//		System.out.println("您输入的是" + sc.nextLine());
		is = new BufferedInputStream(
				new FileInputStream("C:/Users/Administrator/Desktop/IOTest/test.txt"));
		Scanner sc=  new Scanner(is);	//使用scanner读取文件内容
		System.out.println(sc.nextLine());
	}
	
	public static void test3() throws FileNotFoundException {
		System.setOut(new PrintStream(new BufferedOutputStream(
			new FileOutputStream("C:/Users/Administrator/Desktop/IOTest/test.txt")), true));
		System.out.println("redirect redirect redirect redirect redirect ");//输出重定向到控制台
	}
}
