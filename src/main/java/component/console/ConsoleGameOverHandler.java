package component.console;

import component.GameOverHandler;

import java.util.Scanner;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class ConsoleGameOverHandler implements GameOverHandler {
    @Override
    public void gameOver() {
        // Wait for enter pressed
        new Scanner(System.in).nextLine();
    }
}
