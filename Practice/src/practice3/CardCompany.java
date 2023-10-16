package practice3;

public class CardCompany {
    private static CardCompany instance = new CardCompany();

    private CardCompany() {}

    public static CardCompany getInstance() {
        return instance;
    }
}