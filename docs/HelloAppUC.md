# HelloApp Use Cases Documentation

This document describes all use cases for the HelloApp project.

## UC1: Display "Hello World"

### Description
The app displays "Hello World" on the console when executed.

### Key Requirements
- Print a basic greeting to the console.

### Code
```java
public class HelloApp {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

### Concepts Learned
- Java main method
- Console output with System.out.println
- Basic class structure

---

## UC2: Display "Hello" with Command-Line Argument

### Description
Accept one name via command-line input and greet that user.

### Key Requirements
- Read first command-line argument
- Display "Hello <name>"

### Code
```java
public class HelloApp {
    public static void main(String[] args) {
        if (args.length >= 1) {
            System.out.println("Hello " + args[0]);
        } else {
            System.out.println("Please provide a name as a command-line argument.");
        }
    }
}
```

### Concepts Learned
- Command-line arguments (String[] args)
- Array length check
- String concatenation
- Conditional statements (if-else)

---

## UC3: Display "Hello" with Command-Line Argument or Default Message

### Description
Support optional argument handling with a default greeting path.

### Key Requirements
- If argument provided: print "Hello <name>"
- If no argument: print "Hello World" (default)

### Code
```java
public class HelloApp {
    public static void main(String[] args) {
        if (args.length >= 1) {
            System.out.println("Hello " + args[0]);
        } else {
            System.out.println("Hello World");
        }
    }
}
```

### Concepts Learned
- Optional command-line arguments
- Default values/fallback behavior
- Conditional logic with if-else

---

## UC4: Display "Hello" with Multiple Command-Line Arguments or Default Message

### Description
Handle multiple command-line names in one execution.

### Key Requirements
- Accept multiple command-line arguments
- Print "Hello" followed by all names
- If no arguments: print "Hello World"

### Code
```java
public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello World");
        } else {
            System.out.print("Hello");
            for (int i = 0; i < args.length; i++) {
                System.out.print(" " + args[i]);
            }
            System.out.println();
        }
    }
}
```

### Concepts Learned
- Multiple command-line arguments
- Traditional for loop
- Array iteration
- Conditional handling for empty input

---

## UC5: Display "Hello" with Multiple Command-Line Arguments using Enhanced For Loop or Default Message

### Description
Read names using enhanced for loop with default greeting.

### Key Requirements
- Accept multiple command-line arguments
- Use enhanced for loop to iterate
- Print "Hello" followed by all names
- If no arguments: print "Hello World"

### Code
```java
public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello World");
        } else {
            System.out.print("Hello");
            for (String name : args) {
                System.out.print(" " + name);
            }
            System.out.println();
        }
    }
}
```

### Concepts Learned
- Enhanced for loop (for-each)
- Clean iteration over arrays
- Improved code readability
- Default greeting fallback

---

## Repository

GitHub: https://github.com/saicharanjith-cpu/HelloApp
