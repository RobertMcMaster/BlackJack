// Calls in java utilities.
import java.util.*;
// Calls in java arraylists.
import java.util.ArrayList;
// Calls in java arrays.
import java.util.Arrays;

class Dealer extends Player {

Dealer() {
}
// Dealer draws and shows first card.
public void showFirstCard() {
    Card[] firstCard = new Card[] {};
    firstCard = hand.toArray(firstCard);
    System.out.println("[" + firstCard[0] + "]");
}
// Sets dealer activity when hand is less then 17.
public boolean wantsToHit() {
    Hand[] aHand = new Hand[]{};
    aHand = hand.toArray(aHand);
    return aHand[0].getHandValue()<17;
}
// Shows dealer's hand.
public void showHand() {
    System.out.println(hand);
}
// Decides when the dealer hits or stands.
public void takeTurn(Deck deck) {
    Hand[] aHand = new Hand[]{};
    aHand = hand.toArray(aHand);
    while (wantsToHit()) {
        System.out.println("The dealer hits.");
        aHand[0].Hit(deck);
        if (hasBusted()) {
            break;
        }
    }
    System.out.println("The dealer stands.");
}
}
