package chapter2;

public class DoubleEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dnum = 3.14;
		float fnum = 3.14F;
		System.out.println(dnum);
		System.out.println(fnum);
		
		dnum = 1;
		for(int i=0; i<10000; i++) {
			dnum = dnum + 0.1;
		}
		System.out.println(dnum); //실수 계산시 약간의 오차 발생
		
	}

}
