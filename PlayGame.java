import java.util.*;
public class PlayGame{
   public static void main (String[]args){
      Scanner console = new Scanner(System.in);
      Info();
      playerInfo(console);
   }
   public static void Info(){
      System.out.println("Welcome to the game");
      System.out.println("Here's how to play:");
      System.out.println("The computer has randomly selected a card out of a standard deck.");
      System.out.println("Your job is to guess the card using a given key");
      //card key here 
      System.out.println("Good luck to you!");
   
   }
   public static String playerInfo(Scanner console){ // stores users guesses for each card 
      System.out.println(" ");
      System.out.println("Pick a card:");
      String answer = console.next();
      return answer; 
   
   //System.out.println("Would you like to play again?");
   
   }


}