package part3.ex5.abst.ui;

import java.util.Scanner;

import part3.ex5.abst.entity.Exam;
import part3.ex5.abst.entity.NewlecExam;

public class NewlecExamConsole extends ExamConsole {
	public NewlecExamConsole() {
		super();
	}
	public NewlecExamConsole(Exam exam) {
		super(exam);
	}
		
	public void input() {
		super.input();
		Scanner scan = new Scanner(System.in);
		System.out.print("컴퓨터 성적을 입력하세요: ");
		int com = scan.nextInt();
		NewlecExam exam = (NewlecExam) this.getExam();
		exam.setCom(com);
	}
	
	public void print() {
		super.print();  
	}
	
	@Override
	protected void onPrint() {
		int com =  ((NewlecExam)this.getExam()).getCom();
		System.out.printf("4. 컴퓨터 성적 : %2d\n", com);
		
	}

	
}
