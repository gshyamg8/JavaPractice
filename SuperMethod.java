package FirstProgram;

//By default there is super method present: so if we have to run constructor of superclass of our choice
//then we will modify super method according to our needs.

class AB{
	public AB() {
		System.out.println("In AB");
	}
	public AB(int i) {
		System.out.println("In AB int");
	}
}

class B extends AB{
	public B() {
		super();
		System.out.println("In B");
	}
	public B(int i) {
		
		super(i);
		System.out.println("In B int");
	}
}


public class SuperMethod {
	public static void main(String[] args) {
		
		B obj1 = new B();
		System.out.println("*****************");
		B obj = new B(5);
		
	}
}
