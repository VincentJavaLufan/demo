package io.byteIO_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.print.attribute.ResolutionSyntax;

public class CopyDirDemo {
	public static void main(String[] args) {
		String srcPath = "C:/Users/Administrator/Desktop/scxz";
		String destPath = "C:/Users/Administrator/Desktop/IOTest/";
		copyDir(srcPath,destPath);
	}
	
	/**
	 * 拷贝文件夹
	 * @param src	源路径
	 * @param dest	目标路径
	 */
	public static boolean copyDir(String srcPath,String destPath) {
		File src = new File(srcPath);
		File dest = new File(destPath);
		if(src.exists()) {
			copyDir(src,dest);
			System.out.println("文件夹复制成功");
		} else {
			System.out.println("源文件不存在");
			return false;
		}
		return false;
	}
	
	/**
	 * 拷贝文件夹
	 * @param src	源File对象
	 * @param dest	目标File对象
	 */
	public static void copyDir(File src,File dest) {
		dest = new File(dest,src.getName());
		copyDirDetail(src,dest);
	}
	/**
	 * 拷贝文件细节
	 */
	public static void copyDirDetail(File src,File dest) {
		if(src.isFile()) {
			try {
				CopyFileDemo.copyFile(src, dest);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				System.out.println("文件不存在");
			} catch (IOException e2) {
				e2.printStackTrace();
				System.out.println("复制失败");
			}
		} else if(src.isDirectory()){
			dest.mkdir();//创建目标文件夹
			for(File sub : src.listFiles()) {//获取子文件夹/我文件
				copyDirDetail(sub,new File(dest, sub.getName()));
			}
		}
	}
}
