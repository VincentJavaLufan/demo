package java_String;

public class DebugOperator {

	public static void main(String[] args) {
		Person person = new Person();
		String name = person.getName();
		if(name.equals("")) {
			System.out.println("姓名为空");
		}
	}
}
