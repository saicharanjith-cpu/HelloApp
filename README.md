# HelloApp

Hello App starts with Hello World, progresses to displaying a user name, then names from command-line args and standard input. It then manages names in a collection with list/remove options, refactors into methods and classes, adds persistence across runs, and finally displays names in banner format.

## Purpose

This project demonstrates progressive Java development through a series of use cases, starting from basic console output to a modular, persistent, and extensible application.

## How to Run

### Prerequisites
- Java JDK 8 or higher
- Maven 3.x

### Build and Run
```bash
mvn clean install
mvn exec:java -Dexec.mainClass="HelloApp"
```

### Run with Command-Line Arguments
```bash
java -cp target/classes HelloApp Alice Bob Charlie
```

## Project Structure

```
hello-app/
├── pom.xml
├── README.md
├── .gitignore
├── src/
│   ├── main/
│   │   └── java/
│   │       └── HelloApp.java
│   └── test/
│       └── java/
│           └── HelloAppTest.java
└── docs/
    └── HelloAppUC.md
```

## Use Cases

| UC  | Description |
|-----|-------------|
| UC1 | Display "Hello World" on the console |
| UC2 | Accept one name via command-line and greet that user |
| UC3 | Support optional argument handling with default greeting |
| UC4 | Handle multiple command-line names in one execution |
| UC5 | Read names using enhanced for loop with default greeting |

## Repository

GitHub: https://github.com/saicharanjith-cpu/HelloApp
