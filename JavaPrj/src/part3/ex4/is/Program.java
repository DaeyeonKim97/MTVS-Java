package part3.ex4.is;

import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException, InterruptedException {
		NewlecExam exam = new NewlecExam(1,1,1,1);
		int total = exam.total();
		System.out.println(total);
	}	
}
