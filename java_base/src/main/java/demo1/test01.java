package demo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test01 {  
    public static String BASEINFO = "Mr.Y";  
    public static final int COUNT = 2000000;  
 
    public static void doStringTest() {  
        String str = new String(BASEINFO);
        long starttime = System.currentTimeMillis();  
        for (int i = 0; i < COUNT / 100; i++) {  
            str = str + "miss";  
        }  
        long endtime = System.currentTimeMillis();  
        System.out.println((endtime - starttime) + "millis has costed when used String.");  
    }  
  
    public static void doStringBufferTest() {  
        StringBuffer sb = new StringBuffer(BASEINFO);  
        long starttime = System.currentTimeMillis();  
        for (int i = 0; i < COUNT; i++) {  
            sb = sb.append("miss");  
        }  
        long endtime = System.currentTimeMillis();  
        System.out.println((endtime - starttime)  + " millis has costed when used StringBuffer.");  
    }  
  

    public static void doStringBuilderTest() {  
        StringBuilder sb = new StringBuilder(BASEINFO);  
        long starttime = System.currentTimeMillis();  
        for (int i = 0; i < COUNT; i++) {  
            sb = sb.append("miss");  
        }  
        long endtime = System.currentTimeMillis();  
        System.out.println((endtime - starttime) + " millis has costed when used StringBuilder.");  
    }  
  
    public static void doStringBufferListTest(List<String> mlist) {  
        StringBuffer sb = new StringBuffer();  
        long starttime = System.currentTimeMillis();  
        for (String string : mlist) {  
            sb.append(string);  
        }  
        long endtime = System.currentTimeMillis();  
        System.out.println(sb.toString() + "buffer cost:" + (endtime - starttime) + " millis");  
    }  
  
    public static void doStringBuilderListTest(List<String> mlist) {  
        StringBuilder sb = new StringBuilder();  
        long starttime = System.currentTimeMillis();  
        for (Iterator<String> iterator = mlist.iterator(); iterator.hasNext();) {  
            sb.append(iterator.next());  
        }  
  
        long endtime = System.currentTimeMillis();  
        System.out.println(sb.toString() + "builder cost:" + (endtime - starttime) + " millis");  
    }  

    public static void main(String[] args) {  
        doStringTest();  
        doStringBufferTest();  
        doStringBuilderTest();  
        List<String> list = new ArrayList<String>();  
        list.add(" I ");  
        list.add(" like ");  
        list.add(" BeiJing ");  
        list.add(" tian ");  
        list.add(" an ");  
        list.add(" men ");  
        list.add(" . ");  
        doStringBufferListTest(list);  
        doStringBuilderListTest(list);  
    }  
}  