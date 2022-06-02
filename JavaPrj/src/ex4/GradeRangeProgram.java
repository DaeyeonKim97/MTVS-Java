package ex4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class GradeRangeProgram {

	public static void main(String[] args) throws IOException {
		File srcFile = new File("res/data-grade.txt");
		FileInputStream srcFis = new FileInputStream(srcFile);
		Scanner Fscan = new Scanner(srcFis);
		
		//love
		
		
		while(Fscan.hasNext()) {
			String nextWord = Fscan.next();
			switch(nextWord) {
			case "A+":
				System.out.println("90~100");
				break;
			case "A":
				System.out.println("80~90");
				break;
			case "B+":
				System.out.println("70~80");
				break;
			case "B":
				System.out.println("60~70");
				break;
			default:
				System.out.println("--");
			
			}
			
		}
		
				
		Fscan.close();
		srcFis.close();
	}

}
