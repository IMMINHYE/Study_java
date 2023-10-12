package constructor;

public class Person {
	String name;
	float height;
	float weight;
	
	//생성자 오버로드 : 매개변수를 다르게 하여 여러가지 생성자를 선언하는방법
	//오버로드 : 매개변수의 개수, 매개변수의 자료형
	public Person() {}	//디플트 생성자
	
	public Person(String pname) {
		name = pname;
	}

	public Person(float pHeight) {
		height = pHeight;
	}

	public Person(float pWeight) {
		weight = pWeight;
	}
}
