package JavaPractice;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceDemo {
	public static void main(String[] args) {
		Set<Integer> valuesHash = new HashSet<>();
		
		valuesHash.add(5);
		valuesHash.add(9);
		valuesHash.add(10);
		valuesHash.add(9);
		valuesHash.add(43);
		valuesHash.add(32);
		// Set supports only unique elements
		//HashSet will not  give us values in sequence
		
		//If we want to achieve sequence, then we will use TreeSet
		
		System.out.println("Values after adding by HashSet : ");
		System.out.println();
		for(int i : valuesHash) {
			System.out.println(i);
		}
		
		Set<Integer> valuesTree = new TreeSet<>();
		
		valuesTree.add(5);
		valuesTree.add(9);
		valuesTree.add(10);
		valuesTree.add(9);
		valuesTree.add(43);
		valuesTree.add(32);
		System.out.println();
		System.out.println("Values after adding via TreeSet (sequence will be maintained): ");
		System.out.println();
		for(int i : valuesTree) {
			System.out.println(i);
		}
	}
}
