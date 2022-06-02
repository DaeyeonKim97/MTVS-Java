package ex2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Program {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/dykim/MTVS academy/eclipse/JavaPrj/res/data2.txt");
		FileOutputStream fos = new FileOutputStream(file);
	
		//PrintStream객체를 하나 생성하시오. 이름은 fout으로 하시요.
		PrintStream fout = new PrintStream(fos);
		
		fout.print("false");
		fout.close();
		
		System.out.println("작업완료\n");
	}

}
