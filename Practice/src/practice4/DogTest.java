package practice4;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dogArr = new Dog[5];
		
		dogArr[0] = new Dog("포키", "말티푸");
		dogArr[1] = new Dog("강이", "닥스훈트");
		dogArr[2] = new Dog("짱이", "푸들");
		dogArr[3] = new Dog("창이", "시바견");
		dogArr[4] = new Dog("징이", "불독");
		
		for (int i=0; i<dogArr.length; i++) {
			System.out.println(dogArr[i].showDogInfo());
		}
		
		System.out.println();
		System.out.println("=====향상된 for문 사용====");
		for(Dog dog2 : dogArr) {
			System.out.println(dog2.showDogInfo());
		}
	}

}
