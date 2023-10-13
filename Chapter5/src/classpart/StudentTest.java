package classpart;

public class StudentTest {

	public static void main(String[] args) {
		//Student 클래스 생성
		Student studentAhn = new Student();
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
		
		Student studentAhn2 = new Student();
		studentAhn2.studentName = "안승연";
		
		System.out.println(studentAhn2.studentName);
		System.out.println(studentAhn2.getStudentName());
		
		System.out.println(studentAhn);
		System.out.println(studentAhn2);
		
	}

}
