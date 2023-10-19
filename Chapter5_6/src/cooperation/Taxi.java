package cooperation;

public class Taxi {
	int taxiNumber;
	int passengerCount;
	int money;
	
	//택시 번호를 매개변수로 받는 생성자
	public Taxi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	
	//승객이 택시에 탄경우를 구현한 메서드
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	//택시 정보 출력하는 메서드
	public void showInfo() {
		System.out.println("택시 " + taxiNumber + "번의 승객은 " + passengerCount 
		+ "명이고, 수입은" + money + "입니다.");
	}
	
}
