package JavaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Whenever we want to compare objects, we need to implement 
Comparable interface. 
 */


class Student1 implements Comparable<Student1>{
	int rollno, marks;
	String name;
	public Student1(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	
	
	public int compareTo(Student1 s) {
		return marks > s.marks?1:-1;
	}
	/*
	public void add(int roll, String name, int mark) {
		this.marks = mark;
		this.rollno = roll;
		this.name = name;
	}
	 */
	
}


public class ComparableInterface_Demo {
	public static void main(String[] args) {
		List<Student1> studs = new ArrayList<>();
		studs.add(new Student1(1, "Shyam", 80));
		studs.add(new Student1(2, "Bau", 75));
		studs.add(new Student1(3, "Vdon", 100));
		studs.add(new Student1(4, "Abha", 90));
		studs.add(new Student1(4, "Nikki", 80));
		
		System.out.println("List of students: ");
		for(Student1 s : studs) {
			System.out.println(s);
		}
		System.out.println("*************");
		
		//We will get error for sort method if we try sorting objects.
		//Collections.sort(studs);
		
		//Now we have implemented Comparable interface to our desired class
		//and also defined compareTo method based on our required logic.
		//Now .sort() method will work
		
		Collections.sort(studs);
		
		System.out.println("*************");
		System.out.println("Students sorted as per marks");
		System.out.println("*************");
		for(Student1 s : studs) {
			System.out.println(s);
		}
		
		//Suppose in future you want to change the logic on which you will sort the students
		//you can do that by passing another parameter in sort method
		//That parameter is object of comparator. 
		
		
		Collections.sort(studs, (i, j) ->i.name.length() > j.name.length()?1:-1);
		
		System.out.println("*************");
		System.out.println("Sorting based on length of name of students : ");
		System.out.println("*************");
		for(Student1 s : studs) {
			System.out.println(s);
		}
	}
}
