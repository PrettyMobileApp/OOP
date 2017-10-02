package week1;

import java.util.Random;
import java.util.Scanner;

public class CardDeskApp {
	private static Scanner sc = new Scanner(System.in);
	private static String[] suits ;
	private static Card[] theDeck = new Card[52];;
	private static Player[] players = new Player[4];
	
	public static void main(String[] args) {
		
		loadCardArray();
		printCardArray();
		shuffleCards();
		printCardArray();
		dealCards();
		showCards();	
	}
	
	public static void loadCardArray(){		
		String suitValue = null;
		for(int i=0; i<52; i++){
			
			switch(i/13){
				case 0: 
					suitValue = "H" + (i%13+1);
					break;
				case 1:	
					suitValue = "C" + (i%13+1);
					break;
				case 2:
					suitValue = "D" + (i%13+1);
					break;
				case 3:
					suitValue = "S" + (i%13+1);
					break;
				default: 
					System.out.println("Error in loadCardArray()");;
			}
			theDeck[i] = new Card(suitValue);
			
		}
		
	}
	
	public static void printCardArray(){
		System.out.println();
		if(theDeck.length!=52){
			System.out.println("Error in printCardArray()");
		}else{
			for(int i=0; i<4; i++){
				for(int j=0; j<13; j++){
					System.out.print( theDeck[i*13+j].getTheSuitValue() + " " );
					
				}				
				System.out.println();
			}
		}
		
	}
	
	public static void shuffleCards(){
		for(int j=0; j<100; j++){
			Random r = new Random();
			//random number between 1 and 50, and then add 1
			int variant = r.nextInt(49) +2;
			for(int i=0; i<52; i++){
				if( (i+variant) < 52){
					String temp = theDeck[i].getTheSuitValue();
					theDeck[i] = new Card(theDeck[i+variant].getTheSuitValue());
					theDeck[i+variant] = new Card(temp);
				}
			}
		}
	}
	
	public static void dealCards(){
		for(int i=0; i<4; i++){
			System.out.println();
			System.out.print("Enter a player: ");
			String player = sc.next();
			Card[] cards = new Card[5];
			for(int j=0; j<5; j++){
				cards[j] = new Card( theDeck[j*4+i].getTheSuitValue() );

			}
			players[i] = new Player(player, cards);
			
		}
	}
	
	public static void showCards(){
		for(int i=0; i<players.length; i++){
			for(int j=0; j < players[i].getTheHand().length; j++){
				System.out.println();
				String value = players[i].getTheHand()[j].getTheSuitValue();
				System.out.println( players[i].toString() + " " + value);
			}
		}
		
	}

}
