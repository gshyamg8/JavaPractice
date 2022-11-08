package JavaPractice;
import java.util.ArrayList;
import java.util.Collection;

/*
 *  size of array is fixed.
 *  If you know size is fixed go for array (it is fast than collection)
 *  
 *  Collection : interface
 *  ArrayList  : class which implements Collection indirectly,
 *  			 because, ArrayList implements List(Which is interface) and List extends Collection
 *  
 * */


public class Collection_GenericsTheory {
	public static void main(String[] args) {
		Collection value = new ArrayList();
		value.add(1);
		value.add(10);
		value.add("Shyam");
		
		//As you can see above we can add different type of data in our Collection/ ArrayList.
		//If we want to be specific, then we will use GENERICS.
		
		//Collection<Integer> value2 = new ArrayList<Integer>();
		Collection<Integer> value2 = new ArrayList<>();
		//value2.add("Abc");  //This will give error
		
		//AS we have seen above, Collection cannot work with Index numbers
		
		//So we will have to use LIST/SET for that
		//class which List implements : ArrayList
		//class which Set implements : HashSet
		
		//When you don't want duplicate values, use Set instead of List
		// Sequence will not be maintained in Set (HashSet), but in List sequence is maintained
		
		//In Set's TreeSet class, everything we will get will be in sorted format
		
		/*
		 * MAP : key, value
		 * 
		 * Map is also an interface, so we have to search for class which implements Map
		 * is is HashMap and also HashTable
		 * Map<Integer, String>
		 * */
		
;;	}
}


