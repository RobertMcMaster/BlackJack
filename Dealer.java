
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

class Dealer extends Player {

Dealer() {
}

public void showFirstCard() {
    Card[] firstCard = new Card[] {};
    firstCard = hand.toArray(firstCard);
    System.out.println("[" + firstCard[0] + "]");
}

public boolean wantsToHit() {
    Hand[] aHand = new Hand[]{};
    aHand = hand.toArray(aHand);
    return aHand[0].getHandValue()<17;
}

public void showHand() {
    System.out.println(hand);
}

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
