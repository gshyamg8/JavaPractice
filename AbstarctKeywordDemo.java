package JavaPractice;

//Whenever you make a class abstract you can't create object of that class





abstract class Human{
	//If we don't want to define method, only if we want to declare the method
	//then we will have to use abstract keyword to declare a method
	// if we are defining any method then method will have to use abstract keyword
	// And then class has to be declared abstract in that case
	
	public abstract void eat();
	
	public void walk() {
		
	}
}

//If we are using another class which is not abstract to use as Abstract class's subclass
//then we must define the methods which we've just declared in that abstract superclass
//

class Men extends Human{  //Concrete Class 
	public void eat(){
		
	}
}

public class AbstarctKeywordDemo {

		//below statement will give error.
		//Error is not in creating reference, error is in creating object
	//i.e. in creating instance ( here in : new Human() )
	
	//Let's understand this in following way: 
	// Men can belong to Human class 
	// Women can also belong to Human class. That's why it's allowed 
	
	//Human obj = new Human();
	 Human obj1 = new Men(); 
	 
	
}
