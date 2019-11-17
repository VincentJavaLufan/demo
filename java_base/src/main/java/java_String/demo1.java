package java_String;

public class demo1 {

	public static void main(String[] args) {
		char data[]={'a','b','c','d','g','1','阿'};
		String str=String.copyValueOf(data);		
		System.out.println(str);
		System.out.println(str.concat("@@@@@@@@@@"));
		
		
		String s="you are a little boy!";
		char[] c=new char[s.length()];
		s.getChars(0, s.length(), c, 0);
		System.out.print(c);
		
		for(int i=0;i<100;i++) {
			double dd = (Math.random()*3+1)/10;
			System.out.println(dd*100+100);
		}
		
	}
}
