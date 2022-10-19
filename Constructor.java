package FirstProgram;


//constructor is a member method
// Has same name as class name
// It will never return anything
// It will be used to allocate memory
// As soon as we create object constructor will be called by itself
// We can have different constructors in same class (Provided they have different parameters) 
// It's is called constructor overloading

import java.util.Scanner;

class A{
	
	int i;
	float j;
	
	public A() {
		i = 5;
		j = 2.0f;
		System.out.println("Inside default constructor");
	}
	
	public A(int n) {
		i = n;
		System.out.println("Inside parameterised constructor");
	}
	
}

public class Constructor {
	public static void main(String[] args) {
		
		//default constructor will called
		A obj = new A();
		System.out.println("Value of i in default constructor is :" + obj.i);
		
		//Parameterised constructor will be called
		A obj2 = new A(10);
		System.out.println("Value of i in parametersied constructor is : " + obj2.i);
		
	}

}
