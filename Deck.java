// Calls in java utility.
import java.util.*;
// Creates Deck class.
class Deck {
private ArrayList<Card> deck;
// Sets up Deck array.
Deck() {
    deck = new ArrayList<Card>();
    for (int i = 0; i < 4; i++) {
        for (int j = 1; j <= 13; j++) {
            deck.add(new Card(i, j));
        }
    }
}
// Creates shuffle method.
public void shuffle() {
    Random random = new Random();
    Card temp;
    for (int i = 0; i < 200; i++) {
        int index1 = random.nextInt(deck.size() - 1);
        int index2 = random.nextInt(deck.size() - 1);
        temp = deck.get(index2);
        deck.set(index2, deck.get(index1));
        deck.set(index1, temp);
    }
}
// Creates shuffle method.
public Card drawCard() {
    return deck.remove(0);
}
}
