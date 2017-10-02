package week2;

import java.util.Scanner;

public class MASE_Week2 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//simpleCals();
		//preAndPostDifference();
		compareStrings();
	}
	
	public static void compareStrings(){
//		System.out.println("enter first string");
//		String s1=sc.next();
//		System.out.println("enter second string");
//		String s2=sc.next();
//		
//		System.out.println("using == returns " + (s1==s2));
//		System.out.println("using == returns (+means add) " + s1 == s2);
//
//		String name1 = new String ("John");
//		String name2 = new String ("John");
//		System.out.println("using == returns name" + (name1==name2));
//		System.out.println("using equals() returns name " + name1.equals(name2));
		
		//hard-coded string literal
		String name3 = "sean";
		String name4 = "sean";
		System.out.println("using == returns true now " + (name3==name4));
		
		String paul1 = "paul";
		String paul2 = new String("paul").intern();
		System.out.println("using == returns true now " + (paul1==paul2));
		
		System.out.println("Enter dog1: ");
		String dog1 = sc.next().intern();
		System.out.println("Enter dog2");
		String dog2 = sc.next().intern();

		System.out.println("using == returns true now " + (dog1==dog2));
		
		
	}
	public static void simpleCals(){
		System.out.println("enter x");
		int x = sc.nextInt();
		System.out.println("enter y");
		int y = sc.nextInt();
		
		int sum= x+y;
		
		System.out.println("The sum of " + x + " and " + y +" is " + (x+y));
		System.out.println("The diff of " + x + " and " + y +" is " + (x-y));
		System.out.println("The product of " + x + " and " + y +" is " + (x*y));
		System.out.println("The quotient of " + x + " and " + y +" is " + (x/y));
		
		
	}

	public static void preAndPostDifference(){
		int x=5, y=10;
		System.out.println("the value of x is " + x);
		System.out.println("the value of ++x is " + ++x);
		System.out.println("the value of x++ is " + x++);
		System.out.println("the value of x is " + x);
		
		System.out.println("the value of y is " + y);
		System.out.println("the value of ++y is " + --y);
		System.out.println("the value of y++ is " + y--);
		System.out.println("the value of y is " + y);
		
		int i;
		for(i=0; i<100; i++){
			System.out.println("i in loop is " + i);
			break;
			
		}
		System.out.println(i);
		
	}
	
}
