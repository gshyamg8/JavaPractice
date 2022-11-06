package JavaPractice;

//In order to make code more efficient where ever possible 
//should be our goal.

//When ever you'll have class which will be used only once
//why to create separate class for that ? 

/*
 * In this example Hi & Hello are used only once and that too for implementing Runnable
 * 
 * SO no need to create these two classes
 * class Hii implements Runnable{
	public void run(){
		for(int i = 0; i<5; i++) {
			System.out.println("Hi");
			try {Thread.sleep(500);}catch(Exception e) {} 

		}
	}
}

class Helloo implements Runnable{
	public void run(){
		for(int i = 0; i<5; i++) {
			System.out.println("Hello");
			try {Thread.sleep(500);}catch(Exception e) {} 
		}
	}
}
 * */


public class LambdaexpressionMultithreading {
	public static void main(String[] args) {
		
		/*As Runnable is Functional Interface 
		 * We can use Lambda expression here to make code even more efficient
		 * */
		
	/*	Runnable hi = new Runnable() {
			public void run() {
				for(int i = 0; i<5; i++) {
					System.out.println("Hi");
					try {Thread.sleep(500);}catch(Exception e) {}
				}
			}
		};
		
	*/
		
	
		/*
		Runnable hi = () -> {
						for(int i = 0; i<5; i++) {
							System.out.println("Hi");
							try {Thread.sleep(500);}catch(Exception e) {}
						}
					};
					
		*/
		
		
	/*	Runnable hello = new Runnable() {
			public void run() {
				for(int i = 0; i<5; i++) {
					System.out.println("Hello");
					try {Thread.sleep(500);}catch(Exception e) {}
				}
			}
		};
	*/
	
		/*
		Runnable hello = () -> {
						for(int i = 0; i<5; i++) {
							System.out.println("Hello");
							try {Thread.sleep(500);}catch(Exception e) {}
						}
					};
					
		*/
		
		
					/*If we observe closely,
					 * We don't even require to create Runnable object
					 * As we are using them only once, So we will just replace them witj
					 * below code where we have passed parameters to new Thread(Hi)*/
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
		
	}

}
