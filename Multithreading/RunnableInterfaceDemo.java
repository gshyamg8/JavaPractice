package JavaPractice;

import java.util.Iterator;

//in java we can't achieve multiple inheritance
// That's why we use interface "Runnable"

//Runnable is a functional Interface : 
//It has only 1 method : (run)

//public class RunnableInterfaceDemo extends Thread{
//	int values[] = {2,4,6,8}; 
//	public void run() {
//		for (int i = 0; i<5; i++) {
//			values[i] = values[i] * 2; 
//			
//		}
//	}
//}

class Hii implements Runnable{
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
public class RunnableInterfaceDemo{
	public static void main(String[] args) {
		Runnable hi = new Hii();
		Runnable hello = new Helloo();
		
		Thread t1 = new Thread(hi);
		Thread t2 = new Thread(hello);
		
		t1.start();
		try {Thread.sleep(10);}catch(Exception e) {}
		t2.start();
	}
}
 