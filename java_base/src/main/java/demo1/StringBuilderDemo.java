package demo1;

import java.util.Arrays;

public class StringBuilderDemo {
	public static void main(String[] args) {
		String str = "as89fd5asdf78f41bb11n342";
		System.out.println(str);
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c<='9'  && c>='0') {
				sb.append(c);
			}
		}
		System.out.println(sb);
		char[] cha = sb.toString().toCharArray();
		Arrays.sort(cha);
		System.out.println(cha);
	}
}
