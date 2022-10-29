package FirstProgram;
import java.util.*;

//Inheritance

// IMP : Java doesn't support MULTIPLE INHERITANCE


// IS-A, HAS-A relation: 
// The class in which we are creating object of another class has HAS-A relation 
// And the class which is extending another class (for ex: CalcuMultiIN) has IS-A relation)

class Calcu{   // super class / parent / base  of sub class CalcuIN
	public Calcu() {
		System.out.println("In Superclass Calcu");
	}
	
	public int add(int ... i) {
		int sum = 0;
		for(int j : i) {
			sum = sum + j;
		}
		return sum;
	}
	
}

// In class calcu1 theere's redundancy in code of add method:
// SO we will simply fetch that add feature from class Calcu to some other class
// By using INHERITANCE concepts.

class Caclu1{
	
	public int add(int ... i) {
		int sum = 0;
		for(int j : i) {
			sum = sum + j;
		}
		return sum;
	}
	public int Mul(int ... i) {
		int mul = 1;
		for(int j : i) {
			mul = mul * j;
		}
		return mul;
	}
}

class CalcuIN extends Calcu{   //CalcuIN in sub/ child/ derived class of parent class Calcu
	public CalcuIN(){
		System.out.println("In Subclass CalcuIN");
	}
	public int sub(int ... i) {
		int sub = 0;{
		for(int j : i) {
			
			sub = j - sub;
			
		}
		return sub;
		}
	}
}

// Multi-Level Inheritance
class CalcuMultiIN extends CalcuIN{
	public int multi(int ... i) {
		int multi = 1;
		for(int j : i) {
			multi = multi * j;
		}
		return multi;
	}
}

public class InheritanceDemo {
	public static void main(String[] args) {
		//Calcu obj = new Calcu();
		
		//int result = obj.add(5,4,10,1);
		//System.out.println(result);
		
		// Here take note of output : 
		//when we create object of subclass it will also call constructor of superclass first then its own constructor. 
		CalcuIN obj1 = new CalcuIN();
		
		// Here we are inheriting add method of Calcu class to CalcuIN class
		
		int resultadd = obj1.add(5,12,12);
		int resultsub = obj1.sub(12,5);
		
		System.out.println("**************************");
		System.out.println("Addition is : " + resultadd);
		System.out.println("SUbtraction is : "+ resultsub);
		
		CalcuMultiIN obj2 = new CalcuMultiIN();
		System.out.println("*************************");
		int resultadd1 = obj2.add(1,2,3);
		int resultsub1 = obj2.sub(5,20);
		int resultmul1 = obj2.multi(2,3,4);
		System.out.println("Addition is : " + resultadd1);
		System.out.println("SUbtraction is : "+ resultsub1);
		System.out.println("Multiplication is : " + resultmul1);
		
	}
}
