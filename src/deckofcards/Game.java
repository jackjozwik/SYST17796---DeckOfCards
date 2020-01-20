package deckofcards;

public class Game {

    public static void main(String[] args) {
        Card deck = new Card();
        
        //loop for card number
        for (int i = 1; i <= 13; i++) {
            //nested for loop for suits
            for (int j = 0; j < 4; j++) {
                
                //if statement for checking number
                if (i > 1 && i < 11){
                    System.out.println(i + " of " + deck.getSuit(j));
                } else if(i == 1){
                    System.out.println("Ace" + " of " + deck.getSuit(j));
                } else if(i == 11){
                    System.out.println("Jack" + " of " + deck.getSuit(j));
                } else if(i == 12){
                    System.out.println("Queen" + " of " + deck.getSuit(j));
                } else if(i == 13){
                    System.out.println("King" + " of " + deck.getSuit(j));
                }
            }
        }
    }
}
