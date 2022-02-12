import component.Game;
import component.NumberGenerator;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class GameFactory {

    public GameFactory(final String[] args) {
    }

    public Game create(){
        final NumberGenerator numberGenerator = new NumberGenerator();
        return new Game(numberGenerator);
    }
}
