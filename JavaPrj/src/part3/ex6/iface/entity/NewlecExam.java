package part3.ex6.iface.entity;

import java.util.Scanner;

import part3.ex6.iface.ui.ConsoleListener;

//outer class
public class NewlecExam extends Exam{
	private int com;
	
	public NewlecExam() {
		this(0,0,0,0); // 코드집중
	}
	
	public NewlecExam(int kor, int eng, int math, int com) {
		super(kor,eng,math);
		this.com = com;
	}
	
	public int getCom() {
		return com;
	}
	public void setCom(int com) {
		this.com = com;
	}
	
	@Override
	public int total() {
		return super.total()+this.com;
	}
	@Override
	public double avg() {
		return total()/4.0;
	}
	
	public void onPrint() {
		
	}
	
	//Interface
	//inner class 혹은 nested class라고 부름.(내부클래스/중첩클래)
	public class AA implements ConsoleListener{
		@Override
		public void onPrint() {
			System.out.println("4. 컴퓨터 : "+ NewlecExam.this.com);
		}
		
		@Override
		public void onInput() {
			System.out.print("컴퓨터> ");
			Scanner scan = new Scanner(System.in);
			NewlecExam.this.com = scan.nextInt();	
		}
	}
}
