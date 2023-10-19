package staticex;

public class StudentTest6 {

	public static void main(String[] args) {
		Student3 lee = new Student3();
		lee.setStudentName("이지원");
		System.out.println("이름 : " + lee.getStudentName());
		System.out.println("학번 : " + lee.getSerialNum());
		System.out.println("카드 번호 : " + lee.getCardNumber());

		Student3 son = new Student3();
		son.setStudentName("손수경");
		System.out.println("이름 : " + son.getStudentName());
		System.out.println("학번 : " + son.getSerialNum());
		System.out.println("카드 번호 : " + son.getCardNumber());
		
		for(int i=0; i<100; i++) {
			Student3 student = new Student3();
			student.setStudentName("이름"+i);
			System.out.println("이름 : " + student.getStudentName());
			System.out.println("학번 : " + student.getSerialNum());
			System.out.println("카드 번호 : " + student.getCardNumber());
		}
	}

}
