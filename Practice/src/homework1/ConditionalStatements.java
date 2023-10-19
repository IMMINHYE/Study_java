package homework1;
import java.util.Scanner;

public class ConditionalStatements {
	
	public static void main(String[] args) {

//		 1. 두 정수를 입력받아 합을 구하여 출력하는 프로그램을 작성하라. 키보드 입력은 Scanner
//		    클래스를 이용하라. [난이도 하]
//		 System.out.println("두 정수를 입력하세요");
//       Scanner scanner = new Scanner(System.in);
//		 int num1 = scanner.nextInt();
//		 int num2 = scanner.nextInt();
//		 int result = num1 + num2;
//		 System.out.println(num1 + " + " + num2 + "은 " + result);
       
//       2. 한 층의 높이가 5m일 때, 건물이 몇 층인지 입력받아 높이를 출력하라. [난이도 하]
//		 System.out.println("몇 층인지 입력하세요");
//       Scanner scanner = new Scanner(System.in);
//       int floor = scanner.nextInt();
//       int height = 5;
//       int result = floor * height;
//       System.out.println(floor);
//       System.out.println(result + "m 입니다.");
       
//		 3. x 값을 입력받아 y = x²-3x+7 식을 계산하여 y 값을 출력하는 프로그램을 작성하라. [난이도 하]		
//		 System.out.println("x 값을 입력하세요");
//       Scanner scanner = new Scanner(System.in);
//       int x = scanner.nextInt();
//       double y = Math.pow(x, 2) - 3 * x + 7;
//       System.out.println("y=" + y);

//		 5.다음과 같이 AND와 OR의 논리 연산을 입력받아 결과를 출력하는 프로그램을 작성하라.
//		 예를 들어 ‘true AND false’의 결과로 false를, ‘true OR false’의 결과로 true를 출력하면 된다. 
//		 if문 대신 switch문을 이용하라. [난이도 중]
//		 System.out.println("논리 연산을 입력하세요");
//       Scanner scanner = new Scanner(System.in);
//       boolean a = scanner.nextBoolean(); // 첫 번째 논리 값 읽기
//       String op = scanner.next(); // 논리 연산자(AND 또는 OR)를 문자열로 읽기
//       boolean b = scanner.nextBoolean(); // 두 번째 논리 값 읽기
//       		if(a!=b) {
//       			switch(op) {
//       				case "AND":
//       					System.out.println(a && b);
//       					break;
//       				case "OR":
//       					System.out.println(a || b);
//       					break;
//       			}
//       		} 
       				
//		 6. 돈의 액수를 입력받아 오만원권, 만원권, 천원권, 500원짜리 동전, 100원짜리 동전, 10원
//		 짜리 동전, 1원짜리 동전 각 몇 개로 변환되는지 출력하라. 힌트 참조. [난이도 중]
//		 System.out.println("돈의 액수를 입력하세요");
//		 Scanner scanner = new Scanner(System.in);
//		 int money = scanner.nextInt();
//		 int fiftyThousandWon = money/50000;
//		 int tenThousandWon = money%50000/10000;
//		 int thousandWon = money%50000%10000/1000;
//		 int fiveHundredWon = money%50000%10000%1000/500;
//		 int hundredWon = money%50000%10000%1000%500/100;
//		 int tenWon = money%50000%10000%1000%500%100/10;
//		 int won = money%50000%10000%1000%500%100%10;
//       System.out.println("오만원 " + fiftyThousandWon + "개");
//       System.out.println("만원 " + tenThousandWon + "개");
//       System.out.println("천원 " + thousandWon + "개");
//       System.out.println("500원 " + fiveHundredWon + "개");
//       System.out.println("100원 " + hundredWon + "개");
//       System.out.println("10원 " + tenWon + "개");
//       System.out.println("1원 " + won + "개");

//		 7. 학점이 A, B이면 “Excellent”, 학점이 C, D이면 “Good”, 학점이 F이면 “Bye”라고 출력하
//		 는 프로그램을 작성하라. switch와 break를 활용 [난이도 중]
//		 System.out.println("학점을 입력하세요");
//		 Scanner scanner = new Scanner(System.in);
//		 String score = scanner.next();
//		 switch(score) {
//		 	case "A": case "B":
//		 		System.out.println("Excellent");
//		 		break;
//		 	case "C": case "D":
//		 		System.out.println("Good");
//		 		break;
//		 	case "F":
//		 		System.out.println("Bye");
//		 		break;		
//		 }
		 
//		 8. 음료수 종류와 잔 수를 입력받으면 가격을 알려주는 프로그램을 작성하라. 에스프레소는 
//		 2000원, 아메리카노 2500원, 카푸치노 3000원, 카페라떼 3500원이다. [난이도 중]
//		 System.out.println("커피 주문하세요");
//		 Scanner scanner = new Scanner(System.in);
//		 String coffee = scanner.next();
//		 int count = scanner.nextInt();
//		 int total = 0;
//		 (1) if문을 활용
//		 if(coffee.equals("에스프레소")) {
//			 total = 2000 * count;
//		 } else if(coffee.equals("아메리카노")) {
//			 total = 2500 * count;
//		 } else if(coffee.equals("카푸치노")) {
//			 total = 3000 * count;
//		 } else if(coffee.equals("카페라떼")) {
//			 total = 3500 * count;
//		 }
//	 	 System.out.println(total + "원입니다");
//		 
//		 (2) switch문을 활용
//		 switch(coffee) {
//		 	case "에스프레소":
//		 		total = 2000 * count;
//		 			break;
//		 	case "아메리카노":
//				total = 2500 * count;
//					break;
//		 	case "카푸치노":
//				total = 3000 * count;
//					break;
//		 	case "카페라떼":
//				total = 3500 * count;
//					break;
//		 }
//		 System.out.println(total + "원입니다");
		 
	}

}
