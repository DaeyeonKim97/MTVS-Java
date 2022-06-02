public class Program{
	public static void main(String[] args){
		// 국어성적 3개를 초기화
		int kor1 = 30;
		int kor2 = 40;
		int kor3 = 50;

		// 총점을 구하는 코드
		int total = kor1 + kor2 + kor3;

		// 평균을 구하는 코드
		float avg;

		avg = total / 3;
		
		System.out.printf("total is asdf %d\n",total);
		System.out.printf("avg is %f\n", avg);

	}
}
