package part3.ex5.abst;

import java.io.IOException;
import java.util.Scanner;

import part3.ex5.abst.entity.NewlecExam;
import part3.ex5.abst.ui.NewlecExamConsole;

public class Program {

	public static void main(String[] args) throws IOException, InterruptedException {
		NewlecExam exam = new NewlecExam(1,1,1,1);
		NewlecExamConsole console = new NewlecExamConsole(exam);
		console.setExam(exam);
		
		console.input();
		console.print();
	}	
}
