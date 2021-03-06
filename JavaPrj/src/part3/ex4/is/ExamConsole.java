package part3.ex4.is;

import java.util.Scanner;

public class ExamConsole {
	
	// Exam 객체 exam을 has a 상속해주세요.
	private Exam exam;
	public ExamConsole() {
		exam = new Exam();
	}
	public ExamConsole(Exam exam) {
		this.exam = exam; //constructor injection
	}
	
	//UI : print Score
	public void print() {
		System.out.println("┌───────────────────────────────────┐");
		System.out.println("│              성적 출력              │");
		System.out.println("└───────────────────────────────────┘");
		
		System.out.printf(
				  "1. 국어 성적 : %2d\n"
				+ "2. 영어 성적 : %2d\n"
				+ "3. 수학 성적 : %2d\n\n",exam.getKor(),exam.getEng(),exam.getMath());
		
		int total = this.exam.total();
		double avg = this.exam.avg();
		System.out.println("총점 : "+total);
		System.out.printf("평균 : %.2f\n", avg);
		
	}

	//UI : Input Score by Console input
	public void input() {
		System.out.println("┌───────────────────────────────────┐");
		System.out.println("│              성적 입력              │");
		System.out.println("└───────────────────────────────────┘");
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 성적을 입력하세요: ");
		exam.setKor(scan.nextInt());
		System.out.print("영어 성적을 입력하세요: ");
		exam.setEng(scan.nextInt());		
		System.out.print("수학 성적을 입력하세요: ");
		exam.setMath(scan.nextInt());
		
		
	}
	
}
