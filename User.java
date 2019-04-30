// Calls in java utilities.
import java.util.*;
// Calls in java arrays.
import java.util.Arrays;
// Creates the User class which extends the Player class.
class User extends Player {
private int cash;
private int bet;
private String name;
// User method.
User() {
}
// Creates the cash interger.
public int getCash() {
    return cash;
}
// Creates the bet interger.
public int getBet() {
    return bet;
}
// Creates the name interger.
public String getName() {
    return name;
}
// Sets the cash interval equal to the money interval.
public void setCash(int money) {
    cash = money;
}
// Sets the bet interval equal to the money interval.
public void setBet(int money) {
    bet = money;
}
// Sets the name interval equal to the username interval.
public void setName(String username) {
    name = username;
}
// Splits hand.
public void split(Deck deck) {
    Hand hand2 = new Hand(deck);
    hand.add(hand2);
}
// Calculates the amount of money earned from a double down.
public void doubleDown() {
    cash=cash-bet;
    bet=2*bet;
}
// Calculates the amount of money earned when the player wins.
public void win() {
    cash=cash+2*bet;
}
// Calculates the amount of money earned from a succesful push.
public void push() {
    cash=cash+bet;
}
// Calculates the amount of money earned from a BlackJack.
public void blackJack() {
    cash=cash+3*bet;
}
// Creates second hand size in the event of a split.
public boolean hasSplit() {
    return hand.size()==2;
}
// Handles the procedures of a 5 card trick.
public boolean hasFiveCardTrick(int handnum) {
    Hand[] aHand = new Hand[]{};
    aHand = hand.toArray(aHand);
    Hand myHand = aHand[handnum-1];
    return(myHand.getHandSize()==5 && myHand.getHandValue()<21);
}

}
