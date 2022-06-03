package part3.ex6.iface.entity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public abstract class Exam {
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
	
	//getters
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	
	//setters
	public void setKor(int score) {
		this.kor = score;
	}
	public void setEng(int score) {
		this.eng = score;
	}
	public void setMath(int score) {
		this.math = score;
	}
	
	
	//get metaData
	public int total() {
		return kor + eng + math;
	}
	public abstract double avg();
	
	//Read Score from File
	public void read(String filePath) throws IOException {
		File srcFile = new File(filePath);
		FileInputStream srcFis = new FileInputStream(srcFile);
		Scanner fscan = new Scanner(srcFis);
		
//		this.kor = Integer.parseInt(fscan.next());
//		this.eng = Integer.parseInt(fscan.next());
//		this.math = Integer.parseInt(fscan.next());
		
		String[] tmps = fscan.nextLine().split(",");
		kor = Integer.parseInt(tmps[0]);
		eng = Integer.parseInt(tmps[1]);
		math = Integer.parseInt(tmps[2]);
		
		
		fscan.close();
		srcFis.close();
	}
	
	public void save(String filePath) throws IOException {
		File outFile = new File(filePath);
		FileOutputStream outFos = new FileOutputStream(outFile);
		PrintStream fout = new PrintStream(outFos);
		
		fout.printf("%d %d %d",this.kor,this.eng,this.math);
		
		fout.close();
		outFos.close();
		
	}
	
	
}
