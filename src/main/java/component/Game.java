package component;

import java.util.Scanner;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class Game {

    final NumberGenerator numberGenerator;

    final DataPrinter dataPrinter;

    public Game(final NumberGenerator numberGenerator,
                final DataPrinter dataPrinter) {
        this.numberGenerator = numberGenerator;
        this.dataPrinter = dataPrinter;
    }

    public void play() {
        final int number = numberGenerator.generate();
        while (true) {
             dataPrinter.printInfoMessage("Please type a number between 0 and 9:");
            final int userCase = new Scanner(System.in).nextInt();
            if (number > userCase) {
                System.out.println("number > " + userCase + ". Try again:");
            } else if (number < userCase) {
                System.out.println("number < " + userCase + ". Try again:");
            } else {
                System.out.println("Congratulations, you guessed the number!");
                // Wait for enter pressed
                new Scanner(System.in).nextLine();
                break;
            }
        }
    }
}
