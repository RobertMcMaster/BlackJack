// Calls in java utilities
import java.util.*;
// creates Player class
class Player {
ArrayList<Hand> hand;
// sets the hand variable to be equal to ArrayList<Hand>
Player() {
    hand = new ArrayList<Hand>();
}
// Checks player's hand for a BlackJack
public boolean hasBlackJack(int handnum) {
    Hand[] aHand = new Hand[] {};
    aHand = hand.toArray(aHand);
    return (aHand[handnum-1].getHandSize() == 2 && aHand[handnum-1].getHandValue() == 21);
}
// Checks for player's hand to see if they busted.
public boolean hasBusted() {
    Hand[] aHand = new Hand[] {};
    aHand = hand.toArray(aHand);
    return (aHand[0].getHandValue() > 21);
}
// Creates player's hands.
public Hand getHand(int handnum) {
    Hand[] aHand = new Hand[] {};
    aHand = hand.toArray(aHand);
    return aHand[handnum-1];
}
// Creates a new hand for the player.
public void getNewHand(Deck deck) {
    hand.clear();
    Hand myHand = new Hand(deck);
    hand.add(myHand);
}
}
