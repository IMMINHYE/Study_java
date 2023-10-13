package hiding;

public class StudentTest {

	public static void main(String[] args) {
		Student lee = new Student();
		lee.setStudentName("이상원");
		System.out.println(lee.getStudentName());
		lee.setStudentID(9999);
		System.out.println(lee.getStudentID());
	}
}
