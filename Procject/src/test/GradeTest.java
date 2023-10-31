package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import school.School;
import school.Score;
import school.Student;
import school.Subject;
import school.report.GenerateGradeReport;
import utils.Define;

public class GradeTest {

	String subjectFistSpell;
	String subjectName;
	int subjectId;

	School goodSchool = School.getInstance();
	Subject korean;
	Subject math;
	Subject dance;
	GenerateGradeReport gradeReport = new GenerateGradeReport();

	public static void main(String[] args) throws FileNotFoundException {
		GradeTest test = new GradeTest();
		test.creatSubject2();
		test.creatStudent2();
		
		String report = test.gradeReport.getReport();
		System.out.println(report);

		try(FileOutputStream fos = new FileOutputStream("resultinfo.txt");
				OutputStreamWriter osw = new OutputStreamWriter(fos)){
					osw.write(report);
				} catch (IOException e) {
					System.out.println(e);
				}
				System.out.println("resultinfo.txt 파일을 열어보세요");
	}


	public void creatSubject2() throws FileNotFoundException {

		Scanner scanner = new Scanner(new FileInputStream("subjectinfo.txt"));
		while(scanner.hasNextLine()) {
			subjectFistSpell = scanner.next();
			subjectName = scanner.next();
			subjectId = scanner.nextInt();
			Subject subject = new Subject(subjectName, subjectId);
			
			if(subjectFistSpell.equals("K")) {
				korean = subject;
			} else if(subjectFistSpell.equals("M")) {
				math = subject;
			} else if(subjectFistSpell.equals("D")) {
				dance = subject;
			}
			
			goodSchool.addSubject(subject);
		}
	}

	public void creatStudent2() throws FileNotFoundException {
		Scanner scanner = new Scanner(new FileInputStream("studentinfo.txt"));
		
		String name;
		int id;
		int koreanScore = 0;
		int mathScore = 0;
		Integer danceScore = null;
		int majorCode;
		
		Student student = null;
		
		while(scanner.hasNextLine()) {
			name = scanner.next();
			id = scanner.nextInt();
			koreanScore = scanner.nextInt();
			mathScore = scanner.nextInt();
			danceScore = scanner.nextInt();
			if(danceScore.toString().length() == 4) {
				majorCode = danceScore;
			} else {
				majorCode = scanner.nextInt();
			}
			
			if(majorCode == Define.KOREAN) {
				student = new Student(id, name, korean);
			} else if(majorCode == Define.MATH) {
				student = new Student(id, name, math);
			} else if(majorCode == Define.DANCE) {
				student = new Student(id, name, dance);
			} else {
				System.out.println("전공 과목 오류 입니다");
				return;
			}

		
		goodSchool.addStudent(student);
		korean.register(student);
		math.register(student);
		dance.register(student);
		addScoreForStudent(student, korean, koreanScore);
		addScoreForStudent(student, math, mathScore);
		
		if(danceScore.toString().length() != 4) {
			dance.register(student);
			addScoreForStudent(student, dance, danceScore);
		}
		}

	}

	public void addScoreForStudent(Student student, Subject subject, int point) {
		Score score = new Score(student.getStudentId(), subject, point);
		student.addSubjectScore(score);
	}
}
