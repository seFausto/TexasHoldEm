public class Card implements ICard {

	public int value;
	public int face;

	
	Card()
	{}
	
	
	
	@Override
	public double getValue() {
		return 0;

	}

	@Override
	public String toString() {

		String result = "";

		result = convertToLetter();
		result += getFaceOfCard();

		return result;
	}

	private String getFaceOfCard() {

		if (this.face == 0) {
			return Face.Club;
		} else if (this.face == 1) {
			return Face.Diamond;
		} else if (this.face == 2) {
			return Face.Heart;
		} else if (this.face == 3) {
			return Face.Spade;
		} else {
			return "Invalid";
		}

	}

	private String convertToLetter() {
		if (value >= 10) {
			if (this.value == 10)
				return "T";
			else if (this.value == 11)
				return "J";
			else if (this.value == 12)
				return "Q";
			else if (this.value == 13)
				return "K";
			else
				return "Invalid Value";

		} else if (value < 1)
			return "Invalid Value";

		return String.valueOf(this.value);
	}

	@Override
	public String face() {
		return getFaceOfCard();
	}

}
