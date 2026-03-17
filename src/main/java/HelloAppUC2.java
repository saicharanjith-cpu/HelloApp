// Use Case 2: Display "Hello" with Command-Line Argument
// Student: Sai Charanjith (RA2511033010170)
// Assignment: B2P16-AO1-Sem2-2025-29 - Hello App UC2

public class HelloAppUC2 {
    public static void main(String[] args) {
        if (args.length >= 1) {
            System.out.println("Hello " + args[0]);
        } else {
            System.out.println("Please provide a name as a command-line argument.");
        }
    }
}
