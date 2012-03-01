package EnumTest;

public class Card {
	public enum Suit{
		CLUBS(1), SPADES(2), HEARTS(3), DIAMONDS(4);
		int value;
		private Suit(int v){
			value = v;
		}
	}
}
