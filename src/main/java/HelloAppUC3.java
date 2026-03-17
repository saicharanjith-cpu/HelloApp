// Use Case 3: Display "Hello" with Command-Line Argument or Default Message
// Student: Sai Charanjith (RA2511033010170)
// Assignment: B2P16-AO1-Sem2-2025-29 - Hello App UC3

public class HelloAppUC3 {
    public static void main(String[] args) {
        if (args.length >= 1) {
            System.out.println("Hello " + args[0]);
        } else {
            System.out.println("Hello World");
        }
    }
}
