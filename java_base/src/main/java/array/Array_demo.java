package array;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_demo {
	public static void main(String[] args) {
		//声明一个数组
		String[] aArray = new String[5];
		String[] bArray = {"1","2","3", "4", "5"};
		Object[] bArrayObj = {"1","2","3", "4", "5", aArray};
		String[] cArray = new String[]{"a","b","c","d","e"};
		//连接两个数组
		//反转数组		ArrayUtils.reverse(bArray);
		//打印一个数组	
		//删除数组元素	ArrayUtils.removeElement(intArray, 3);
		
		int[] intArray = { 1, 2, 3, 4, 5 };
		System.out.println(intArray);//[I@3d4eac69
		String intArrayString = Arrays.toString(intArray);
		System.out.println(intArrayString);// [1, 2, 3, 4, 5]
		//遍历一个数组
		for(int value:intArray) {
			System.out.println(value);
		}
		//根据数组创建ArrayList
		String[] stringArray = { "a", "b", "c", "d", "e" };
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
		System.out.println(arrayList);// [a, b, c, d, e]
		//判断数组内部是否包含某个值
		boolean b = Arrays.asList(stringArray).contains("a");
		System.out.println(b);
		
		String str = toString(bArrayObj);
		System.out.println(str);
		System.out.println(String.valueOf(bArray));
	}
	
	//重写Arrays.toString(Object obj) 方法
    public static String toString(Object[] a) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";
        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(String.valueOf(a[i]));
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }
}	
