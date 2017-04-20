
public class simulator {
	/**
	 * This class simulates a game of solitaire
	 * @author Dan Wolf
	 * 
	 * @version 1-22-2014
	 */
	Deck newdeck = new Deck();
	
	private Card[] face_up;
	
	private int current_face_up;
	
	public simulator(){
		/**
		 * a basic constructor
		 */
		this.current_face_up = 0;
		this.face_up = new Card[52];
	}
	public boolean play_game(){
		/**
		 * This method simulates playing a single game of solitaire 
		 * it returns a boolean: false if the game was lost and true if the game was won.
		 * 
		 * @return returns a boolean false if the game is lost and true if it was won.
		 */
		current_face_up = 0;
		
		boolean win=false;
		
		newdeck.reset_deck();
		newdeck.Shuffle();
		
		
		while (newdeck.isempty() == false && win == false){
		lessthan4();
		remove_checker();
		
		if (current_face_up == 0){
			win = true;
		
		}
			
		}
		
	return win;
	}
	
	public void lessthan4(){
		/** 
		 * this method checks whether there are 4 cards on the table and if not it deals cards until there are 4
		 */
		if (current_face_up<4){
			for (;current_face_up<4; current_face_up++){
				face_up[current_face_up] = newdeck.deal();
				
				
			}
		}
		current_face_up = 4;
	}
	
	public void remove_checker(){
		/**
		 * this method checks whether cards can be removed and removes them if they can be removed
		 * if no cards can be removed it deals a new card
		 */
		if ((face_up[current_face_up-1].get_suit().equals(face_up[current_face_up-2].get_suit())) 
				&& (face_up[current_face_up-2].get_suit().equals(face_up[current_face_up-3].get_suit())) 
				&& (face_up[current_face_up-3].get_suit().equals(face_up[current_face_up-4].get_suit()))){
					face_up[current_face_up-1]= null;
					face_up[current_face_up-2]= null;
					face_up[current_face_up-3]= null;
					face_up[current_face_up-4]= null;
					current_face_up-=4;
				}
		
		else if ((face_up[current_face_up-1].get_suit()).equals(face_up[current_face_up-4].get_suit())){
			face_up[current_face_up-3]= face_up[current_face_up-1];
			face_up[current_face_up-1]= null;
			current_face_up-=2;
			
		}
		
		else{
			face_up[current_face_up] = newdeck.deal();
			current_face_up+=1;
		}
		
	}
	
}
