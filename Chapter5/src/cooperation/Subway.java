package cooperation;

public class Subway {
	String lineNumber;
	int passengerCount;
	int money;
	
	//지하철 노선 번호를 매개변수로 받는 생성자
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	//승객이 지하철에 탄경우를 구현한 메서드
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	//지하철 정보 출력하는 메서드
	public void showInfo() {
		System.out.println("버스 " + lineNumber + "번의 승객은 " + passengerCount 
		+ "명이고, 수입은" + money + "입니다.");
	}
}
