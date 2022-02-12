import component.DataPrinter;
import component.Game;
import component.NumberGenerator;
import component.console.ConsoleDataPrinter;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class GameFactory {

    public GameFactory(final String[] args) {
    }

    public Game create(){
        final NumberGenerator numberGenerator = new NumberGenerator();
        final DataPrinter dataPrinter = new ConsoleDataPrinter();
        return new Game(numberGenerator, dataPrinter);
    }
}
