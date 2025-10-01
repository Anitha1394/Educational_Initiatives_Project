# Singleton Pattern – Logger Example

## Overview
This project demonstrates the **Singleton design pattern** in Java.  
The Singleton pattern ensures that a class has **only one instance** and provides a **global point of access** to it.  

In this example, the `Logger` class is implemented as a singleton so that all parts of the program use the **same instance** for logging messages. The program also shows that multiple calls to `Logger.getInstance()` return the same object.

---

## Structure
- **Logger:** Singleton class that provides a `log()` method to print messages.  
- **Main:** Demonstrates using the Logger singleton from different parts of the program. Accepts user input for messages to log and shows that all logger calls use the same instance.

---

## How to Run 
3. Compile the Java files:
```bash
javac -d out src/creational/singleton/src/*.java
java -cp out creational.singleton.src.Main
```
## Example usage
```bash
=== Singleton Logger Example ===
Enter a log message: Hello World
[LOG] Hello World
Enter a log message: This is Anitha
[LOG] This is Anitha
Both logger instances are the same. Singleton works!

