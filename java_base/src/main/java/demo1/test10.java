package demo1;

import java.util.Date;

/**
 * ��ʹ��splitʵ�ֲ���ַ���
 * @author FANFANER
 *
 */
public class test10 {
	public static void main(String[] args) {
		String str = "fiufqbf23rfjnv9032nv023nv302ncl";
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			sb.append(str.charAt(i)+",");
		}
		System.out.println(sb);
		
		Date date = new Date();
		System.out.println(date.getTime());
	}
	
}

