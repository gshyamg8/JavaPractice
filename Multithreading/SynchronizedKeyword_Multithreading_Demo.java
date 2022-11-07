package JavaPractice;

class Counter implements Runnable {
	int count = 0;
	
	// Here we will get issue of un-synchronization 
	// Because both threads will try to access run method at the same time
	//TO avoid this issue we will use synchronization
	
	//What we want ? : 
	/* If a particular thread is using some method, then it must not be used by any other thread
	 * 
	 * we can achieve this by using synchronized keyword
	 *  */
	
	public synchronized void run() {
		for(int i =0; i<1000; i++) {
			count++; // count = conut + 1
		}
		
		System.out.println("Count is : " + count);
	}
}

public class SynchronizedKeyword_Multithreading_Demo {
	public static void main(String[] args) {
		
		
		Runnable c = new Counter();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		
		t1.start();
		t2.start();
		 
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("Count : ");
	
		
	}
}
