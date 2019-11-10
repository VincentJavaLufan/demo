package demo1;
/**
 * @author Administrator
 *
 */
public class test13 {
	public static void main(String[] args) {
		int n = 12;
		System.out.println(toBinary(n));
	};
	
	public static String toBinary(int n) {
		String str = "";
		while(n!=0) {
			str = n%2 + str;
			n = n/2;
		}
		return str;
	}

}
