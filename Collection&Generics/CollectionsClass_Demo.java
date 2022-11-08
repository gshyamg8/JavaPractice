package JavaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//List are mutable
//Collections in a class


public class CollectionsClass_Demo {
	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		
		values.add(50);
		values.add(40);
		values.add(30);
		values.add(20);

		for(Integer i : values) {
			System.out.println(i);
		}
		System.out.println("*********");
		
		//If we want to sort the values in List,
		//We can use "Collections" class, 
		//sort() is static method of Collections class
		
		Collections.sort(values);
		System.out.println("Values after sorting using Collections class");
		
		System.out.println("*********");
		
		for(Integer i : values) {
			System.out.println(i);
		}
		
		System.out.println("*********");
		Collections.reverse(values);
		System.out.println("Values after sorting in reverse order using Collections class");
		System.out.println("*********");
		
		for(Integer i : values) {
			System.out.println(i);
		}
		
		
	}
}
 