package io.file_01;

import java.io.File;
 
public class RenamePhotosDemo{
    
    public static void main(String[] args){
    	renamePhotos("F:\\QQMusicCache\\photos\\" , "美女-", ".jpg");
//    	renamePhotos("F:\\QQMusicCache\\cache\\plguin\\videos\\" , "二女" ,".mp4");
    }
    
    public static void renamePhotos(String pathString, String name, String format) {
    	Boolean bool = false;
        File file = new File(pathString);
        String [] fileName = file.list();
        long start = System.currentTimeMillis();
        for (int i = 0; i < fileName.length; i++) {
        	File oldFile = new File(pathString + fileName[i]);
        	File newfile = new File(pathString + name + i + format);
        	bool = oldFile.renameTo(newfile);
        }
        long end = System.currentTimeMillis();
        System.out.println("time:" + (end-start));
        System.out.println("size:" + fileName.length);
        System.out.println(bool);
    }
}
