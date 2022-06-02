package ex1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/dykim/MTVS academy/eclipse/JavaPrj/data.txt");
		FileOutputStream fos = new FileOutputStream(file);
		
		fos.write(67);
		
		fos.close();
		System.out.println("작업종료\n");
	}

}
