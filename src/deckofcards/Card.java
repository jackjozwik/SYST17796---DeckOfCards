
package deckofcards;

public class Card {
    
    private final String[] suit = new String[]{"Hearts", "Spades", "Clubs", "Diamonds"};
    private String testField;
    
    public Card(){
    
    }
    
    public String getSuit(int index){
        return suit[index];
    }
    
}
