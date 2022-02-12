package component.console;

import component.DataPrinter;
import component.UserInputReader;

import java.util.Scanner;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class ConsoleUserInputReader implements UserInputReader {

    private final DataPrinter dataPrinter;

    public ConsoleUserInputReader(DataPrinter dataPrinter) {
        this.dataPrinter = dataPrinter;
    }

    @Override
    public int getUserInput() {
        while (true) {
            dataPrinter.printInfoMessage("Please type a number between 0 and 9:");
            final String line = new Scanner(System.in).nextLine();
            if (line.length() == 1) {
                final char ch = line.charAt(0);
                if (ch >= '1' && ch <= '9') {
                    return Integer.parseInt(line);
                }
            }
        }
    }
}
