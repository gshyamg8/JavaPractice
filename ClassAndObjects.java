package FirstProgram;

import java.util.Scanner;


class Calculator{
	int num1, num2, Addition, Subtraction, Multiplication;
	float Division, Reminder;
	
	public void perform() {
		Addition = num1 + num2;
		Subtraction = num1 - num2;
		Multiplication = num1 * num2;
		Division = (float)num1 / num2;
		Reminder = num1 % num2;
	}
}
public class ClassAndObjects {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator obj = new Calculator();
		
		System.out.println("Enter num1 : ");
		obj.num1 = sc.nextInt();
		
		System.out.println("Enter num2 : ");
		obj.num2 = sc.nextInt();
		
		obj.perform();
		System.out.println(obj.Addition);
		System.out.println(obj.Subtraction);
		System.out.println(obj.Multiplication);
		System.out.println(obj.Division);
		System.out.println(obj.Reminder);
		
	}
} 
