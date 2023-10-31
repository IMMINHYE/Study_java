package practice;

import java.util.HashMap;

public class CarFactory {
	private static CarFactory instance = new CarFactory();
	private CarFactory() {} 
	public static CarFactory getInstance() {
		return instance;
	}
	
	private HashMap<String, Car> map = new HashMap<String, Car>();
	public Car createCar(String name) {
		if(map.containsKey(name)) {
			return map.get(name);
		}
		Car car = new Car(name); 
		map.put(name, car);
		return car;
	}
}
