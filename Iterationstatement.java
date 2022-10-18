package FirstProgram;

import java.util.Scanner;

public class Iterationstatement {
	
	public static void main(String[] args) {
	
		//loops : while, do while, for, for-each
		int b = 0, c = 0;
		
		//when know starting and ending point use for loop
		/*
		for(int i =0;i<5;i++) {
			System.out.println("Hi");
		}
		
		while(b<6) {
			System.out.println("While loop");
			b++;
		}
		*/
		
		
		/*
		int test = 65;
		char t2 = (char)test;
		System.out.println(t2);
		*/
		/* Nested for loop */
		/*
		 * A
		 * A B
		 * A B C 
		 * A B C D
		 * 
		 * */
		/*
		for(int i = 1; i<=4; i++) {
			for(int j = 1; j<=i ; j++) {
				System.out.print((char)(j+64) + " ");
			}
			System.out.println();
		}
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Hollow sqaure side: ");
		int side = sc.nextInt();
		
		for(int i = 1; i<=side; i++) {
			for(int j = 1; j<= side; j++) {
				if(i == 1 || i == side || j == 1 || j == side) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				}
			System.out.println();
			}
		}
		
	}
