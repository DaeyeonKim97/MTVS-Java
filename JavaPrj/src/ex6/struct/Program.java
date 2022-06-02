package ex6.struct;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		
		//data 개수
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
		
		
		GangwonCovid19Status[] statuses = new GangwonCovid19Status[dataCount];
		
		for(int i=0; i<dataCount; i++){
			statuses[i] = new GangwonCovid19Status();
		}
		
		{
			File covidFile = new File("res/covid19.txt");
			FileInputStream covidFis = new FileInputStream (covidFile);
			Scanner fscan = new Scanner(covidFis);
			
			fscan.nextLine();
			
			int index = 0;
			
			while(fscan.hasNextLine()) {
				String line = fscan.nextLine();
				String[] cols = line.split(",");
				
				statuses[index].city = cols[0];
				statuses[index].date = cols[1];
				statuses[index].confirmed = Integer.parseInt(cols[2]);
				
				index ++;
				
			}
			
			fscan.close();
			covidFis.close();
		}
		
		
		String city = "춘천";
		
		for(int i=0; i<dataCount; i++) {
			
			if(statuses[i].city.equals(city))
				System.out.printf("도시명 : %s // 확진시기 : %s // 확진자수 : %d \n",statuses[i].city,statuses[i].date,statuses[i].confirmed);
		}
		
		
	}

}
