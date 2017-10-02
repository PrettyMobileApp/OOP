package week1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WeekOneExercises {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/*if(didOswaldActAlone()){
			System.out.println("Yes, he acted alone.");
		}else{
			System.out.println("No, he didn't act alone.");
		}
		
		filmRating();*/
		//swimmerRating();
		System.out.println("Swimmer Country is " + swimmerRating());
		
	}
	
	
	public static boolean didOswaldActAlone(){
		System.out.print("Did he act alone? ");
		boolean answer = sc.nextBoolean();
		return answer;
	}
	
	public static void filmRating(){
		System.out.print("Enter film name: ");
		String filmName = sc.next();
		System.out.print("Enter rating for film " + filmName + " \"12\" or \"18\" :");
		
		try{
			int rating = sc.nextInt();			
			System.out.println("\nThe film name is " + filmName);
			System.out.println("Rating for film " + filmName + " is " + rating);			
		}catch(InputMismatchException e){
			System.out.println(e);
		}		
	}

	public static String swimmerRating(){
		String country = "Error";
		System.out.print("Enter swimmer name : ");
		String swimmerName = sc.next();
		System.out.print("Enter swimmer rating (double) : ");
		
		if(sc.hasNextDouble()){
			double rating = sc.nextDouble();			
			country = getSwimmersCountry(swimmerName);
			System.out.println("\nSwimmer name is " + swimmerName);
			System.out.println("Swimmer rating is " + rating);
		}else{
			System.out.println("Invalid input...");
		}		
		return country;
	}
	
	public static String getSwimmersCountry(String s){
		System.out.print("Enter country for swimer " + s +" : ");
		String country = sc.next();
		return country;
	}

}
