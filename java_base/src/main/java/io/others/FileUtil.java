package io.others;

import java.io.Closeable;

public class FileUtil {
/**
 * 工具类关闭流
 * 可变参数：    ..  只能放在形参最后一个位置，处理方式与数组一致。
 * 
 */
	public static void close(String info, Closeable ... io) {//形参里面有无数个io流对象
		for(Closeable temp:io) {
			try {
				if(null != temp){
					temp.close();
				}
			} catch (Exception e) {
				
			}
		}
	}
	
	/**
	 * 使用    泛型
	 * 
	 */
	public static <T extends Closeable > void closeAll( T ... io) {
		for(Closeable temp:io) {
			try {
				if(null != temp){
					temp.close();
				}
			} catch (Exception e) {
				
			}
		}
	}
}
