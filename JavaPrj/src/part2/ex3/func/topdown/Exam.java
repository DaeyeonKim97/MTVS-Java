package part2.ex3.func.topdown;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Exam {
	//member variable	
	private int kor, eng, math;
	
	//Constructor
	Exam(int kor, int eng, int math){
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	Exam() {
		this(0,0,0);
	}
	
	//get Score
	public void getKor(int score) {
		kor = score;
	}
	public void getEng(int score) {
		eng = score;
	}
	public void getMath(int score) {
		math = score;
	}
	//get metaData
	public int total() {
		return kor + eng + math;
	}
	public double avg() {
		return total() / 3.0;
	}
	
	//Read Score from File
	public void read(String filePath) throws IOException {
		File srcFile = new File(filePath);
		FileInputStream srcFis = new FileInputStream(srcFile);
		Scanner fscan = new Scanner(srcFis);
		
		kor = Integer.parseInt(fscan.next());
		eng = Integer.parseInt(fscan.next());
		math = Integer.parseInt(fscan.next());
		
		fscan.close();
		srcFis.close();
	}
	
	public void save(String filePath) throws IOException {
		File outFile = new File(filePath);
		FileOutputStream outFos = new FileOutputStream(outFile);
		PrintStream fout = new PrintStream(outFos);
		
		fout.printf("%d %d %d",kor,eng,math);
		
		fout.close();
		outFos.close();
		
	}
	
	//UI : print Score
	public void print() {
		System.out.println("┌───────────────────────────────────┐");
		System.out.println("│              성적 출력              │");
		System.out.println("└───────────────────────────────────┘");
		
		System.out.printf(
				  "1. 국어 성적 : %2d\n"
				+ "2. 영어 성적 : %2d\n"
				+ "3. 수학 성적 : %2d\n\n",kor,eng,math);
	}
	
	//UI : Input Score by Console input
	public void input() {
		System.out.println("┌───────────────────────────────────┐");
		System.out.println("│              성적 입력              │");
		System.out.println("└───────────────────────────────────┘");
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 성적을 입력하세요: ");
		kor = scan.nextInt();
		System.out.print("영어 성적을 입력하세요: ");
		eng = scan.nextInt();
		System.out.print("수학 성적을 입력하세요: ");
		math = scan.nextInt();
		
	}
	
	
	
	
	
}
