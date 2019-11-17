package pattern.decorate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.Reader;
/**
 * 开发中的使用场景
 * 
 * IO中的输入输出流设计
 * Swing包中图形界面构建功能
 * Servlet API中提供了一个request对象的Decorator设计模式的默认实现类HttpServletRequestWrapper,
 * 		HttpServletRequestWrapper类，增强了request对象的功能。
 * Struts2中，request，response，session对象的处理。
 */
public class Client {

	public static void main(String[] args) {
		Car car = new Car();
		car.move();
		
		System.out.println("增加新的功能，飞行----");
		FlyCar flyCar = new FlyCar(car);
		flyCar.move();
//		flyCar.fly();
		
		System.out.println("增加新的功能，水里游----");
		WaterCar waterCar = new WaterCar(flyCar);
		waterCar.move();
//		waterCar.swim();
		
		System.out.println("增加新的功能，飞行，水里游----");
		WaterCar waterCar2 = new WaterCar(new FlyCar(car));
		waterCar2.move();
//		waterCar2.swim();
		
		//装饰器的典型应用
//		try {
//			Reader reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("d:xxx/xx/x.txt"))));
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
	}
}
