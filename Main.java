package tournament;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello I'am the tournament mannager");
		try {
			Scanner names = new Scanner(new File("names.txt"));
			// String [] player = new String [1000];
			ArrayList<String> players = new ArrayList<>();
			while (names.hasNext()) {
				String player = names.nextLine();
				players.add(player);
			}
			//System.out.println(players);
			int matchnumber=0;
			
         for(int i = 0; i<players.size()-1; i++ ) {
        	 for(int x = i+1; x<players.size(); x++ ) {
        		 //System.out.println("i="+i+", x="+x);
//        		 System.out.printf("i=%d, x=%d\n", i, x);
        		 String player1 = players.get(i); 
        		 String player2 = players.get(x); 
        		 matchnumber ++;
        		 System.out.println(""+matchnumber+". "+player1 +"+"+ player2);
        		 
        	 }
        	 
         }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Ctrl + shift + '+' to increase font size
		// Ctrl + shift + f to optimize code
	}

}
