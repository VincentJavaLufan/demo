package pattern.factory.simplefactory;

/**
 * 测试在没有工厂模式的情况下
 * @author Administrator
 *
 */
public class Clinet01 {//调用者
	public static void main(String[] args) {
		Car c1 = new Audi();
		Car c2 = new Byd();
		
		c1.run();
		c2.run();
	}
	
}
