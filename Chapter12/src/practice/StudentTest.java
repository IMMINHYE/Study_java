package practice;

import java.util.HashSet;

class Student {
	String studentId;
	String studentName;
	
	public Student(String studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	@Override
	public String toString() {
		return studentId + " : " + studentName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			if(this.studentId == student.studentId) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Integer.parseInt(studentId);
	}
}

public class StudentTest {
	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<Student>();
		set.add(new Student("100", "홍길동"));
		set.add(new Student("200", "강감찬"));
		set.add(new Student("300", "이순신"));
		set.add(new Student("400", "정약용"));
		set.add(new Student("100", "송중기"));
		
		System.out.println(set);
	}
}

//[400 : 정약용, 100 : 홍길동, 200 : 강감찬, 300 : 이순신]
