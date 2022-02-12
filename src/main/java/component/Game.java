package component;

import java.util.Scanner;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class Game {

    final NumberGenerator numberGenerator;

    final DataPrinter dataPrinter;

    final UserInputReader userInputReader;

    public Game(final NumberGenerator numberGenerator,
                final DataPrinter dataPrinter, UserInputReader userInputReader) {
        this.numberGenerator = numberGenerator;
        this.dataPrinter = dataPrinter;
        this.userInputReader = userInputReader;
    }

    public void play() {
        final int number = numberGenerator.generate();
        while (true) {
            final int userCase = userInputReader.getUserInput();
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
