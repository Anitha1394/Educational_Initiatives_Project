# Singleton Pattern – Logger Example

## Overview
This project demonstrates the **Singleton design pattern** in Java. The Singleton pattern ensures that a class has **only one instance** and provides a **global point of access** to it. In this example, the `Logger` class is implemented as a singleton so that all parts of the program use the same instance for logging messages.

---

## Structure
- **Logger:** Singleton class that provides a `log()` method to print messages.  
- **Main:** Demonstrates using the Logger singleton from different parts of the program.

---

## How to Run
1. Ensure **Java is installed** on your machine.  
2. Open a terminal and navigate to the project folder containing the source files.  
3. Compile the Java files:  
```bash
javac -d . src/singleton/*.java
Run the Main class:

bash
Copy code
java singleton.Main
The program demonstrates that all logger calls use the same instance.

