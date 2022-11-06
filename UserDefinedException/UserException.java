package JavaPractice;

//to create our own exception  this file is important.

//we have to create constructor of our user defined exception
// and to get-message whatever we want 
// we have to call super method and pass that string message to it.
public class UserException extends Exception {
	
	public UserException(String s) {
		super(s);
	}
}
