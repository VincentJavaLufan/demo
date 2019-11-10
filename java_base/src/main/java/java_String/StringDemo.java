package java_String;

public class StringDemo {
	 public static void main(String[] args) {
		 String str1 = "HelloFlyapi";
		 String str2 = "HelloFlyapi";
		 String str3 = new String("HelloFlyapi");
		 String str4 = "Hello";
		 String str5 = "Flyapi";
		 String str6 = "Hello" + "Flyapi";
		 String str7 = str4 + str5;
		 String ss = "2354dsfgd.6j6 ";
		 String dd = new String();
		 
		 System.out.println("str1 == str2 result: " + (str1 == str2));//true
		 System.out.println("str1 == str3 result: " + (str1 == str3));//false
		 System.out.println("str1 == str6 result: " + (str1 == str6));//true
		 System.out.println("str1 == str7 result: " + (str1 == str7));//false
		 System.out.println("str1 == str7.intern() result: " + (str1 == str7.intern()));
		 System.out.println("str3 == str3.intern() result: " + (str3 == str3.intern()));
		 fun();
	 }
	 
	 public static void fun() {
		 int a = 10;
		 int b = 20;
		 int c = 30;
		 int num = 0;
		 int num1 = 0;
		 
		 num = (a + b) * c;
		 num = c / b;
		 num1 = c % b;
		 System.out.println(num);
		 System.out.println(num1);
	 }
}