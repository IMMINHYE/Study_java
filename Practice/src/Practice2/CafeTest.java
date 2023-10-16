package Practice2;

public class CafeTest {

	public static void main(String[] args) {
		Customer kim = new Customer("김씨", 10000);
		Customer lee = new Customer("이씨", 10000);

		StarCafe star = new StarCafe("star");
		kim.buyStarCafe(star, 4000);

		KongCafe kong = new KongCafe("kong");
		lee.buyKongCafe(kong, 4500);
	}

}
