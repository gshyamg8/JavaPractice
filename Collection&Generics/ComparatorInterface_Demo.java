package JavaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Comparator Interface :

//In this example we want to sort the elements by only last digit of a number
//In order to do that, we have to change the sort() methods working.
//We also have a sort() method which takes 2 values as parameter
//#1 is list, #2 is object of comparator


class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		// This method we have to override
				//Here we will write our logic
		Integer o11 = (Integer)o1;
		Integer o22 = (Integer)o2;
		
		if(o11%10 > o22%10) {
			//When you say return 1, sort() will swap the elements in case of -1 it will not.
			return 1;
		}
		else {
			return -1;
		}
	}
}


public class ComparatorInterface_Demo {
	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		
		values.add(506);
		values.add(407);
		values.add(309);
		values.add(205);
		
		//We will create object of comparator in order to pass the value to sort() method
		//But we cannot create object of comparator as it's an interface
		//One way is to search for class which implements comparator interface
		//But we don't have any such class in Collection API, So we have to create our own class 
		
		Comparator<Integer> c = new MyComparator();
		
		//In order to reduce redundancy or to make code more efficient
		//we can make anonymous class instead of creating MyComparator class just to create object for Comparator interface
		
	/*This is how we can use anonymous class 
	 * 
		 Comparator<Integer> c1 = new Comparator<>(){
			 public int compare(Integer i1, Integer i2) {
				 return i1%10>i2%10?1:-1;
			 }
		 };
	*/
		
		//We can reduce lines of code even further, as Comparator is FuctionalInterface we can use lambda expression here.
		
		//IN lambda expression we don't have to specify type of the element.( that's why 
		//we will not mention type of i1 & i2)
		
		//return statement is also optional
		
		/*This is how we can use lambda expression
		 * 
		Comparator<Integer> c1 = (i1, i2) -> i1%10>i2%10?1:-1;
		*/
		Collections.sort(values, c);
		
		for(Integer i : values) {
			System.out.println(i);
		}
	}
}
