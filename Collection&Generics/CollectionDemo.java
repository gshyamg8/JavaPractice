package JavaPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {
	public static void main(String[] args) {
		Collection values = new ArrayList();
		values.add(4);
		values.add(6);
		values.add(10);
		System.out.println(values);
		
		System.out.println("*************");
		
		//as we know "collection" doesn't support index number
		//i.e. we cannot fetch values with index number
		
		//Iterator : special interface responsible to fetch values from collection
		//i.e. iterator iterate over collection
		
		// methods of iterator : 
		//#1 .hasNext();, #2 .next();
		
		Iterator it = values.iterator();
		//values.iterator(); this will return object of iterator
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("*************");
		List values2 = new ArrayList();
		
		values2.add(20); //we are passing objects
		values2.add(30);
		values2.add(40);
		values2.add(60);
		
		
		//add(index, element)
		values2.add(2, 100);
		
		for(int i = 0; i<values.size(); i++) {
			System.out.println(values2.get(i));
		}
		System.out.println("*************");
		
		System.out.println("Another way of traversing through List :");
		
		for(Object o : values2) {
			System.out.println(o);
		}
		System.out.println("*************");
		
		//generics
		List<Integer> values3 = new ArrayList<>();
		values3.add(32);
		values3.add(40);
		values3.add(56);
		values3.add(45);
		
		//values3.add("Hi"); // this will give error because of Generics
		
		Collections.sort(values3);
		
		System.out.println("List elements in sorted format: ");
		for(Integer i : values3) {
			System.out.println(i);
		}
		
	}
}
