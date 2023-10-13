package constructor;

public class Person {
	String name;
	float height;
	float weight;
	
	//생성자 오버로드 : 매개변수를 다르게하여 여러가지 생성자를 선언하는 방법
	//오버로드 : 매개변수의 개수, 매개변수의 자료형, 매개변수의 순서
	public Person() {}
	
	public Person(String pname) {
		name = pname;
	}
	public Person(float pHeight) {
		height = pHeight;
	}
	
	public Person(float pWeight,String pname) {
		weight = pWeight;
		name = pname; 
	}
	public Person(String pname,float pWeight) {
		name = pname;
		weight = pWeight;
	}
	public Person(String pname,float pHeight, float pWeight) {
		name = pname;
		height = pHeight;
		weight = pWeight;
	}
	
}
