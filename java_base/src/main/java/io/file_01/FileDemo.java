package io.file_01;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Administrator\\Desktop");
		File [] files = file.listFiles();
		for(int m=0;m<files.length;m++) {
			if(files[m].isFile()) {
				System.out.println("file:" + files[m]);
			}
		}
		
		File file2 = new File("C:\\Users\\Administrator\\Desktop");
		File [] files2 = file2.listFiles();
		for(int m=0;m<files2.length;m++) {
			if(files2[m].isDirectory() ) {
				System.out.println(files2[m]);
			}
		}
		System.out.println("file3:" + new File("C:\\Users\\Administrator\\Desktop").exists());
		
		File file3 = new File("e:/workspace1");
		File [] files3 = file.listFiles();
		for(int n=0;n<files3.length;n++) {
			if(files3[n].isFile()) {
				System.out.println("file3:" + files3[n]);
			}
		}
		
	}
}
