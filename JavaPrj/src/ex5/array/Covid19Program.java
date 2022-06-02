package ex5.array;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Covid19Program {

	public static void main(String[] args) throws IOException {
		
		// 1. 데이터 개수 얻기 
		int dataCount = 0;
		
		{
			File covidFile = new File("res/covid19.txt");
			FileInputStream covidFis = new FileInputStream (covidFile);
			Scanner fscan = new Scanner(covidFis);
			
			fscan.nextLine();
			
			while(fscan.hasNextLine()) {
				fscan.nextLine();
				dataCount++;
			}
			
			fscan.close();
			covidFis.close();
		}
		
		// 2. 데이터 로드 
		
		String[] cities = new String[dataCount];
		String[] dates = new String[dataCount];
		int[] confirmeds = new int[dataCount];
		{
			File covidFile = new File("res/covid19.txt");
			FileInputStream covidFis = new FileInputStream (covidFile);
			Scanner fscan = new Scanner(covidFis);
			
			fscan.nextLine();
			
			int index = 0;
			
			while(fscan.hasNextLine()) {
				String line = fscan.nextLine();
				String[] cols = line.split(",");
				
				cities[index] = cols[0];
				dates[index] = cols[1];
				confirmeds[index] = Integer.parseInt(cols[2]);
				
				index ++;
				
			}
			
			fscan.close();
			covidFis.close();
		}
		
		// 3. 데이터 필터
		
		String city = "춘천";
		
		for(int i=0; i<dataCount; i++) {
			
			if(cities[i].equals(city))
				System.out.printf("도시명 : %s // 확진시기 : %s // 확진자수 : %d \n",cities[i],dates[i],confirmeds[i]);
		}
		
	}

}
