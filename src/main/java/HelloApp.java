/**
 * UC4: Display "Hello" with Multiple Command-Line Arguments or Default Message
 *
 * Description: Accept multiple names via command-line arguments and greet all of them.
 * If no arguments are provided, default to "World".
 *
 * Branch: feature/UC4-display-multiple-names
 * Merged to: dev
 */
public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            System.out.print("Hello");
            for (int i = 0; i < args.length; i++) {
                if (i == args.length - 1) {
                    System.out.print(", " + args[i] + "!");
                } else {
                    System.out.print(", " + args[i]);
                }
            }
            System.out.println();
        }
    }
}
