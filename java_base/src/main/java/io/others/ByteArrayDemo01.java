package io.others;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * 字节数组 节点流
 * 数组的长度有限，数据量不会很大。
 * @author Administrator
 *
 */
public class ByteArrayDemo01 {
	public static void main(String[] args) {
		
	}
	/**
	 * 输入流 操作与文件输入流操作一致
	 * 读取字节数组
	 */
	public static void read() {
		//数据源
		String msg = "操作与文件输入流操作一致";
		byte [] src = msg.getBytes();
		
		//选择流
		InputStream is = new BufferedInputStream(new ByteArrayInputStream(src));
		
		
	}
}
