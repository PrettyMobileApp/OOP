package week1;

class Card {
	private String theSuitValue;

	public Card(String aSuitValue) {
		super();
		this.theSuitValue = aSuitValue;
	}

	public String getTheSuitValue() {
		return theSuitValue;
	}

	@Override
	public String toString() {
		return "Card [theSuitValue=" + theSuitValue + "]";
	}
	
	
	
}
