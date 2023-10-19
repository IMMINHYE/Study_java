package constructor;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person1 = new Person();
		person1.name = "1";
		person1.height = 180.0F;
		person1.weight = 80.0F;
		Person person2 = new Person("Lee");
		Person person3 = new Person(170.1F);
		Person person4 = new Person(70.0F, "Ahn");
		Person person5 = new Person("Kim", 80.0F);
		Person person6 = new Person("Lim",170.0F, 80.0F);
		
		Integer i = new Integer(0);
		Scanner sc = new Scanner(System.in);
	}

}
