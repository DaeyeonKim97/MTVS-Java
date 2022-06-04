package part1;

public class Ex4Program_Join_Waiting {

	public static void main(String[] args) throws InterruptedException {
		
		Thread th = Thread.currentThread();
		
		Runnable subMain = new Runnable() {
			@Override
			public void run() {
				System.out.printf("%s : %s\n", th.getName(), th.getState());
				print();
				System.out.printf("%s : %s\n", th.getName(), th.getState());
			}
		};
		
		
		Thread th1 = new Thread (subMain);
		th1.setName("sub1");

		System.out.printf("%s : %s\n", th1.getName(), th1.getState());
		
		th1.start();
		
		System.out.printf("%s : %s\n", th1.getName(), th1.getState());
		System.out.printf("%s : %s\n", th1.getName(), th1.getState());
		System.out.printf("%s : %s\n", th1.getName(), th1.getState());
		System.out.printf("%s : %s\n", th1.getName(), th1.getState());
		
		print();
		
//		th1.join();
				
		
		if(th1.isAlive())
			th1.join();
		
		System.out.println("========== Main Exit ==========");
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
