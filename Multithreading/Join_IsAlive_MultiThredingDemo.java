package JavaPractice;

//.isAlive() : used for checking thread is in Running staet or not 

public class Join_IsAlive_MultiThredingDemo {
	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread(() -> {
			for(int i = 0; i<5; i++) {
				System.out.println("Hi");
				try {Thread.sleep(500);}catch(Exception e) {}
			}
		});
		Thread t2 = new Thread(() -> {
			for(int i = 0; i<5; i++) {
				System.out.println("Hello");
				try {Thread.sleep(500);}catch(Exception e) {}
			}
		});
		
		t1.start();
		try {Thread.sleep(10);}catch(Exception e) {}
		t2.start();
		
		//If we just write any code, Print statement after above 2 threads,
		//And if we want to run that thing only after running those 2 threads,
		//Then we have to use Join method in order to do so, 
		//Join method will make main thread to stop until our created threads complete their execution
		
		
		System.out.println(t1.isAlive());
		t1.join();
		t2.join();
		
		System.out.println("Statement after join method");
		
		System.out.println(t1.isAlive());
	}
}
