package practice3;

public class Card {
	private static int serialNum = 1000;
	private int cardNum;
	
	public Card() {
		cardNum = ++serialNum;
	}

	public int getCardNum() {
		return cardNum;
	}

	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}
	
}
