package io.convert_04;

import java.io.UnsupportedEncodingException;

public class ConvertDemo01 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "中国";
		byte [] data = str.getBytes();
		System.err.println(new String(data));
		data = str.getBytes("gbk");
		System.out.println(new String(data));//会出现乱码
	}
}
