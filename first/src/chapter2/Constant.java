package chapter2;

public class Constant {

	public static void main(String[] args) {
		// final 예약어를 사용하여 상수 선언
		final double MAX_NUM = 3.14; //선언과 동시에 초기화
		final int MIN_NUM;
	    //MAX_NUM = 1000; //상수 값 변경 불가
		MIN_NUM = 0; //사용하기 전에 초기화. 초기화하지 않으면 오류 발생
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
	}

}
