package part3.ex6.iface.ui;

import java.util.Scanner;

import part3.ex6.iface.entity.Exam;
import part3.ex6.iface.entity.NewlecExam;

public class ExamConsole {
	
	//Interface 결합을 위한 Listener
	private ConsoleListener listener;
	public void setListener(ConsoleListener listener) {
		this.listener = listener;
	}
	
	
	
	// Exam 객체 exam을 has a 상속해주세요.
	private Exam exam;
	
	public ExamConsole() {
//		exam = new NewlecExam();
	}
	public ExamConsole(Exam exam) {
		this.exam = exam;
	}
	
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	
	public Exam getExam() {
		return exam;
	}
	
	//UI : print Score
	public void print(BannerPrinter bannerPrinter) {
		
		if(bannerPrinter != null)
			bannerPrinter.onPrint();
		
		else {
			System.out.println("┌───────────────────────────────────┐");
			System.out.println("│              성적 출력              │");
			System.out.println("└───────────────────────────────────┘");
		}
		
		System.out.printf(
				  "1. 국어 성적 : %2d\n"
				+ "2. 영어 성적 : %2d\n"
				+ "3. 수학 성적 : %2d\n",exam.getKor(),exam.getEng(),exam.getMath());
		
		if (listener!= null)
			listener.onPrint();
		
		System.out.println();
		
		int total = this.exam.total();
		double avg = this.exam.avg();
		System.out.println("총점 : "+total);
		System.out.printf("평균 : %.2f\n", avg);
		
	}

	//protected abstract void onPrint();
	
	//UI : Input Score by Console input
	public void input() {
		System.out.println("┌───────────────────────────────────┐");
		System.out.println("│              성적 입력              │");
		System.out.println("└───────────────────────────────────┘");
		Scanner scan = new Scanner(System.in);
		System.out.print("국어> ");
		exam.setKor(scan.nextInt());
		System.out.print("영어> ");
		exam.setEng(scan.nextInt());		
		System.out.print("수학> ");
		exam.setMath(scan.nextInt());
		
		if(listener != null)
			listener.onInput();
		
		
	}
	
}
