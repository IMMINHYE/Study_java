package chapter4;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// switch-case문
		int ranking = 1;
		char medalColor;
		switch(ranking) {
		case 1 : 
			medalColor = 'G';
			break;
		case 2 : 
			medalColor = 'S';
			break;
		case 3 : 
			medalColor = 'A';
			break;
		default : 
			medalColor = 'A';
		}
		System.out.println(ranking + "등 메달의 색깔은 " + medalColor + "입니다.");
	
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
	
		//p.106 switch-case문 연습하기
		int floor = 3;
		String place;
		switch(floor) {
			case 1 :
				place = "약국";
				break;
			case 2 :
				place = "정형외과";
				break;
			case 3 :
				place = "피부과";
				break;
			case 4 :
				place = "치과";
				break;
			case 5 :
				place = "헬스 클럽";
				break;
			default :
				place = "없는 층";
		}
		System.out.println(floor + "층 " + place + "입니다.");
	}
}