package practice4;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {

		ArrayList<Dog> dog = new ArrayList<Dog>();
		
		dog.add(new Dog("포키", "말티푸"));
		dog.add(new Dog("강이", "닥스훈트"));
		dog.add(new Dog("짱이", "푸들"));
		dog.add(new Dog("창이", "시바견"));
		dog.add(new Dog("징이", "불독"));
		
		for (int i=0; i<dog.size(); i++) {
			Dog getDog = dog.get(i);
			System.out.println(getDog.showDogInfo());
		}
		
		System.out.println();
		
		System.out.println("=====향상된 for문 사용====");
		for(Dog getDog2 : dog) {
			System.out.println(getDog2.showDogInfo());
		}
	}

}
