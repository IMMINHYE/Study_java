package constructor;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		Person personLee1 = new Person();
		Person personLee2 = new Person("Lee");
		Person personLee3 = new Person(170.1F);
		Person personLee4 = new Person(70.0F, "Ahn");
		Person personLee5 = new Person("Kim", 80.0F);
		Person personLee6 = new Person("Lim", 170.0F, 80.0F);
		
		Integer i = new Integer(0);
		Scanner sc = new Scanner(System.in);
	}

}
