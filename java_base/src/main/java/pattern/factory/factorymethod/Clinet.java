package pattern.factory.factorymethod;
/**
 * 工厂方法模式
 * 高级一些，但是实际上我们一般都用简单工厂模式。
 * 比较复杂，用得少。
 * 简单工厂用的多。
 * 
 */
public class Clinet {
	public static void main(String[] args) {
		Car c1 = new AudiFactory().createCar();
		Car c2 = new BydFactory().createCar();
		Car c3 = new BenzFactory().createCar();
		
		c1.run();
		c2.run();
		c3.run();
	}
}
