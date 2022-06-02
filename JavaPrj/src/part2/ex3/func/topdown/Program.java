package part2.ex3.func.topdown;

import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException, InterruptedException {
		// 사용자로부터 성적(국어, 영어, 수학)을 입력 받거나 그것을 계산해서 출력해주고
		// 때로는 영구저장을 할 수 있도록 파일로 저장 또는 읽어오는 프로그램
		
		Exam exam = new Exam();
		
		programLoop:
		while(true) {
			int menu = inputMenu();
			
			switch(menu) {
			case 1:
				exam.input();
				break;
			case 2:
				exam.print();
				break;
			case 3:
				exam.read("res/data-exam.txt");
				break;
			case 4:
				exam.save("res/data-exam.txt");
				break;
			case 5:
				//exitProgram();
				break programLoop;
			default:
				break;
			}
			
			//break programLoop;
		}
		
		System.out.println("exit 0");
	}

	static void exitProgram() {
		System.exit(0);		
	}


	static int inputMenu() throws InterruptedException {
		Thread.sleep(1000);
		
		System.out.println("┌───────────────────────────────────┐");
		System.out.println("│              메인 메뉴              │");
		System.out.println("└───────────────────────────────────┘");
		System.out.println(
				  "1. 성적 입력\n"
				+ "2. 성적 출력\n"
				+ "3. 성적 읽어오기\n"
				+ "4. 성적 저장\n"
				+ "5. 종료\n");
		Scanner scan = new Scanner(System.in);
		int inputValue = scan.nextInt();
		
		
		return inputValue;
	}
	
}
