package chapter2;

public class Variable1 {

	public static void main(String[] args) {
		int level; //변수의 선언
		level = 10; //변수에 값 대입, 초기화
		System.out.println(level); //변수의 이름으로 값을 사용
	
		byte b1 = -128; //-128~127
		System.out.println(b1); 
		short s1 = -32768; //-32768~32767
		System.out.println(s1); 
		int level2 = 20; //-2147483648 ~ 214783647 //가장 많이 사용
		System.out.println(level2); 
		long l1 = -2147483649L; //가장 큰 단위의 정수를 표현하는 자료형
		System.out.println(l1); 
		
		long i1 = 1000000000; 
		long i2 = 1200000000; //int로 자료형 선언 시 컴파일 오류 없이 틀린 값 나옴(자료형 잘 맞춰주기)
		long sum = i1 + i2; 
		System.out.println(sum); 
		
		short sVal = 10;
		byte bVal = 20;
		System.out.println(sVal + bVal); 
		
	}

}
