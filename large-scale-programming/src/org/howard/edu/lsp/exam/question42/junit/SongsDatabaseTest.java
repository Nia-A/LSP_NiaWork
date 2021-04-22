package org.howard.edu.lsp.exam.question42.junit;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

//import org.howard.edu.lsp.exam.question42;
import org.howard.edu.lsp.exam.question42.SongsDatabase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SongsDatabaseTest {
	
	SongsDatabase db = new SongsDatabase();
	
	@Test
	@DisplayName("Test cases for adding a song to the database")
	public void addSongTest() {
		
        //Function to add a song
        db.addSong("Rap", "Gin and Juice");
        db.addSong("Rap", "Savage");
        db.addSong("Jazz", "Always There");
        db.addSong("Pop", "Crazy in Love");
        db.addSong("Techno", "Robotic");
        
        //adding songs to an existing genre
        db.addSong("Techno", "Hype");
        
		 
        
		}
	
	@Test
	@DisplayName("Test cases for getting the songs under a genre")
	public void getSongTest() {

		db.addSong("Pop", "Crazy in Love");
		db.addSong("Rap", "Gin and Juice");
        db.addSong("Rap", "Savage");
		Set<String>songs1 = db.getSongs("Rap");
		Set<String>songs2 = db.getSongs("Pop");
       
        System.out.println("List of songs in " + "Rap" + " is:");
        

       //prints the list of songs
        for(String song : songs1)
            System.out.print(song + " , ");
        System.out.println("");
        
        System.out.println("List of songs in " + "Pop" + " is:");
        for(String song : songs2)
            System.out.print(song + " , ");
        System.out.println("");
		
	}
	
	@Test
	@DisplayName("Test cases for getting the genre of songs")
	public void getGenreTest() {

		db.addSong("Pop", "Crazy in Love");
		db.addSong("Rap", "Gin and Juice");
        db.addSong("Rap", "Savage");
        String genre1 = db.getGenreOfSong("Crazy in Love");
        String genre2 = db.getGenreOfSong("Savage");
        
        System.out.println("Crazy In Love is in " + genre1);
        System.out.println("Savage is in " + genre2);


    
		
	}
	
	
}

