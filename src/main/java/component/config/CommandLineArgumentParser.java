package component.config;

import model.config.UserInterface;

import static model.config.UserInterface.CONSOLE;
import static model.config.UserInterface.GUI;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class CommandLineArgumentParser {

    private final String[] args;

    public CommandLineArgumentParser(final String[] args) {
        this.args = args;
    }

    public CommandLineArguments parse() {
        UserInterface userInterface = null;
        for (String arg : args) {
            if (GUI.name().equalsIgnoreCase(arg) || CONSOLE.name().equalsIgnoreCase(arg)) {
                if (userInterface == null) {
                    userInterface = UserInterface.valueOf(arg.toUpperCase());
                } else {
                    System.err.printf(
                            "Invalid command line argument: '%s', because user interface already set: '%s'!%n",
                            arg, userInterface
                    );
                }
            } else {
                System.err.printf("Unsupported command line argument: '%s'%n", arg);
            }
        }
        if (userInterface == null) {
            userInterface = CONSOLE;
        }
        return new CommandLineArguments(userInterface);
    }

    /**
     * @author devonline
     * @link http://devonline.academy/java
     */
    public static class CommandLineArguments {

        private final UserInterface userInterface;

        private CommandLineArguments(final UserInterface userInterface) {
            this.userInterface = userInterface;
        }

        public UserInterface getUserInterface() {
            return userInterface;
        }
    }
}
