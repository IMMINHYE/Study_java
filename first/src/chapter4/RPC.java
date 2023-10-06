package chapter4;

import java.util.Scanner;

public class RPC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드 입력을 받기위한 Scanner클래스 생성
		Scanner scanner = new Scanner(System.in);
		// nextInt()나  next()로 키보드 값 받아오기
		int player = scanner.nextInt();
		// 컴퓨터의 랜덤값 생성
		int computer = (int)(Math.random()*3);
		
		//가위바위보 게임의 if문 작성
		//가위=0, 바위=1, 보=2
		
		// 방법1
		int result = player - computer;
		//0 = 비겼을경우
		//-2,1,1 : 이겼을경우
		//-1,-1,2 : 졌을 경우
		if(result == 0) {
			System.out.println("비겼습니다.");
		}else if(result == -2 || result == 1) {
			System.out.println("이겼습니다.");
		}else if(result == -1 || result == 2) {
			System.out.println("졌습니다.");
		}
		
		// 방법2	
		if(player == computer) {
			System.out.println("비겼습니다.");
		}else if((player==0 && computer == 2) 
				|| player==1 && computer == 0
				|| player==2 && computer == 1) {
			System.out.println("이겼습니다.");
		}else {
			System.out.println("졌습니다.");
		}
		
		// 방법3
		if(player==0) {
			if(computer == 1) {
				System.out.println("졌습니다.");
			}else if(computer == 2){
				System.out.println("이겼습니다.");
			}else {
				System.out.println("비겼습니다.");
			}
		}else if(player==1){
			if(computer == 0) {
				System.out.println("이겼습니다.");
			}else if(computer == 2){
				System.out.println("졌습니다.");
			}else {
				System.out.println("비겼습니다.");
			}
		}else if(player==2){
			if(computer == 0) {
				System.out.println("졌습니다.");
			}else if(computer == 1){
				System.out.println("이겼습니다.");
			}else {
				System.out.println("비겼습니다.");
			}
		}
		//if문 종료
		System.out.println(computer);
	}

}