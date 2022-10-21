package FirstProgram;

import java.util.*;

// IF you don't want to make a variable object specific you make make it STATIC
// Then that variable will be same for all the object we will create for that class

class Employee{
	int Eid, salary;
	static String ceo;
	
	public void Details(){
		System.out.println(Eid);
		System.out.println(salary);
		System.out.println(ceo);
	}
}
public class StaticKeyword {
	public static void main(String[] args) {
		 Employee shyam = new Employee();
		 Employee bau 	= new Employee();
		 
		 shyam.Eid = 1;
		 bau.Eid   = 2;
		 
		 shyam.salary = 80000;
		 bau.salary = 160000;
		 
		 shyam.ceo = "Vishwesh";
		 bau.ceo = "Vishwesh";
		 
		 System.out.println("Employee details :");
		 shyam.Details();
		 System.out.println("Employee details :");
		 bau.Details();
		 
		 //Suppose we have to change the CEO of the company then 
		 //just by changing the ceo of any other object will not help us reflecting CEO for all the objects.
		 //That's why use static variable for CEO
		 
		 shyam.ceo = "Vdon";
		 
		 System.out.println("Employee details :");
		 shyam.Details();
		 System.out.println("Employee details :");
		 bau.Details();
		 
	}
}
