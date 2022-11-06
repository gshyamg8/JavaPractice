
package JavaPractice;

public class ExceptionHandlingDemo {
	public static void main(String[] args) {
		//int i = 9/0;
		
		//we will get following error
		/*
		 * Exception in thread "main"
		 *  java.lang.ArithmeticException: / by zero
		 * */
		
		//And after getting exception if we don't handle it 
		// the execution will break at that point of time
		
		//Therefore we will use try catch to handle exception
		
		try {
			//Here we will put critical statements
			
			//Try will throw the object of exception
			 
			int i = 9/0;
			//as soon as it will get exectipn it will jump to catch block
			//so below statement will not get printed
			
			//So if we want to print below statement no matter we will get error or not, we will just put below line in catch as well as here
			
			//But, this will lead to code redundancy, which is not good at all
			//That's why we will use "finally" block, 
			//which executes, no matter we got exception or not.
			
			//System.out.println("Hi after error");
					
			int a[] = new int[5];
			a[6] = 22;
		}
		catch(ArithmeticException a) {
			System.out.println("Cannot divide by zero");
			//System.out.println("Hi after error");
		}
		catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("Inisde ArrayException block");
		}
		catch(Exception e){
			
			System.err.println("Something wrong");
		}
		finally {
			System.out.println("Text in Finally block");
		}
		
		System.out.println("Execution did not stop due to exception Hanlding");
		
	}
}
