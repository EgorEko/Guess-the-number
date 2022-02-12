import component.*;
import component.console.ConsoleDataPrinter;
import component.console.ConsoleGameOverHandler;
import component.console.ConsoleUserInputReader;
import component.swing.GameWindow;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class GameFactory {

    public GameFactory(final String[] args) {
    }

    public Game create() {
        final NumberGenerator numberGenerator = new NumberGenerator();
        final DataPrinter dataPrinter;
        final UserInputReader userInputReader;
        final GameOverHandler gameOverHandler;
        //FIXME: Must be GUI mode
        if (1 == 1) {
            final GameWindow gameWindow = new GameWindow();
            dataPrinter = gameWindow;
            userInputReader = gameWindow;
            gameOverHandler = gameWindow;
        } else {
            dataPrinter = new ConsoleDataPrinter();
            userInputReader = new ConsoleUserInputReader(dataPrinter);
            gameOverHandler = new ConsoleGameOverHandler();
        }
        return new Game(numberGenerator, dataPrinter, userInputReader, gameOverHandler);
    }
}
