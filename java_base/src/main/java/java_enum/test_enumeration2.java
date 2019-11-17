package java_enum;

public class test_enumeration2 {
	public static void main(String[] args) {
		for(EnumTest2 rTest2:EnumTest2.values()) {
			System.out.println(rTest2.getValue());
		}
		System.out.println(EnumTest2.SAT.isRest());
	}
}
