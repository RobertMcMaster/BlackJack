// Calls in java utilities.
import java.util.*;

class Card {
// Creates rank interger.
private final int rank;
// Creates suit interger.
private final int suit;
// Turns rank into a string of values.
private static String[] ranks = { "Joker", "Ace (1 or 11)", "Two", "Three", "Four",
        "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack (10)", "Queen (10)",
        "King (10)" };
// Turns suits into a string of values.
private static String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
Card(int suit, int values) {
    this.rank = values;
    this.suit = suit;
}
// Adds rank and suit together to make a card name.
public String toString() {
    return ranks[rank] + " of " + suits[suit];
}
// Returns card rank.
public int getRank() {
    return rank;
}
// Returns card suit.
public int getSuit() {
    return suit;
}
// Sets face card values to 10.
public int getValue() {
    int value=0;
    if (rank > 10) {
        value = 10;
    } else if (rank == 1) {
        value = 11;
    } else {
        value = rank;
    }
    return value;
}
}
