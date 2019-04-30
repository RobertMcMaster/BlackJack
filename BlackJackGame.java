// Calls in Java utility.
import java.util.*;
// Creates BlackJackGame class.
public class BlackJackGame {
// Reads in output from the other methods to determine the flow of actions.
public static void main(String[] args) {

  Long startTime1 = System.nanoTime();
    Output output = new Output();
    Input input = new Input(output);
    output.askName();
    output.greeting(input.getName());
    output.askCash();
    User user = new User();
    Dealer dealer = new Dealer();
    user.setCash(input.getCash());
    while (user.getCash() > 0) {
        Deck deck = new Deck();
        deck.shuffle();
        user.getNewHand(deck);
        dealer.getNewHand(deck);
        output.showCash(user.getCash());
        output.askBet();
        user.setBet(input.getBet(user.getCash()));
        user.setCash(user.getCash() - user.getBet());
        output.showCash(user.getCash());
        output.showBet(user.getBet());
        output.showHand(user);
        output.showDealerFirstCard(dealer);
        if (dealer.getHand(1).getCard(1).getRank() == 1) {
            output.insurance();
            if (input.choiceIsYes()) {
                if (dealer.hasBlackJack(1)) {
                    output.winInsurance();
                    user.win();
                    output.showCash(user.getCash());
                } else {
                    output.loseInsurance();
                    output.showCash(user.getCash());
                }
            }
        }
        if (user.hasBlackJack(1) && dealer.hasBlackJack(1)) {
            output.userBlackJack();
            output.dealerBlackJack();
            output.push();
            user.push();
        } else if (user.hasBlackJack(1)) {
            user.blackJack();
            output.userBlackJack();
            output.win();
        } else if (dealer.hasBlackJack(1)) {
            output.dealerBlackJack();
            output.lose();
        } else {
            if (2 * user.getBet() < user.getCash()) {
                output.askDoubleDown();
                if (input.choiceIsYes()) {
                    user.doubleDown();
                    output.showCash(user.getCash());
                    output.showBet(user.getBet());
                }
            }
            output.hitOrStand();
            while (input.choiceisHit()) {
                user.getHand(1).Hit(deck);
                output.showHand(user);
                output.hitOrStand();
                if (user.hasBusted()) {
                    output.busted();
                    output.lose();
                    break;
                }
                if (user.hasFiveCardTrick(1)) {
                    output.hasFiveCardTrick();
                    output.win();
                    user.win();
                    break;
                }
            }
            if(!user.hasBusted()) {
                dealer.takeTurn(deck);
                output.showDealerHand(dealer);
                if (dealer.hasBusted()) {
                    output.dealerBusted();
                    output.win();
                    user.win();
                } else {
                    if ((21 - user.getHand(1).getHandValue()) < (21 - dealer
                            .getHand(1).getHandValue())) {
                        output.win();
                        user.win();
                    }
                    if ((21 - user.getHand(1).getHandValue()) == (21 - dealer
                            .getHand(1).getHandValue())) {
                        output.push();
                        user.push();
                    }
                    if ((21 - user.getHand(1).getHandValue()) > (21 - dealer
                            .getHand(1).getHandValue())) {
                        output.lose();
                    }
                }
            }
        }
        output.showCash(user.getCash());
        output.playAgain();
        if (!input.choiceIsYes()) {
            break;
        }

    }
    if (user.getCash() == 0) {
        output.cashTotalZero(user.getCash());
    }
    output.cashTotal(user.getCash());
    Long endTime1 = System.nanoTime();
    Long runTime1 = endTime1 - startTime1;
    System.out.println("The run time for this game of blackjack in nanoseconds is " + runTime1);
}
}
