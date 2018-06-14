import java.util.*;
import java.util.Arrays; 

public class DeckofCards{
   public static void main(String[]args){
      int[]deck = new int[52];
      String[]suit = {"Spades", "Hearts", "Diamonds", "Clubs"};
      String[]rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9" , "10", "Queen", "King", "Jack"}; //use text file 
      
      //Scanner readcards = new Scanner(System.in);
      
      sortCards(deck, suit, rank);
     
      //readCards(deck, suit, rank); 
      
   } 
   
   public static void sortCards(int[]deck, String []suit, String[] rank){
   
      for (int i = 1; i < deck.length; i++) {
         deck[i] = i;  
      
      }
    
     //System.out.print(Arrays.toString(deck)); 
    
    
      for (int i = 0; i < deck.length; i++) {
         int index = (int)(Math.random() * deck.length);
         
         int temp = deck[i];
         deck[i] = deck[index];
         
      }
    
      for (int i = 0; i < 1; i++) {
         String cardsuit = suit[deck[i] / 13];
         String cardrank = rank[deck[i] % 13];
        
        System.out.println(cardrank + " " + "of" + " " + cardsuit);

       
       
      } 
   
      
    
   }

   
 

}
















///method __
    //goes through array list one by one for the ranks
    //then goes through the suits
    //goal: end up with a random card 




