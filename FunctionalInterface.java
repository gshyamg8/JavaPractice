package FirstProgram;

//Types of INTERFACES :

/*
 * #1 Normal : Has more than 1 method
 * #2 Single abstract  : Only 1 method - Functional Interface - Lambda Expression
 * #3 Marker : Doesn.t have any method
 * */
//Serializable interface : is inbuilt java interface, is Marker interface

//Below interface "Functional"is functional interface as it has only 1 method
interface Functional{
	void show();
}

// As we now know its functional interface and if we want to create object
//of interface we will just do it by creating anonymous inner class
// But that code what we will write is also unnecessary: because just to define show 
//we don't need to write below : 

/*
 * Functional obj = new Functional()
					{
						public void show()
						{
							System.out.println("In anynymous class");
						}					
					} 
 * */

// Then you may ask what to write instead of this : 
// See following : -->

public class FunctionalInterface {
	public static void main(String[] args) {
		Functional obj = () -> System.out.println("In Lamba expression");
		obj.show();
	}
	
}
