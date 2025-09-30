# Interpreter Pattern – Mathematical Expression

## Overview
This project demonstrates the **Interpreter design pattern** in Java. The pattern is used to **interpret and evaluate expressions** based on a defined grammar.

---

## Structure
- **Expression:** Interface defining the `interpret()` method.  
- **NumberExpression:** Represents a numeric value in the expression.  
- **AddExpression, SubtractExpression, MultiplyExpression, DivideExpression:** Concrete classes for mathematical operations.  
- **Parser:** Parses the user input into expressions and evaluates them.  
- **Main:** Provides an interactive console for the user to enter expressions and displays results.

---

## How to Run
1. Ensure **Java is installed** on your machine.  
2. Open a terminal and navigate to the project folder containing the source files.  
3. Compile the Java files:  
```bash
javac -d . src/interpreter/*.java
Run the Main class:

bash
Copy code
java interpreter.Main
Enter expressions like 5 + 3, 2 * 4, or 10 / 2. Type exit to quit.

The program evaluates the expression and prints the result or error messages.