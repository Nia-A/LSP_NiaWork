package org.howard.edu.lsp.exam.question42;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author niaanderson
 * The SongsDatabase Class
 */
public class SongsDatabase{
 
 /**
  * This method creates and initializes the map
  */
 private Map<String, Set<String>> map = new HashMap<String, Set<String>>();
 
 /**
  * addSong method adds a song title to a genre
  * @param genre holds the genre or category that the song falls under
  * @param songTitle is the title of the individual song
  */
 public void addSong(String genre, String songTitle){
     
     //Gets the set containing songs if it is already in the map. Then it initializes it with the new HashSet. Set remains the abstract class
     Set<String> songsCollection = map.getOrDefault(genre, new HashSet<String>());
     
     //Adds the songTitle to the set
     songsCollection.add(songTitle);
     
     //Placing new updated set back into the map 
     map.put(genre,songsCollection);
     System.out.println("You have added the song " + songTitle + " into " + genre);
 }
 // 
 /**
  * getSongs method returns the Set that contains all songs for a genre
  * @param genre holds the genre or category that the song falls under
  * @return Gets the set containing songs if it is already in the map. Then it initializes it with the new HashSet. Set remains the abstract class
  */
 public Set<String> getSongs(String genre){
     
     return map.getOrDefault(genre,new HashSet<String>());
 }
 // 
 /**
  * getGenreOfSong method returns genre, i.e., jazz, given a song title
  * @param songTitle is the title of the individual song
  * @return Goes through each genre. If one contains the songTitle, return that genre
  */
 public String getGenreOfSong(String songTitle){
    String finalOutput = "";
    
     for(String genre : map.keySet()){
         if(map.get(genre).contains(songTitle)){
             finalOutput = genre;
             break;
         }
     }
     return finalOutput;
 }
}