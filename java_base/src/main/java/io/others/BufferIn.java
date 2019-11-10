package io.others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 封装输入
 * @author Administrator
 *
 */
public class BufferIn {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		System.out.println("清输入。。。。");
		String msg = br.readLine();
		System.out.println("输入的是" + msg);
	}
}
