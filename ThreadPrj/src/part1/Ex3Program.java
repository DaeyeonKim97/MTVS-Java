package part1;

public class Ex3Program {

	public static void main(String[] args) {
		
		Runnable subMain = new Runnable() {
			@Override
			public void run() {
				print();
			}
		};
		
		Thread th1 = new Thread (subMain);
		Thread th2 = new Thread (subMain);
		th1.setName("sub1");
		th2.setName("sub2");

		
		th1.start();
		th2.start();
		
		print();
	}
	
	private static void print() {
		
		Thread thread = Thread.currentThread();
		
		for(int i=0; i<100; i++) {
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.printf("%s[id:%d]: %d\n",thread.getName(),thread.getId(),i);
		}
		
	}


}
