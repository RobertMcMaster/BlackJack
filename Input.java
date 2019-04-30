// Calls in java utility.
import java.util.*;
// Creates input class.
class Input {
private Output outputter;
Input(Output outputs) {
    outputs = outputter;
}
// Calls in a scanner for user's name.
public String getName() {
    Scanner scan = new Scanner(System.in);
    String name = scan.nextLine();
    return name;
}
// Calls in a scanner for user's money.
public int getCash() {
    Scanner money = new Scanner(System.in);
    int cash = money.nextInt();
    return cash;
}
// Calls in a scanner for user's bet.
public int getBet(int cash) {
    Scanner sc = new Scanner(System.in);
    int bet = sc.nextInt();
        while (bet > cash) {
            outputter.cannotBet();
            outputter.askBet();
            bet=sc.nextInt();
        }
    return bet;
}
// Calls in a scanner for any yes or no choice.
public boolean choiceIsYes() {
    Scanner doubledown = new Scanner(System.in);
    String doubled = doubledown.nextLine();
    while (!isyesorno(doubled)) {
        outputter.yesOrNo();
        doubled = doubledown.nextLine();
    }
    return doubled.equals("yes");
}
// Reads in user's answer to the above question.
public boolean isyesorno(String answer) {
    return (answer.equals("yes") || answer.equals("no"));
}
// Calls in a scanner for the hit or stand user.
public boolean choiceisHit() {
    Scanner hitter = new Scanner(System.in);
    String hit = hitter.nextLine();
    while(!ishitorstand(hit)) {
        outputter.yesOrNo();
        hit = hitter.nextLine();
    }
    return hit.equals("hit");
}
// Reads in user's answer to the above question.
public boolean ishitorstand(String hit) {
    return (hit.equals("hit") || hit.equals("stand"));
}

}
