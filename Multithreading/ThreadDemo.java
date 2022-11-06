package JavaPractice;

class Hi extends Thread{
	public void run(){
		for(int i = 0; i<5; i++) {
			System.out.println("Hi");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}

class Hello extends Thread{
	public void run(){
		for(int i = 0; i<5; i++) {
			System.out.println("Hello");
			try {Thread.sleep(500);}catch(Exception e) {} 
		}
	}
} 

public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		Hi hi = new Hi();
		Hello hello = new Hello();
		
		//when you use .start(), internally it will call .run() method
		
		//SO please use run method perform the Task you want to do,
		//Here in our example our task was to print Hi & Hello reapectively,
		
		hi.start();
		hello.start(); 
		
	} 
}
