package chapter4;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// switch-case문
		int ranking = 1;
		char medalCorol;
		switch(ranking) {
		case 1 : 
			medalCorol = 'G';
			break;
		case 2 : 
			medalCorol = 'S';
			break;
		case 3 : 
			medalCorol = 'A';
			break;
		default : 
			medalCorol = 'A';
		}
		System.out.println(ranking + "등 메달의 색깔은 " + medalCorol + "입니다.");
	
	int month = 11;
	int day = 0;
	switch(month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : 
			day = 31;
			break;
		case 4 : case 6 : case 9 : case 11 :
			day = 30;
			break;
		case 2 : 
			day = 28;
			break;
		}
	System.out.println(month + "월은 " + day + "일까지 입니다.");
	}

}
