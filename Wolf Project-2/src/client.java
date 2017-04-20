/*
 * Daniel W. Wolf
 * 
 * 1-22-2014
 * 
 * As a student at Union College, I am part of a community that values 
 * intellectual effort, curiosity and discovery. I understand that in 
 * order to truly claim my educational and academic achievements, I am 
 * obligated to act with academic integrity. Therefore, I affirm that 
 * I will carry out my academic endeavors with full academic honesty, 
 * and I rely on my fellow students to do the same.
 * 
 * Daniel W. Wolf
 */
public class client {

	public static void main(String[] args) {
		// this method runs the rest of the code
	simulator newsimulator= new simulator();
	
	int win_counter = 0;
	
	for (int x = 1; x<11; x++){
		for (int y = 0; y < (1000*x);y++){
			newsimulator.play_game();
			if (newsimulator.play_game() == true){
				win_counter++;
			}
			
		}
		System.out.println(win_counter+"/"+(1000*x)+"  games won = "+(float)(100*win_counter)/(1000*x)+"%");
		
		win_counter =0;
	}
	
	
}
		
	}


