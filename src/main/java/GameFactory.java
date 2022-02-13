import component.*;
import component.config.CommandLineArgumentParser;
import component.console.ConsoleDataPrinter;
import component.console.ConsoleGameOverHandler;
import component.console.ConsoleUserInputReader;
import component.swing.GameWindow;
import model.config.UserInterface;

import static model.config.UserInterface.GUI;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class GameFactory {

    private final UserInterface userInterface;

    public GameFactory(final String[] args) {
        final CommandLineArgumentParser.CommandLineArguments commandLineArguments =
                new CommandLineArgumentParser(args).parse();
        userInterface = commandLineArguments.getUserInterface();

    }

    public Game create() {
        final NumberGenerator numberGenerator = new NumberGenerator();
        final DataPrinter dataPrinter;
        final UserInputReader userInputReader;
        final GameOverHandler gameOverHandler;
        if (userInterface == GUI) {
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
