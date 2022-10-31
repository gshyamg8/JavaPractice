package JavaPractice;


// One of the basic example why we need ABSTRACT keyword: 
// See it makes sense to create object of Pen or Pencil :
// But no sense in making object of Writing.
abstract class Writing{
	public abstract void write();
}
class Pen extends Writing{
	public void write() {
		System.out.println("I am writing via Pen");
	}
}

class Pencil extends Writing{
	public void write() {
		System.out.println("I am writing via Pencil");
	}
}

public class AbstractDemo2 {
	public static void main(String[] args) {
		Writing obj = new Pen();
		Writing obj2 = new Pencil();
		
		obj.write();
		obj2.write();
	}
}
