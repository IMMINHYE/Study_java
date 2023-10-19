package hiding;

public class Student {
	int studentID;
	private String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		if (studentID > 9999) {
		this.studentID = studentID;
		} else {
		System.out.println("5글자 이상 입력하시오.");
		}
	}
	
}