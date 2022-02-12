package component.console;

import component.DataPrinter;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class ConsoleDataPrinter implements DataPrinter {
    @Override
    public void printInfoMessage(final String message) {
        System.out.println(message);
    }
}
