package innerclass;

class OutClass {
	private int num = 10;
	private static int sNum = 20;
	
//	private InClass inClass;
//	
//	public OutClass() {
//		inClass = new InClass();
//	}
//	
//	class InClass {
//		int inNum = 100;
//		
//		void inTest() {
//			System.out.println("OutCalss num = " + num + "(외부 클래스의 인스턴스 변수)");
//			System.out.println("OutCalss sNum = " + sNum + "(외부 클래스의 정적 변수)");
//		}
	
//	public void usingClass() {
//		inClass.inTest();
//	}
	static class InStaticClass {
		int inNum = 100;
		static int sInNum = 200;
	
	void inTest() {
		System.out.println("InStaticClass innum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
		System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
		System.out.println("OutCalss sNum = " + sNum + "(외부 클래스의 정적 변수)");
	}
	static void sTest() {
		System.out.println("OutCalss sNum = " + sNum + "(외부 클래스의 정적 변수)");
		System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
	}
	
	}
}

public class InnerTest {
	public static void main(String[] args) {
//		OutClass outClass = new OutClass();
//		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
//		outClass.usingClass();
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		
		sInClass.inTest();
		System.out.println();
		System.out.println("정적 내부 클래스 정적 메서드 호출");
		OutClass.InStaticClass.sTest();
	}
}

//정적 내부 클래스 일반 메서드 호출
//InStaticClass innum = 100(내부 클래스의 인스턴스 변수 사용)
//InStaticClass sInNum = 200(내부 클래스의 정적 변수 사용)
//OutCalss sNum = 20(외부 클래스의 정적 변수)
//
//정적 내부 클래스 정적 메서드 호출
//OutCalss sNum = 20(외부 클래스의 정적 변수)
//InStaticClass sInNum = 200(내부 클래스의 정적 변수 사용)
