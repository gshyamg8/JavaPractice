package JavaPractice;

//Method Overriding is RUNTIME POLYMORPHISM

//Method Overloading is COMPILE TIME POLYMORPHISM

class Abc{
	public void show() {
		System.out.println("In superclass Abc");
	}
}

class Bac extends Abc{
	public void show() {
		System.out.println("In subclass Bac");
	}
	public void config() {
		System.out.println("In Config method of class Bac");
	}
}

class Cab extends Abc{
	public void show() {
		System.out.println("In subclass Cab");
	}
}

public class DynamicMethodDispatchDemo {
	public static void main(String[] args) {
		// We can even create reference of Superclass and object of its subclass
		
				Abc obj10 = new Bac(); //This will happen at RUNTIME //Therefore RUNTIME POLYMOROHISM
				
				//Now question arises which show method will be called.
				//Answer: It doesn't matter which reference you have, only Which 
				// whose object is there.
				// So, when we will call obj.show(), it will call show method of class Bac.
				//Here Abc is just reference & Bac is implementation
				
				//Which show method to call also decided at RUNTIME
				obj10.show();
				
				//So what's the difference then you may ask?
				//Here we can call only methods or access variables which are there in superclass(or which are present in reference)
				//So here by object "obj10" we cannot call method "config" even though object is of Bac class
				
				//obj10.config();  // this will give us error
				
				//Now we will use reference of superclass Abc "obj10" to point to object of class Cab
				
				
				obj10 = new Cab();
				
				obj10.show(); //Dynamic Method Dispatch
				
				//So here when you change the object it is changing the calling of functions which it was calling before 
				//So it is called Dynamic Method Dispatch
				
	}
}
