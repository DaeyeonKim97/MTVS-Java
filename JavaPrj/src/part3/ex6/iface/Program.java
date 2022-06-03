package part3.ex6.iface;

import java.io.IOException;
import java.util.Scanner;

import part3.ex6.iface.entity.Exam;
import part3.ex6.iface.entity.NewlecExam;
import part3.ex6.iface.ui.ConsoleListener;
import part3.ex6.iface.ui.ExamConsole;

public class Program {

	public static void main(String[] args) throws IOException, InterruptedException {
		NewlecExam exam = new NewlecExam();
		ExamConsole console = new ExamConsole();
		console.setExam(exam);
		NewlecExam.AA aa = exam.new AA();
		console.setListener(aa);
		
		console.input();
		console.print(()->{
			System.out.println("\n성적출력 banner test\n");
		});
		
		
		//익명 클래스로 인터페이스를 정의하는 법 (Anonymous Class) 
		console.setListener(new ConsoleListener() {
			@Override
			public void onInput() {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void onPrint() {
				// TODO Auto-generated method stub	
			}
		});
		
	}	
}
