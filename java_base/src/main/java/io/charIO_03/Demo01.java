package io.charIO_03;
/**
 * 字符流   只能读取字符  纯文本  不能读取别的文件 你如mp3  jpg
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Demo01 {
	public static void main(String[] args) {
		File src = new File("C:/Users/Administrator/Desktop/IOTest/copyFile.txt");
		Reader reader = null;
		try {
			reader = new FileReader(src);
			int len = 0;
			char [] info = new char[1024];
			while(-1 != (len = reader.read(info))) {
				String cont = new String(info,0,len);
				System.out.println(cont);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("源文件未找到");
		} catch (IOException e2) {
			e2.printStackTrace();
			System.out.println("文件读取失败");
		} finally {
			try {
				if(null != reader) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("关闭字符流异常");
			}
		}
	}
}
