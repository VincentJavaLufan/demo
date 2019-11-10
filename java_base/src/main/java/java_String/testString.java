package java_String;
/**
 * https://blog.csdn.net/yu_zhang_/article/details/48420983
 * @author Administrator
 *
 */
public class testString {

	public static void main(String[] args) {
		String string = "abcdefghijkl";
		char aa = string.charAt(3);
		System.out.println("aa:" + aa);
		
		//codePointAt	返回指定索引处的字符(Unicode 代码点)。
		int codePoint = string.codePointAt(0);
		System.out.println("codePoint:" + codePoint);//b  的 Unicode代码点
		
		System.out.println("length:" + string.length());
		System.out.println("indexOf:" + string.indexOf("z"));
		System.out.println("substring:" + string.substring(2, 7));
		System.out.println("substring(3):" + string.substring(3));
		System.out.println("subSequence:" + string.subSequence(2, 7));//https://blog.csdn.net/italywj222/article/details/50174363?utm_source=blogxgwz1
		System.out.println("contains:" + string.contains("aq"));//false  q不存在
		System.out.println("startsWith:" + string.startsWith("abcd"));
		
		byte [] des = new byte[12];
		des = string.getBytes();
		for(int i=0;i<string.length();i++) {
			System.out.println(i==11 ? des[i] : des[i] + "," );//三目运算
		}
	}
}
