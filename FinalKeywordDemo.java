package JavaPractice;


// Variables, Methods, Classes

//Once you assign the value to constant it will become constant
class F{
	int i =10;
	final int J = 12; //Constant : j will become constant
	final int DAY;
	public F() {
		i =20;
		//J = 32; 
		//Here we will get error 
		//The final field F.j cannot be assigned
		
		DAY = 22;// As DAY was not assigned previously it has now became constant 
		
	
	}
}

final class A{
	public void show() {
		System.out.println("In show method");
	}
}

//Have you observed what can happen here ?
// class B or say any other class can extend our class A and its members
// And they can take credit for the same, how ? let me elaborate more
//Suppose we created object of class B and called show method by that object.
// Then there's no way to know that show is of only class A's method. 
// SO, in such scenarios where you don't want to extend your class you will use
//Final keyword for that class.

/*
 * This will give error as final class can't be extended
 * class B extends A{
 * 
 * }
 */


/*
 * Suppose we want the ability to extends class but not to override any particular 
 * method of that class, then we will make that method final.
 * */
class C{
	final public void show(){
		System.out.println("In show of C");
	}
}

class D extends C{
	/*
	 * Following will give us error
	 * 
	 * public void show() {
	 * 
	 * }
	 */
}

public class FinalKeywordDemo {
	public static void main(String[] args) {
		F obj = new F();
		System.out.println("Value of i is : "+ obj.i);
		
		/*
		 * B obj1 = new B(); obj1.show();
		 */
		
	}
}
