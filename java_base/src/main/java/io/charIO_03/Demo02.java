package io.charIO_03;
/**
 * 字符流   只能读取字符  纯文本  不能读取别的文件 你如mp3  jpg
 * 写出文件
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Demo02 {
	public static void main(String[] args) {
		File dest = new File("C:/Users/Administrator/Desktop/IOTest/Readertest.txt");
		Writer writer = null;
		try {
			writer = new FileWriter(dest,true);//false或者  不写  表示覆盖  true表示追加
			String str = "aaaaaa\r\nbbbbbb\r\ncccccc\r\nddddddd\r\n";
			writer.write(str);
			writer.append("1111111\r\n");
			writer.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("文件未找到");
		} catch (IOException ee) {
			ee.printStackTrace();
			System.out.println("写入异常");
		}
	}
}
