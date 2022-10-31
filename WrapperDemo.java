package JavaPractice;

//For all primitive data types we have wrapper class for that.



public class WrapperDemo {
	public static void main(String[] args) {
		int i = 10; // Primitive data type 
		// here "i" is primitive variable
		//here "i1" is reference variable
		
		Integer i1 = new Integer(50); // Wrapper class
		
		// Whenever we are putting primitive variable inside object is called Boxing/Wrapping
		
		Integer i2 = new Integer(i); //Boxing/Wrapping
		
		//Autoboxing /Autowrapping
		Integer i3 = i;
		
		//Unboxing/ Unwrapping
		int j = i1.intValue();
		int k = i2.intValue();
		
		//Autounboxing/ Autounwrapping
		int m = i3;
		
		System.out.println("Value of j is : " + j);
		System.out.println("Value of k is : " + k);
		
		String str = "246";
		//As parseInt is static method we have to use "(Class name).(method name) format"
		
		int n = Integer.parseInt(str);
		System.out.println("Value of n is : " + n );
		
		}		
}
