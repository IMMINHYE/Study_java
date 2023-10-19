package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		Customer lee = new Customer();
		lee.setCustomerID(10010);
		lee.setCustomerName("이순신");
		lee.bonusPoint = 1000;
		System.out.println(lee.showCustomerInfo());
		
		VIPcustomer kim = new VIPcustomer();
		kim.setCustomerID(10020);
		kim.setCustomerName("김유신");
		kim.bonusPoint = 1000;
		System.out.println(kim.showCustomerInfo());
		
		VIPcustomer lim = new VIPcustomer(10030, "임민혜", 1000);
		lim.bonusPoint = 2000;
		System.out.println(lim.showVIPInfo());
		
		Customer a = new VIPcustomer(10030, "a", 1000);
		a.bonusPoint = 3000;
		System.out.println(a.calcPrice(10000));
	}

}
