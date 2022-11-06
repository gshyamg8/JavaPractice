package JavaPractice;

public class ThreadPriorityDemo {
	public static void main(String[] args) throws Exception{
		Thread t1 = new Thread(() ->{
			for(int i = 0; i<5; i++) {
				System.out.println("Hi");
				try {Thread.sleep(500);}catch(Exception e) {}
			}
		}, "Hi Thread");
		
		Thread t2 = new Thread(() ->{
			for(int i = 0; i<5; i++) {
				System.out.println("Hello");
				try {Thread.sleep(500);}catch(Exception e) {}
			}
		}, "Hello Thread");
			
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		//By Default thread's priority will be 5
		//Range of priorities is from 1 - 10
		// 1 = least Priority
		// 10 = Highest Priority
		System.out.println("Priority of thread Hi Thread by default : " + t1.getPriority());
		System.out.println("Priority of thread Hi Thread by default : " + t2.getPriority());
		
		//t1.setPriority(1); //or we can use predefined constants
		t1.setPriority(Thread.MIN_PRIORITY);
		
		//t2.setPriority(10);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		System.out.println("Priority of thread Hi Thread after changing  : " + t1.getPriority());
		System.out.println("Priority of thread Hi Thread after changing  : " + t2.getPriority());
		
		
		
		t1.start();
		try {Thread.sleep(10);}catch(Exception e){}
		t2.start();
		
		t1.join();
		t2.join();
		
	}
}
