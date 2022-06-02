package ex3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ScanProgram {

	public static void main(String[] args) throws IOException {
		File srcFile = new File("res/data.txt");
		FileInputStream srcFis = new FileInputStream(srcFile);		
		Scanner fscan = new Scanner(srcFis);
		
		int x;
		x = fscan.nextInt();
		System.out.println(x);
		
		String word;
		word = fscan.next();
		x = Integer.parseInt(word);
		System.out.println(x);
		
		
		fscan.close();
		srcFis.close();
	}

}
