package pattern.singleton;
public class Clinet {
	public static void main(String[] args) {
		SingletonDemo1 s1 = SingletonDemo1.getInstance();
		SingletonDemo1 s2 = SingletonDemo1.getInstance();
		System.out.println(s1);//
		System.out.println(s2);//
		
		SingletonDemo3 s3 = SingletonDemo3.getInstance();
		System.out.println(s3);
		
		SingletonDemo4 s4 = SingletonDemo4.getInstance();
		System.out.println(s4);
		
		SingletonDemo5 s5 = SingletonDemo5.INSTANCE;
		System.out.println(s5);
		
		SingletonDemo5 s55 = SingletonDemo5.INSTANCE;
		System.out.println(s55);
		
		System.out.println(SingletonDemo5.INSTANCE == SingletonDemo5.INSTANCE);//
	}
	
}
