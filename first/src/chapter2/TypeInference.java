package chapter2;

public class TypeInference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//F5 : 메서드의 경우에 메서드 안으로, 변수 선언이라면 다음 줄로
		//F6 : 다음 줄로 이동
		//F7 : 중괄호를 기준으로 중괄호를 끝내는 단축키
		//F8 : 다음 브레이크 포인트까지 이동, 브레이크까지 이동,
		//     브레이크 포인트가 없다면 프로그램이 끝날 때까지 실행
		
		var i = 10; //int i = 10으로 컴파일됨
		var j = 10.0; //int j = 10.0으로 컴파일됨
		var str = "hello"; //String str = "hello"로 컴파일됨
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
		//str =3;
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
}
