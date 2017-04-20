
public class Card {
/**
 * this class should represent a single card that makes up a deck
 * 
 * @author Dan Wolf
 * 
 * @version 1-22-2014
 * 
 */
	
	//create instance variables for suite and values
	private String value;
	private String suit;
	
	
	public Card (String value,String suit){
		/**
		 * a non- basic constructor that takes a value and suit and returns a card object
		 * 
		 * @return returns a card object
		 * 
		 * @param value and suit strings
		 */
		this.suit = suit;
		this.value = value;
		
	}
	public String toString(){
		/**
		 * This method returns the value of a card in the form of a string
		 * 
		 * @return returns a string containing the value and suit of the card
		 */
		String string_ver = value+" of "+suit;
		return string_ver;
	}
	public String get_suit(){
		return suit;
	}
	public String get_value(){
		return value;
	}
}
