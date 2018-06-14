

public enum Card{
   ACE_OF_HEARTS("AH"),
   TWO_OF_HEARTS("2H"),
   THREE_OF_HEARTS("3H"),
   FOUR_OF_HEARTS("4H"),
   FIVE_OF_HEARTS("5H"),
   SIX_OF_HEARTS("6H"),
   SEVEN_OF_HEARTS("7H"),
   EIGHT_OF_HEARTS("8H"),
   NINE_OF_HEARTS("9H"),
   TEN_OF_HEARTS("10H"),
   KING_OF_HEARTS("KH"),
   QUEEN_OF_HEARTS("QH"),
   JACK_OF_HEARTS("JH"),
   
   ACE_OF_CLUBS("AC"),
   TWO_OF_CLUBS("2C"),
   THREE_OF_CLUBS("3C"),
   FOUR_OF_CLUBS("4C"),
   FIVE_OF_CLUBS("5C"),
   SIX_OF_CLUBS("6C"),
   SEVEN_OF_CLUBS("7C"),
   EIGHT_OF_CLUBS("8C"),
   NINE_OF_CLUBS("9C"), 
   TEN_OF_CLUBS("10C"),
   KING_OF_CLUBS("11C"),
   QUEEN_OF_CLUBS("QC"),
   JACK_OF_CLUBS("JC"),
   
   ACE_OF_SPADES("AS"),
   TWO_OF_SPADES("2S"),
   THREE_OF_SPADES("3S"),
   FOUR_OF_SPADES("4S"),
   FIVE_OF_SPADES("5S"),
   SIX_OF_SPADES("6S"),
   SEVEN_OF_SPADES("7S"),
   EIGHT_OF_SPADES("8S"),
   NINE_OF_SPADES("9S"), 
   TEN_OF_SPADES("10S"),
   KING_OF_SPADES("KS"),
   QUEEN_OF_SPADES("QS"),
   JACK_OF_SPADES("JS"),
   
   
   ACE_OF_DIAMONDS("AD"),
   TWO_OF_DIAMONDS("2S"),
   THREE_OF_DIAMONDS("3D"),
   FOUR_OF_DIAMONDS("4D"),
   FIVE_OF_DIAMONDS("5D"),
   SIX_OF_DIAMONDS("6D"),
   SEVEN_OF_DIAMONDS("7D"),
   EIGHT_OF_DIAMONDS("8D"),
   NINE_OF_DIAMONDS("9D"), 
   TEN_OF_DIAMONDS("10D"),
   KING_OF_DIAMONDS("KD"),
   QUEEN_OF_DIAMONDS("QD"),
   JACK_OF_DIAMONDS("DS");
      
   private final String key;
      
   private Card(String key){
      this.key = key;
   }
   
   public String getKey(){
      return key; 
   }
      
      
      
      
   public Card getCard(String inputkey){
      if (ACE_OF_HEARTS.key.equals(inputkey) ) {
         return ACE_OF_HEARTS;
      }
      
      if(TWO_OF_HEARTS.key.equals(inputkey)){
         return TWO_OF_HEARTS;
      }
      
      if(THREE_OF_HEARTS.key.equals(inputkey)){
         return THREE_OF_HEARTS;
      }
      
      if(FOUR_OF_HEARTS.key.equals(inputkey)){
         return FOUR_OF_HEARTS;
      }
      
      if(FIVE_OF_HEARTS.key.equals(inputkey)){
         return FIVE_OF_HEARTS;
      }
      
      if(SIX_OF_HEARTS.key.equals(inputkey)){
         return SIX_OF_HEARTS;
      }
      
      if(SEVEN_OF_HEARTS.key.equals(inputkey)){
         return SEVEN_OF_HEARTS;
      }
      
      if(EIGHT_OF_HEARTS.key.equals(inputkey)){
         return EIGHT_OF_HEARTS;
      }
      
      if(NINE_OF_HEARTS.key.equals(inputkey)){
         return NINE_OF_HEARTS;
      }
      
      if(TEN_OF_HEARTS.key.equals(inputkey)){
         return TEN_OF_HEARTS;
      }
      
      if(KING_OF_HEARTS.key.equals(inputkey)){
         return KING_OF_HEARTS;
      }
      
      if(QUEEN_OF_HEARTS.key.equals(inputkey)){
         return QUEEN_OF_HEARTS;
      }
      
      
      if (JACK_OF_HEARTS.key.equals(inputkey)) {
         return JACK_OF_HEARTS;
      }
      
      
      
      if(TWO_OF_SPADES.key.equals(inputkey)){
         return TWO_OF_SPADES;
      }
      
      if(THREE_OF_SPADES.key.equals(inputkey)){
         return THREE_OF_SPADES;
      }
      
      if(FOUR_OF_SPADES.key.equals(inputkey)){
         return FOUR_OF_SPADES;
      }
      
      if(FIVE_OF_SPADES.key.equals(inputkey)){
         return FIVE_OF_SPADES;
      }
      
      if(SIX_OF_SPADES.key.equals(inputkey)){
         return SIX_OF_SPADES;
      }
      
      if(SEVEN_OF_SPADES.key.equals(inputkey)){
         return SEVEN_OF_SPADES;
      }
      
      if(EIGHT_OF_SPADES.key.equals(inputkey)){
         return EIGHT_OF_SPADES;
      }
      
      if(NINE_OF_SPADES.key.equals(inputkey)){
         return NINE_OF_SPADES;
      }
      
      if(TEN_OF_SPADES.key.equals(inputkey)){
         return TEN_OF_SPADES;
      }
      
      if(KING_OF_SPADES.key.equals(inputkey)){
         return KING_OF_HEARTS;
      }
      
      if(QUEEN_OF_SPADES.key.equals(inputkey)){
         return QUEEN_OF_SPADES;
      }
      
      if(JACK_OF_SPADES.key.equals(inputkey)){
         return KING_OF_SPADES;
      }
           
           
           
           
   
      if(TWO_OF_DIAMONDS.key.equals(inputkey)){
         return TWO_OF_DIAMONDS;
      }
      
      if(THREE_OF_DIAMONDS.key.equals(inputkey)){
         return THREE_OF_DIAMONDS;
      }
      
      if(FOUR_OF_DIAMONDS.key.equals(inputkey)){
         return FOUR_OF_DIAMONDS;
      }
      
      if(FIVE_OF_DIAMONDS.key.equals(inputkey)){
         return FIVE_OF_DIAMONDS;
      }
      
      if(SIX_OF_DIAMONDS.key.equals(inputkey)){
         return SIX_OF_DIAMONDS;
      }
      
      if(SEVEN_OF_DIAMONDS.key.equals(inputkey)){
         return SEVEN_OF_DIAMONDS;
      }
      
      if(EIGHT_OF_DIAMONDS.key.equals(inputkey)){
         return EIGHT_OF_DIAMONDS;
      }
      
      if(NINE_OF_DIAMONDS.key.equals(inputkey)){
         return NINE_OF_DIAMONDS;
      }
      
      if(TEN_OF_DIAMONDS.key.equals(inputkey)){
         return TEN_OF_DIAMONDS;
      }
      
      if(KING_OF_DIAMONDS.key.equals(inputkey)){
         return KING_OF_DIAMONDS;
      }
      
      if(QUEEN_OF_DIAMONDS.key.equals(inputkey)){
         return QUEEN_OF_DIAMONDS;
      }
      
      if(JACK_OF_DIAMONDS.key.equals(inputkey)){
         return KING_OF_DIAMONDS;
      }     
      
      
      
      
      
      
      
      
      
                
      if(TWO_OF_CLUBS.key.equals(inputkey)){
         return TWO_OF_CLUBS;
      }
      
      if(THREE_OF_CLUBS.key.equals(inputkey)){
         return THREE_OF_DIAMONDS;
      }
      
      if(FOUR_OF_DIAMONDS.key.equals(inputkey)){
         return FOUR_OF_DIAMONDS;
      }
      
      if(FIVE_OF_DIAMONDS.key.equals(inputkey)){
         return FIVE_OF_DIAMONDS;
      }
      
      if(SIX_OF_DIAMONDS.key.equals(inputkey)){
         return SIX_OF_DIAMONDS;
      }
      
      if(SEVEN_OF_DIAMONDS.key.equals(inputkey)){
         return SEVEN_OF_DIAMONDS;
      }
      
      if(EIGHT_OF_DIAMONDS.key.equals(inputkey)){
         return EIGHT_OF_DIAMONDS;
      }
      
      if(NINE_OF_DIAMONDS.key.equals(inputkey)){
         return NINE_OF_DIAMONDS;
      }
      
      if(TEN_OF_DIAMONDS.key.equals(inputkey)){
         return TEN_OF_DIAMONDS;
      }
      
      if(KING_OF_DIAMONDS.key.equals(inputkey)){
         return KING_OF_DIAMONDS;
      }
      
      if(QUEEN_OF_DIAMONDS.key.equals(inputkey)){
         return QUEEN_OF_DIAMONDS;
      }
      
      if(JACK_OF_DIAMONDS.key.equals(inputkey)){
         return KING_OF_DIAMONDS;
      } 
          
        
   }
         
} 
   
/*
 switch(inputkey){
         case ACE_OF_HEARTS.key:
            return ACE_OF_HEARTS;
         
         case TWO_OF_HEARTS.key:
            return TWO_OF_HEARTS;
         
         case THREE_OF_HEARTS.key:
         return THREE_OF_HEARTS;
         
         case FOUR_OF_HEARTS.key:
          return FOUR_OF_HEARTS;
            
           case FIVE_OF_HEARTS.key:
           return FIVE_OF_HEARTS;
           
           case SIX_OF_HEARTS.key:
           return SIX_OF_HEARTS;
           
          case SEVEN_OF_HEARTS.key:
            return SEVEN_OF_HEARTS;
            
            case EIGHT_OF_HEARTS.key:
              return EIGHT_OF_HEARTS;
               
               
             case NINE_OF_HEARTS.key:
             return NINE_OF_HEARTS;
             
             case TEN_OF_HEARTS.key:
             return TEN_OF_HEARTS;
             
             case KING_OF_HEARTS.key:
             return KING_OF_HEARTS;
         
            case QUEEN_OF_HEARTS.key:
            return QUEEN_OF_HEARTS;
            
            case JACK_OF_HEARTS.key:
            return JACK_OF_HEARTS;       
         
      }
*/
