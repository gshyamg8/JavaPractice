package JavaPractice;

class Student{
	//Variables should always be private 
	//and methods who are accessing these variales should be public.
	
	
	//Whenever we are binding our data with methods is called encapsulation
	private int roll;
	private String name;
	
	//Getter and Setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRoll(int r) {
		this.roll = r;
	}
	public int getRoll() {
		return roll;
	}
}
public class EncapsulationDemo {
	public static void main(String[] args) {
		Student s1 = new Student();
		
		//If we want to access name and roll no only from methods of class "Student"
		//then we have to put some kind of encapsulation : we will create getter and setter methods
		//and will also make those variables private
		
		
		s1.setRoll(10);
		s1.getRoll();
		System.out.println("Roll number is : " + s1.getRoll());
		
		
	}
}
