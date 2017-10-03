package week5;

class Tag{
	Tag(int marker){
		System.out.println("Constructor .. Tag " + marker + " tagCounter = " + ++tagCounter);
	}
	static int tagCounter;
}


class Card{
	Tag t1 = new Tag(1);
	static int cardCounter;
	
	Card(int marker){
		System.out.println("Constructor ..Card " + marker + " cardcounter = " + ++cardCounter);
		t3 = new Tag(33);
	}
	
	static Tag t2 = new Tag(2);
	Tag t3 = new Tag(3);
}


public class StaticTest {

	Card y = new Card(8);
	static Card x = new Card(7);
	
	public static void main(String[] args) {
		//new StaticTest();
	}

}
