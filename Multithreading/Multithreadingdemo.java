package JavaPractice;

import java.util.Iterator;

//in java we can't achieve multiple inheritance
// That's why we use interface "Runnable"


//public class Multithreadingdemo extends Thread{
//	int values[] = {2,4,6,8}; 
//	public void run() {
//		for (int i = 0; i<5; i++) {
//			values[i] = values[i] * 2; 
//			
//		}
//	}
//}

public class Multithreadingdemo implements Runnable{
	int values[] = {2,4,6,8}; 
	public void run() {
		for (int i = 0; i<5; i++) {
			values[i] = values[i] * 2; 
			
		}
	}
}
 