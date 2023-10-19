package cooperation;

public class TakeTrans {
	public static void main(String[] args) {
		Student james = new Student("James", 5000);
		Student tomas = new Student("Tomas", 10000);
		Student edward = new Student("Edward", 20000);
		
		Bus bus100 = new Bus(100);
		james.takeBus(bus100);
		james.showInfo();
		bus100.showInfo();
		
		Subway subwaygrenn = new Subway("2호선");
		tomas.takeSubway(subwaygrenn);
		tomas.showInfo();
		subwaygrenn.showInfo();
		
		Taxi taxi200 = new Taxi(200);
		edward.takeTaxi(taxi200);
		edward.showInfo();
		taxi200.showInfo();
				
	}

}
