package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum1 = add(num1, num2);	//add() 함수 호출
		System.out.println(num1 + "+" + num2 + "=" + sum1 + "입니다");
		
		int sum2 = subtract(num1, num2);	//subtract() 함수 호출
		System.out.println(num1 + "-" + num2 + "=" + sum2 + "입니다");
		
		int sum3 = multiply(num1, num2);	//multiply() 함수 호출
		System.out.println(num1 + "X" + num2 + "=" + sum3 + "입니다");
		
		int sum4 = divide(num1, num2);	//divide() 함수 호출
		System.out.println(num1 + "%" + num2 + "=" + sum4 + "입니다");
	
		//스택 : 처음 저장되었던 내용이 마지막에 삭제된다.
	}
	
	//add() 함수 정의
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;	//결과값 반환
	}

	//subtract() 함수 정의
	public static int subtract(int n1, int n2) {
		int result = n1 - n2;
		return result;	//결과값 반환
	}
	
	//multiply() 함수 정의
	public static int multiply(int n1, int n2) {
		int result = n1 * n2;
		return result;	//결과값 반환
	}
	
	//divide() 함수 정의
	public static int divide(int n1, int n2) {
		int result = n1 / n2;
		return result;	//결과값 반환
	}
}
