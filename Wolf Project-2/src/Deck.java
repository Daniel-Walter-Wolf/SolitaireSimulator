import java.util.Random;


public class Deck {
	/**
	 * This class represents a standard playing card deck of 52 cards.  It does not contain jokers
	 * @author Dan Wolf
	 * 
	 * @version 1-22-2014
	 */
	
	
	private int current_index = 0;
	
	private Card[] deck_list = new Card[52];
	
	final int cards = 52;
	
	
	public Deck(){
		/**
		 * this is a default constructor that creates a deck of 52 cards
		 * 
		 */
		String[] value = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		
		String[] suit = {"clubs","hearts","diamonds","spades"};
		
		int card_counter = 0;
		
		for (int x =0; x < suit.length; x++){
		
			for (int y =0; y < value.length ; y++){
				Card card_add = new Card(value[y],suit[x]);
				deck_list[card_counter] = card_add;
				//System.out.println(deck_list[card_counter].toString());
				card_counter +=1;
				
			}
		
		}
		
	}
	public void Shuffle(){
		/**
		 * this method shuffles the deck into a random order
		 */
		Random rand_num;
		rand_num = new Random();
		Card holder;
		
		for (int x = 0; x < deck_list.length; x++){
			holder = deck_list[x];
			int rand_index = rand_num.nextInt(cards);
			deck_list[x] = deck_list[rand_index];
			deck_list[rand_index] = holder;
			//System.out.println(deck_list[x].toString());
			
		}
		
	}
	public String toString(){
		/** 
		 * this method takes the deck and returns it as a string separated by line 
		 * breaks in between cards
		 * 
		 * @return  a string version of the entire deck that is separated by line breaks
		 */
		String deckstring = "";
		for (int x=0; x < deck_list.length; x++){
			deckstring+=deck_list[x].toString();
			deckstring+="\n";
		}
		//System.out.println(deckstring);
		return deckstring;
		
	}
	public Card deal(){
		/**
		 * Deals a card from the deck.  It returns a card object.
		 * 
		 * @return card object 
		 */
		current_index+=1;
		//System.out.println(current_index);
		return deck_list[current_index-1];
		
		}
		
		
	
	public boolean isempty(){
		/**
		 * this method checks whether the deck object is empty
		 * if it is not empty this method returns false.  If it is empty this method returns true.
		 * 
		 * @return returns a boolean that is true of false depending on whether the deck is empty
		 */
		boolean empty = false;
		if (current_index >= cards){
			empty = true;
			return empty;
		}
		else{
			return empty;
		}
		
	
	}
	public void reset_deck(){
		current_index = 0;
	}
	
	
}
