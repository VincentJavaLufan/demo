package pattern.factory.simplefactory;

import pattern.factory.factorymethod.Audi;
import pattern.factory.factorymethod.Byd;
import pattern.factory.factorymethod.Car;

/**
 * 
 */
public class CarFactory2 {
	public  static Car createAudi(){
		return new Audi();
	}
	public static Car createByd(){ 
		return new Byd();
	}
}
