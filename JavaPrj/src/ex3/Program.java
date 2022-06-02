package ex3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		File srcFile = new File("res/data.txt");
		FileInputStream srcFis = new FileInputStream(srcFile);		
		
		File copyFile = new File("res/data-copy.txt");
		FileOutputStream copyFos = new FileOutputStream(copyFile);
		
		boolean done = false;
		
		while(!done)
		{
			int x = srcFis.read(); //byte data를 읽어온다고 쓰여있음 (ASCII 코드)
			if(x<0) {
				done = true;
				break;
			}
			if(x==' ') {
				System.out.print('\n');
				copyFos.write('\n');
				continue;
			}
			System.out.print((char)x);
			copyFos.write(x);
		}
		
		srcFis.close();
		copyFos.close();
		
	}

}
