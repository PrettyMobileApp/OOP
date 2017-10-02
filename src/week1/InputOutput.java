package week1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputOutput {
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	
		int age;
		int i=5, j, k=5;
	
		//long l1=(Long) 2148000000;
		long l2 = 2_1_48000_000L;
		
		//float f1=2.3; //2.3 treated as a double
		float f2=(float) 2.3;
		/*age = getAge(); //method overloading
		System.out.println("The age is " + age); */
		
		/*age = getAge("Enter AGE for ", "Tom"); //method overloading
		System.out.println("The age is " + age);
		 		*/
/*		String personsFullName = getName();
		System.out.println("FullName is " + personsFullName);*/
		/*String[] name = new String[2];
		getName(name);
		for(String n : name){
			System.out.println(n);
		}*/
		if(checkPension(56)){
			System.out.println("Has pension");
		}else{
			System.out.println("Has no pension");
		};
		
	}
	
	

	public static int getAge(){

		int age = 0;
		System.out.print("Enter age ");
		age = sc.nextInt(); 
		return age;
	}
	
	public static int getAge(String prompt){
		int age = 0;
		System.out.print(prompt);
		try{
			age = sc.nextInt(); 
		}catch(InputMismatchException e){
			e.printStackTrace();
		}			
		return age;
	}
	
	public static int getAge(String prompt, String name){
		int age = 0;
		System.out.println(prompt + name);
		if(sc.hasNextInt()){
			age=sc.nextInt();
		}else{
			System.out.println("invalid input...");
			age = -999;
		}	
		return age;
	}
	
	public static String getName(){
		System.out.println("Enter your name ");
		String name = sc.next();
		System.out.println("Name is " + name);
		return name;
	}
	
	public static void getName(String[] name){
		System.out.println("Enter name ");
		name[0]=sc.next();
		name[1]=sc.next();
		
	}
	
	public static boolean checkPension(int age){
		/*boolean pension;
		if(age>=65){
			pension = true;
		}else{
			pension = false;
		}
		return pension;*/
		return age>=65;
	}
	
	
}
