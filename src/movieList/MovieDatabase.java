package movieList;

import java.util.ArrayList;
import java.util.Scanner;




public class MovieDatabase {

	public static void main(String[] args) {
		
		
		ArrayList<Movie> myMovies = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
        String[] title={"SW1","SW2","SW3","Bob"};
        String[] cat={"Scifi","Scifi","Scifi","Drama"};
        
        for (int i = 0; i < 4; i++) {
            myMovies.add(new Movie());
            
            myMovies.get(i).setTitle(title[i]);
            myMovies.get(i).setCategory(cat[i]);
            
    		for (Movie p:myMovies) { 
    			p.printMovie();
    		}
            
        }

       sc.close();
	}

}
