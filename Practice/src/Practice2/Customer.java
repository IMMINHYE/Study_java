package Practice2;

public class Customer {
	String name;
	int money;
	
	public Customer(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public String showInfo() {
		return name + "님은 " + money + "를 가지고 있습니다.";
	}
	
	public void buyStarCafe(StarCafe cafe, int money) {
		cafe.buyCoffee(money);
		System.out.println(name + "님이 " + money + "원에 아메리카노를 구매했습니다.");
		this.money -= money;
	}
	
	public void buyKongCafe(KongCafe cafe, int money) {
		cafe.buyCoffee(money);
		System.out.println(name + "님이 " + money + "원에 라떼를 구매했습니다.");
		this.money -= money;
	}
}
