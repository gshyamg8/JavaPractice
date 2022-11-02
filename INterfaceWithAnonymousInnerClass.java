package FirstProgram;

interface I{
	void show();
}
// Now what usually we have in mind 
//to create object of interface we need to create a class which implements 
//interface
// But, even without creating a normal class, we can do it by creating 
// a anonymous inner class. 

public class INterfaceWithAnonymousInnerClass {
	public static void main(String[] args) {
		I obj = new I() {
			public void show() {
				System.out.println("In anynymous class");
			}
		};
		obj.show();
	}
}
