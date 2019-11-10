package demo1;
/**
 * 传唤成回文
 */
import java.util.Scanner;

public class test06 {
	public static void main(String[] args) {
		System.out.println("please input a string");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		System.out.println("传唤成回文");
		System.out.println(reverseString(input));
	}
	
	public static String reverseString(String input) {
		char[] chars = input.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i=chars.length-1;i>=0;i--) {
			sb.append(chars[i]);
		}
		return sb.toString();
	}
}
