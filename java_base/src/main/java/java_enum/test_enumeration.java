package java_enum;

public class test_enumeration {
	public static void main(String[] args) {
		for(EnumTest ee:EnumTest.values()) {
			System.out.println(ee);
		}
		EnumTest et = EnumTest.TUE;
		switch(et) {
			case MON:
				System.out.println("今天是星期一");
				break;
			case TUE:
				System.out.println("今天是星期二");
				break;
			case SAT:
				System.out.println("今天是星期六");
				break;
			default:
				System.out.println("zz:" + et);	
				break;
			}
		EnumTest ett = EnumTest.FRI;
		String name = ett.name();
		System.out.println("name:" + name);
		int ord = ett.ordinal();
		System.out.println("ord:" + ord);
	}
}
