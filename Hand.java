import java.util.*;

class Hand {
private ArrayList<Card> hand;
private int handValue;
private int aceCounter;

Hand(Deck deck) {
    hand = new ArrayList<>();
    aceCounter = 0;
    handValue = 0;
    for (int i = 0; i < 2; i++) {
        hand.add(deck.drawCard());
    }
    Card[] aHand = new Card[]{};
    aHand = hand.toArray(aHand);
    for (int i = 0; i < aHand.length; i++) {
        handValue += aHand[i].getValue();
        if (aHand[i].getValue() == 11) {
            aceCounter++;
        }
        while (aceCounter > 0 && handValue > 21) {
            handValue -= 10;
            aceCounter--;
        }
    }
}
// adds newly drawn card to hand for user
public void Hit(Deck deck) {
    hand.add(deck.drawCard());
    Card[] aHand = new Card[]{};
    aHand = hand.toArray(aHand);
    handValue = 0;
    aceCounter = 0;
    for (int i = 0; i < aHand.length; i++) {
        handValue += aHand[i].getValue();
        if (aHand[i].getValue() == 11) {
            aceCounter++;
        }
        while (aceCounter > 0 && handValue > 21) {
            handValue -= 10;
            aceCounter--;
        }
    }
}
// retrieves size of hand
public int getHandSize() {
    return hand.size();
}
// retrieves values in hand
public int getHandValue() {
    return handValue;
}

public Card getCard(int cardnum) {
    Card[] aHand = new Card[]{};
    aHand = hand.toArray(aHand);
    return aHand[cardnum-1];
}
// displays hand to user in form of a string
public String toString(){
    String hands ="";
    Card[] aHand = new Card[]{};
    aHand = hand.toArray(aHand);
    for(int i=0; i<aHand.length-1; i++) {
        hands = hands + aHand[i].toString() + ", ";
    }
    hands = hands + aHand[aHand.length-1].toString();
    return hands;
}
}
