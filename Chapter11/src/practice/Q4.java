//연습문제4. 코드의 출력 결과가 '진돗개 멍멍이'가 되도록 클래스 수정
package practice;

class MyDog {
	String name;
	String type;
	
	public MyDog(String name, String type) {
		this.name = name;
		this.type = type;
	}
	@Override
	public String toString() {
		return name + " " + type;
	}
}

public class Q4 {

	public static void main(String[] args) {
		MyDog dog = new MyDog("멍멍이", "진돗개");
		System.out.println(dog);
	}

}
