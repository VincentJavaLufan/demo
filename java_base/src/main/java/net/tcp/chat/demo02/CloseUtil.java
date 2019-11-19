package net.tcp.chat.demo02;

import java.io.Closeable;

public class CloseUtil {

	public static void closeAll(Closeable... io) {
		for(Closeable temp:io) {
			try {
				if (null != temp) {
					temp.close();
				}
			} catch(Exception e) {
				
			}
		}
	}
}
