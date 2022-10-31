package FirstProgram;

import java.util.*;

// method overloading

class Over{
	int num1, num2;
	
	public void Add(int i, int j){
		
		System.out.println("Addition of 2 numbers is : " +( i + j ));
		
	}
	
	public void Add(int i, int j, int k) {
		System.out.println("Addition of 3 numbers is : "+ (i + j + k));
	} 
}
public class MethodOverloading {

	public static void main(String[] args) {
		
		Over obj = new Over();
		obj.Add(5, 6);
		obj.Add(5, 5,2);
		
	}
}
