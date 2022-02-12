import component.Game;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public final class Launcher {

    public static void main(final String[] args) {
        final GameFactory gameFactory = new GameFactory(args);
        final Game game = gameFactory.create();
        game.play();
    }
}
