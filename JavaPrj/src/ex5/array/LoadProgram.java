package ex5.array;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class LoadProgram {

	public static void main(String[] args) throws IOException {
		//1. 데이터의 개수 알아보기, 그 값은 count 변수를 준비해서 담을 것.
		int count = 0;
		{
			File srcFile = new File("res/data.txt");
			FileInputStream srcFis = new FileInputStream(srcFile);
			Scanner Fscan = new Scanner(srcFis);
			
			while(Fscan.hasNext()) {
				Fscan.next();
				count++;
			}
			
			Fscan.close();
			srcFis.close();
		}
		
		// 2. count의 값 크기의 배열 객체 생성하기. 참조명은 nums
		int [] nums = new int[count];
		
		// 3. nums 배열(큰방)에 res/data.txt의 데이터를 읽어서 로드한다.
		{
			File srcFile = new File("res/data.txt");
			FileInputStream srcFis = new FileInputStream(srcFile);
			Scanner Fscan = new Scanner(srcFis);
			
			for(int i=0 ; i< count; i++) {
				String x = Fscan.next();
				nums[i] = Integer.parseInt(x);
			}
			
			Fscan.close();
			srcFis.close();
		}
		
		for(int i=0 ; i< count; i++) {
			System.out.println(nums[i]);
		}
		
		
	}

}
