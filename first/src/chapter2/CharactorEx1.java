package chapter2;

public class CharactorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1 = '가';
		System.out.println(ch1); //문자 출력
		System.out.println((int)ch1); //문자에 해당하는 정수 값(아스키 코드 값)출력
		
		char ch2 = 44032; //정수값 대입
		System.out.println(ch2); //정수 값에 해당하는 문자 출력
		System.out.println((int)ch2);
		
		int ch3 = 67; 
		System.out.println(ch3); //문자 정수 값 출력
		System.out.println((int)ch3); //정수 값에 해당하는 문자 출력
		
		String str1 = "Hello, Java";
		System.out.println(str1); 
		
	}

}
