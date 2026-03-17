/**
 * UC3: Display "Hello" with Command-Line Argument or Default Message
 *
 * Description: Accept one name via command-line input and greet that user.
 * If no argument is provided, default to "World".
 *
 * Branch: feature/UC3-display-name-default
 * Merged to: dev
 */
public class HelloApp {
    public static void main(String[] args) {
        String name;
        if (args.length >= 1) {
            name = args[0];
        } else {
            name = "World";
        }
        System.out.println("Hello, " + name + "!");
    }
}
