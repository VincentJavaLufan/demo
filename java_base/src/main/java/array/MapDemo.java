package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
//		Map<String, String> map = new HashMap<>();
//		map.put("1", "aaaaa");
//		map.put("2", "bbbbb");
//		map.put("3", "ccccc");
//		map.put("4", "ddddd");
//		map.put("5", "eeeee");
//		map.put("qw12", "eeee232e");
//		map.put("23", "asdf");
//		System.out.println(map.get("5"));
//		//遍历Map
//		for(Map.Entry<String,String> valueString : map.entrySet()) {
//			System.out.println(valueString.getValue());
//		}
		
		Map<String,Car> map22 = new HashMap<String, Car>();
		Car car = new Car("benchi");
		Car car2 = new Car("aodi");
		Car car3 = new Car("baoma");
		map22.put("1",car);
		map22.put("2",car2);
		map22.put("3",car3);
		for(Map.Entry<String, Car> calEntry : map22.entrySet()) {
			System.out.println(calEntry.getValue().name);
		}
		
	}
}
