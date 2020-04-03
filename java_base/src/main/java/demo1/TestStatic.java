package demo1;

public class TestStatic {

	public static void main(String[] args) {
		String ss = StringBuilderBuffer.BASEINFO;//static属性归属于类，相当于全局变量。
		System.out.println(ss);
	}
}
