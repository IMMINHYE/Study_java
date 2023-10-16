package Practice2;

public class KongCafe {
	String name;
	int customerCount;
	int money;
	
	public KongCafe(String name) {
	this.name = name;
	}
	
	public void buyCoffee(int money) {
		this.money += money;
		customerCount++;
	}
	
	public String showInof() {
		return name + "카페의 매출은 " + money + "원 입니다.";
	}
}
