import component.*;
import component.console.ConsoleDataPrinter;
import component.console.ConsoleGameOverHandler;
import component.console.ConsoleUserInputReader;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class GameFactory {

    public GameFactory(final String[] args) {
    }

    public Game create() {
        final NumberGenerator numberGenerator = new NumberGenerator();
        final DataPrinter dataPrinter = new ConsoleDataPrinter();
        final UserInputReader userInputReader = new ConsoleUserInputReader(dataPrinter);
        final GameOverHandler gameOverHandler = new ConsoleGameOverHandler();
        return new Game(numberGenerator, dataPrinter, userInputReader, gameOverHandler);
    }
}
