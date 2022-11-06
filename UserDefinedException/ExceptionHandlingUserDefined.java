package JavaPractice;


public class ExceptionHandlingUserDefined {
	public static void main(String[] args) {
		int i, j;
		i = 0;
		j = 1;
		
		try {
			int k = i/j;
			if (k ==0) {
				//If there's no any exception we call call it by following statement
				//UserException is our own defined exception
				
				throw new UserException("This is not possible");
				
			}
			System.out.println(k);
		}
		catch(UserException e) {
			System.out.println( e.getMessage());
		}
	}
}
