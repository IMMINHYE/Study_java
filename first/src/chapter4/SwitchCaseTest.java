package chapter4;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ctrl + shift + o : 자동 임포트
		Scanner scanner = new Scanner(System.in);
		//콘솔창에서 정수값을 받아오는 메서드
		int floor = scanner.nextInt();
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
