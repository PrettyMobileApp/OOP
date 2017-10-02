package week1;

import java.util.Arrays;

class Player {
	private String theName;
	private Card[] theHand;
	
	public Player(String aName, Card[] aHand) {
		//super();
		this.theName = aName;
		this.theHand = aHand;
	}
	
	public String getTheName() {
		return theName;
	}
	
	public Card[] getTheHand() {
		return theHand;
	}
		
	@Override
	public String toString() {
		return "Player=" + theName ;
	}
	
}
