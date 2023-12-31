package chapter2;

public class implicitConversion {

	public static void main(String[] args) {
		// 묵시적 형 변환
		// 바이트 크기가 작은 자료형에서 큰 자료형으로 대입하는 경우
		byte bNum = 10;
		int iNum = bNum; //byte형 값이 int형 변수로 대입됨
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		System.out.println(iNum2);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum; 
		System.out.println(dNum);
		
		// 명시적 형 변환
		// 바이트 크기가 큰 자료형에서 작은 자료형으로 대입하는 경우
		int inum3 = 10;
		byte bnum3 = (byte) inum3; //강제로 형을 바꾸려면 바꿀 형을 괄호를 써서 명시해야 함
		System.out.println(bnum3);
		
		double dnum4 = 3.14;
		int inum4 = (int) dnum4; //실수 자료형 double을 정수 자료형 int로 형 변환
		System.out.println(inum4);
		
	}

}
