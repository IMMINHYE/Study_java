package practice6;

public abstract class Car {
	String name;
	
	public Car(String name) {
		this.name = name;
	}
	
	public void start() {
		System.out.println(name + " 시동을 켭니다.");
	}
	
	public void drive() {
		System.out.println(name + " 달립니다.");
	}
	
	public void stop() {
		System.out.println(name + " 멈춥니다.");
	}
	
	public void turnOff() {
		System.out.println(name + " 시동을 끕니다.");
	}
	
	public void washCar() {
		System.out.println("세차를 합니다.");
	}
	
	final public void run() {
		start();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
