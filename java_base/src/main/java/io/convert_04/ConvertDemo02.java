package io.convert_04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * 转换流：字节转为字符
 * 1，输出流OutputStreamWriter		编码
 * 2，输入流InputStreamReader		解码
 * @author Administrator
 *
 */
public class ConvertDemo02 {
	public static void main(String[] args) throws IOException {
		//指定解码字符集
		BufferedReader br = new BufferedReader(
			new InputStreamReader(new FileInputStream(
					new File("C:/Users/Administrator/Desktop/IOTest/allPeoplePay.sql")),"utf-8"));//gbk乱码
		//写出文件
		BufferedWriter bw = new BufferedWriter(
				new FileWriter("C:/Users/Administrator/Desktop/IOTest/allPeoplePay111111.sql")
		);
		String info = null;
		while(null != (info = br.readLine())) {
			bw.write(info + "\r\n");
			System.out.println(info);
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
