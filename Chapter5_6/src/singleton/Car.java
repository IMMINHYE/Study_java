package singleton;

public class Car {
	private static int serialNum = 10000;
	public int carNum;
		
	public Car() {
		serialNum++;
		carNum = serialNum;
	}
	
	public int getCarNum() {
		return carNum;
	}
	
}
