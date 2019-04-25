// Calls in java utilities.
import java.util.*;

class Output {

Output(){
}
// Asks for player name.
public void askName() {
    System.out.println("Hi! What is your name?");
}
// Displays Player name.
public void greeting(String name) {
    System.out.println("Hello, "+name+", let's play some Blackjack!");
}
// Asks player how much money they wanr to start with.
public void askCash() {
    System.out.println("How much cash do you want to start with?" +
      " Please do not enter a number greater then or equal to 1 billion.");
}
// Displays inputed amount back to player.
public void tellCashStart(int cash) {
    System.out.println("You start with cash: "+cash);
}
// Displays current amount of cash.
public void showCash(int cash) {
    System.out.println("Cash: "+cash);
}
// Tells player when bet exceeds current cash.
public void cannotBet() {
    System.out.println("You cannot bet more money than you have!");
}
// Asks how much money the player wants to bet.
public void askBet() {
    System.out.println("How much do you wish to bet?");
}
// Tells the user the current bet value.
public void showBet(int bet) {
    System.out.println("Money on the table: " + bet);
}
// Shows the player the current cards in their hand as well as their total value.
public void showHand(User user) {
    System.out.println("Here is your hand: ");
    System.out.println(user.getHand(1));
    System.out.println("Total Hand value: " + user.getHand(1).getHandValue());
}
// Shows the dealer's first card to the player.
public void showDealerFirstCard(Dealer dealer) {
    System.out.println("The dealer is showing:");
    Hand hand = dealer.getHand(1);
    System.out.println(hand.getCard(1));
}
// Shows the dealers complete hand.
public void showDealerHand(Dealer dealer) {
    System.out.println("Here is the dealer's hand:");
    System.out.println(dealer.getHand(1));
}
// Asks if the player wants to double down on the bet.
public void askDoubleDown() {
    System.out.println("Would you like to double down?");
}
// Asks the player to answer yes or no to the current question.
public void yesOrNo() {
    System.out.println("Please answer yes or no.");
}
// Confirms to the player that they are indeed doubling down.
public void hasDoubledDown() {
    System.out.println("You have opted to double down!");
}
// Asks the player if they'd like insurance.
public void insurance() {
    System.out.println("The dealer is showing ace! Would you like insurance?");
}
// Confirms to the player that they chose for insurance.
public void hasInsurance() {
    System.out.println("You have opted for insurance!");
}
// Asks the player if they'd like to split.
public void split() {
    System.out.println("You have two of the same card- would you like to split?");
}
// Confirms to the player that they have decided to split.
public void hasSplit() {
    System.out.println("You have opted to split!");
}
// Shows the player their split hands.
public void splitHands(User user) {
    System.out.println("Here are your hands:");
    System.out.println(user.getHand(1));
    System.out.println(user.getHand(2));
}
// Tells the player that the dealer got a BlackJack.
public void dealerBlackJack() {
    System.out.println("The dealer has Blackjack!");
}
// Tells the player that they got a Blackjack and that means they recieve twice their bet back.
public void userBlackJack() {
    System.out.println("You have BlackJack!");
    System.out.println("You win 2x your money back!");
}
// Tells the player that they won.
public void win() {
    System.out.println("Congratulations, you win!");
}
// Tells the player that they lost.
public void lose() {
    System.out.println("Sorry, you lose!");
}
// Tells the player that a push has occured.
public void push() {
    System.out.println("It's a push!");
    System.out.println("You get your money back.");
}
// Asks the player if they would like to hit or stand.
public void hitOrStand() {
    System.out.println("Would you like to hit or stand?");
}
//Asks the player to enter their response to the last question.
public void enterHitorStand() {
    System.out.println("Please enter hit or stand.");
}
// Asks the player if they'd like to play another round.
public void playAgain() {
    System.out.println("Would you like to play again?");
}
// Tells the player their final money total.
public void cashTotal(int cash) {
    System.out.println("Your cash total is: "+cash);
    System.out.println("Enjoy your winnings!");
}
// Tells the player that they ran out of money to bet with.
public void cashTotalZero(int cash) {
    System.out.println("Your total cash is: "+cash);
    System.out.println("You ran out of cash!");
}
// Tells the player that they have a 5 card trick.
public void hasFiveCardTrick() {
    System.out.println("You have a five card trick!");
}
// Tells the player that their insurance has succeeded.
public void winInsurance() {
    System.out.println("The dealer does have Blackjack!");
    System.out.println("You have won your insurance.");
}
// Tells the player that their insurance has failed.
public void loseInsurance() {
    System.out.println("Sorry, the dealer does not have Blackjack.");
    System.out.println("You have lost your insurance");
}
// Tells the player that they have busted.
public void busted() {
    System.out.println("You busted!");
}
// Tells the player that the dealer has busted.
public void dealerBusted() {
    System.out.println("The dealer busted!");
}
}
