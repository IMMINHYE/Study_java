package class_part;

import java.util.Scanner;

public class Student {
	//멤버 변수
	int sutndentID;	//학번
	String studentName;	//학생 이름
	int grade;	//학년
	String address;	//주소
	
	public static void main (String [] args) {
		//Student 클래스 생성
		Student studentAhn = new Student();
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
	
	//파스칼 표기법 : 단어의 첫글자를 대문자로 작성, (프로젝트 이름, 클래스 이름)
	//카멜 표기법 : 첫 단어의 첫글자를 소문자로, 나머지 단어의 첫글자는 대문자로 작성(메서드 이름, 변수 이름)
	//언더스코어 표기법 : 단어의 사이에 _(언더바)로 나누어 작성 (데이터베이스 컬럼명)
	
	//학생의 이름과 주소 출력하는 메서드
	public String showStudentInfo() {
		System.out.println(studentName + "," + address);
		String str = studentName + "," + address;
		return str;
	}
	//다음 학년을 반환하는 메서드
	public void nextGrade() {
		grade = grade + 1;
	}
	
	//학생의 이름을 반환하는 메서드
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
