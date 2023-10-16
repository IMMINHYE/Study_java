package practice3;

public class CardTest {

	public static void main(String[] args) {
		CardCompany cardCompany = CardCompany.getInstance();
		for(int i=0; i<10; i++) {
			Card card = new Card();
			System.out.println(card.getCardNum());
		}
	}
}
