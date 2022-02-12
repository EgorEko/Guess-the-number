package component;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class Game {

    final NumberGenerator numberGenerator;

    final DataPrinter dataPrinter;

    final UserInputReader userInputReader;

    final GameOverHandler gameOverHandler;

    public Game(final NumberGenerator numberGenerator,
                final DataPrinter dataPrinter, UserInputReader userInputReader, GameOverHandler gameOverHandler) {
        this.numberGenerator = numberGenerator;
        this.dataPrinter = dataPrinter;
        this.userInputReader = userInputReader;
        this.gameOverHandler = gameOverHandler;
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
                gameOverHandler.gameOver();
                break;
            }
        }
    }
}
