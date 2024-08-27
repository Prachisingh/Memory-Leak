package levelupjava;

import java.util.Random;
import java.util.Scanner;

public class DoubleOrLoose {
    int currentPoints = 10;
    Random random = new Random();
    String continueGame;

    public void playGame() {

        while (toContinue()) {
            // roll the dice, Use Randomness
            int chance = random.nextInt(2);
            if (chance == 1) {
                this.currentPoints = this.currentPoints * 2;
                System.out.println("Congratulations you got your money doubled as " + this.currentPoints);
            } else {
                System.out.println("Sorry you lost all your points");
                this.currentPoints = 10;
            }
        }
    }

    private boolean toContinue() {
        System.out.println("Welcome, type Y to continue");
        System.out.println("you have already won " + this.currentPoints);
        return new Scanner(System.in).nextLine().equalsIgnoreCase("y");
    }
}
