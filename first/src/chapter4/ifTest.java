package chapter4;

public class ifTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// p.100 if조건문 나 혼자 코딩
		int score = 54;
		char grade;
		if (score <= 100 && score >= 90) {
			grade = 'A';
		}else if (score >= 80){
			grade = 'B';
		}else if (score >= 70){
			grade = 'C';
		}else if (score >= 60){
			grade = 'D';
		}else{
			grade = 'F';
		}
		System.out.println("학점은 " + grade + "입니다.");
		
		// 조건 연산자
		char grade2 = 
			(score >= 90) ? 'A' : 
				(score >= 80) ? 'B' : 
					(score >= 70) ? 'C' : 
						(score >= 60) ? 'D' : 'F';
		System.out.println("학점은 " + grade2 + "입니다.");
	} 
}
