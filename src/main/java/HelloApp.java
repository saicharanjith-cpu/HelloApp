/**
 * UC2: Display "Hello" with Command-Line Argument
 * 
 * Description: Accept one name via command-line input and greet that user.
 * If no argument is provided, prompt the user to provide a name.
 * 
 * Branch: feature/UC2-display-hello-with-argument
 * Merged to: dev
 */
public class HelloApp {
    public static void main(String[] args) {
        if (args.length >= 1) {
            System.out.println("Hello " + args[0]);
        } else {
            System.out.println("Please provide a name as a command-line argument.");
        }
    }
}
