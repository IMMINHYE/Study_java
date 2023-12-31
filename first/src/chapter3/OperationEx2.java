package chapter3;

public class OperationEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//증가 감소 연산자의 위치
		int gameScore = 150;
		
		int lastScore1 = ++gameScore; //gameScore에 1만큼 더한 값을 lastScore1에 대입
		System.out.println(lastScore1); //151
		
		int lastScore2 = --gameScore; //gameScore에 1만큼 뺀 값을 lastScore1에 대입
		System.out.println(lastScore2); //150
		
		int lastScore3 = gameScore++ ; //'++'가 변수명 뒤에 있으면 '='연산자가 우선
		System.out.println(lastScore3); //150
		
		int lastScore4 = gameScore++ + 1; 
		System.out.println(lastScore4); //152
		
		//관계 연산자
		System.out.println(lastScore3 != lastScore4); 
		System.out.println(1 == 1);  
		System.out.println(2 < 1); 
		
		//논리 연산자
		// && :  두 개의 항이 모두 true면 true 출력
		// || :  두 개의 항 중 하나가 true면 true 출력
		boolean b = !true; 
		System.out.println(b); 
		
		//복합 대입 연산자
		int a = 10;
		System.out.println(a += 2); // a = a + 2
		System.out.println(a -= 2); // a = a - 2
		System.out.println(a *= 2); // a = a * 2
		System.out.println(a /= 2); // a = a / 2
		System.out.println(a %= 2); // a = a % 2
		
	}
}
