package chapter4;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		// Q1. 사칙연산 수행 프로그램
		// if-else문
		System.out.println("1번");
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		if (operator == '+') {
		    System.out.println(num1 + num2);
		} else if (operator == '-') {
			System.out.println(num1 - num2);
		} else if (operator == 'X') {
			System.out.println(num1 * num2);
		} else if (operator == '/') {
			System.out.println(num1 / num2);
		}
		
		// Q2. 구구단 - 짝수 단만 출력
		System.out.println("2번");
		int i;
		int j;
		for (i=1; i<=9; i++) {
			for (j=1; j<=9; j++) {
				if (i % 2 == 1)
					continue;
				System.out.println(i + " X " + j + "=" + i*j);
			}
		}
		
		// Q3. 구구단 - 단보다 곱하는 수가 작거나 같은 경우까지만 출력
		System.out.println("3번");
		for (i=1; i<=9; i++) {
			for (j=1; j<=9; j++) {
				if (i < j)
					break;
				System.out.println(i + " X " + j + "=" + i*j);
			}
		}
		
		// Q4. 반복문 사용 - 피라미드
		System.out.println("4번");
		int row = 4;
		for (i = 0; i < row; i++) {
			for (j = 1; j < row - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Q5. 반복문 사용 - 상하 대칭 피라미드
		System.out.println("5번");
		for (i = 0; i < row; i++) {
			for (j = 1; j < row - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println();			
		}
		for (i = row - 1; i > 0; i--) {
			for (j = i ; j < row  ; j++) {
				System.out.print(" ");						
			}
			for (int k = i * 2 - 1 ; k > 0 ; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Q6. 윤년 계산하기
		// 1. 4로 나누어 떨어지면 윤년입니다.
		// 2. 100으로 나누어 떨어지면 윤년이 아닙니다.
		// 3. 400으로 나누어 떨어지면 윤년입니다.
		// 4. Scanner 클래스로 숫자를 입력받아 윤년인지 판단
		System.out.println("6번");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if ((year % 4 == 0 && year % 100 > 0) || (year % 400 == 0)) {
		System.out.println(year + "년은 윤년 입니다.");
		} else {
		System.out.println(year + "년은 윤년이 아닙니다.");
		}
	}
}
