/**
 * UC5: Display "Hello" with Multiple Command-Line Arguments using Enhanced For Loop or Default Message
 *
 * Description: Accept zero or more command-line arguments and print greetings.
 * Uses an enhanced for loop (for-each) to process multiple names.
 * If no arguments are provided, displays the default greeting: "Hello, World!".
 *
 * Branch: feature/UC5-enhanced-for-loop
 * Merged to: dev
 */
public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            System.out.print("Hello");
            for (String name : args) {
                System.out.print(", " + name);
            }
            System.out.println("!");
        }
    }
}
