package FirstProgram;

class Calc{
	public int add(int ... i){ 
		// for modifying add functions to work for
		// any number of parameters we will use "..."
		// here i is itself a "array"
		//so, we will use enhanced for loop here to calculate sum.
		int sum = 0;
		for(int k : i) {
			sum = sum + k;
		}
		return sum;
	}
}
public class VarargsDemo {
	public static void main(String[] args) {
		Calc obj = new Calc();
		int add1 = obj.add(1,3);
		System.out.println("Sum of parameters passed is :" + add1);
		int add2 = obj.add(2,4,5,7);
		System.out.println("Sum of parameters passed is : " + add2);
	}
}
