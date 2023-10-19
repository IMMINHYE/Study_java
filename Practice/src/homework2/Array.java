package homework2;

import java.util.ArrayList;
import java.util.Scanner;

import practice4.Dog;

public class Array {
	
	public static void main(String[] args) {


//	1. 영문 소문자를 하나 입력받고 그 문자보다 알파벳 순위가 낮은 모든 문자를 출력하는 
//	프로그램을 작성하라. [목적-2중 중첩 반복문 연습] [난이도 하]
//	System.out.println("알파벳 한 문자를 입력하세요");
//	Scanner scanner1 = new Scanner(System.in);
//	String input = scanner1.next();	//문자열로 읽음
//	char firstInput = input.charAt(0);	//문자열의 첫 번째 문자
//	
//	for(char ch = 'a'; ch <= firstInput; ch++) {
//		System.out.print(ch);
//	}
//	
////	2. 정수를 10개 입력받아 배열에 저장한 후, 배열을 검색하여 3의 배수만 골라 출력하는 
////	프로그램을 작성하라. [목적-배열과 반복문 연습] [난이도 하]
//	System.out.println("정수 10개 입력");
//	int[] array = new int[10];
//	Scanner scanner2 = new Scanner(System.in);
//			
//	for (int i=0; i<10; i++) {
//		array[i] = scanner2.nextInt();
//	}
//	
//	System.out.println(array);
//	
//	
//
////	3. 정수를 입력받아 짝수이면 “짝”, 홀수이면 “홀”을 출력하는 프로그램을 작성하라. 사용자
////	가 정수를 입력하지 않는 경우에는 프로그램을 종료하라. [목적-자바의 예외 처리 연습]
////	[난이도 하]
//	System.out.println("정수를 입력하세요");
//	Scanner scanner3 = new Scanner(System.in);
//	int input3 = scanner3.nextInt();	
//	if (input3 % 2 == 0) {
//		System.out.println("짝");
//	} else {
//		System.out.println("홀");
//	}
	
//	5.정수를 10개 입력받아 배열에 저장하고 증가 순으로 정렬하여 출력하라. [목적-배열과 for 반복
//	문 연습] [난이도 중]
	System.out.println("정수 10개 입력");
	Scanner scanner5 = new Scanner(System.in);
	int input5 = scanner5.nextInt();	
	ArrayList<Array> array5 = new ArrayList<Array>();

	array5.add(new Array(array5));
		
//	for (int i=0; i<10; i++) {
//	array5[i] = scanner5.nextInt();
//	}

	System.out.println(array5);
	
	
	
	}
}