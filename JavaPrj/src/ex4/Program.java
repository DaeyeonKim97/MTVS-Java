package ex4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		File srcFile = new File("res/data.txt");
		FileInputStream srcFis = new FileInputStream(srcFile);		
		Scanner fscan = new Scanner(srcFis);
		
		File copyFile = new File("data-result2.txt");
		FileOutputStream copyFos = new FileOutputStream(copyFile);
		PrintStream fout = new PrintStream(copyFos);
		
		int sum = 0;
		
		while(fscan.hasNext()) {	
			String _x = fscan.next();
			int x = Integer.parseInt(_x);
			sum += x;
			
		}
		
		fout.printf("sum is %d\n",sum);
		
		fout.close();
		copyFos.close();
		
		fscan.close();
		srcFis.close();
	}

}