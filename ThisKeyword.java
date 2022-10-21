package FirstProgram;

import java.util.*;

//Local variable always shadows the instance variable
//When we have local and instance variable of the same name : We use "this" keyword

class Test{
	int num1, num2;
	int result;
	
	public Test(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
}

public class ThisKeyword {

	public static void main(String[] args) {
		Test obj = new Test(4,5);
		
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		
		
	}
}
