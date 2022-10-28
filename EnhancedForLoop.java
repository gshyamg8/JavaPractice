package FirstProgram;

public class EnhancedForLoop {
	public static void main(String[] args) {
		int b[] = {55,66,77,88};
		
		for(int j : b) {
			System.out.println(j);
		}
		
		int a[][] = {
				{1,2,3,4},
				{2,3},
				{4,6,7,8,9,10}
		};
		
		System.out.println("Prining (uneven 2D) / (Jagged) array : ");
		for(int k[]: a) {
			for(int z : k) {
				System.out.print(" " + z);
			}
			System.out.println();
		}
		

	}
	

}
