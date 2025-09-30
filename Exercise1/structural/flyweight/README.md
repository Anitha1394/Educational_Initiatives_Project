# Flyweight Pattern – Circle Example

## Overview
This project demonstrates the **Flyweight design pattern** in Java. The pattern is used to **minimize memory usage** by sharing as much data as possible with similar objects. 

---

## Structure
- **Shape:** An interface defining the `draw()` method.  
- **Circle:** A concrete implementation of the `Shape` interface representing a circle, with attributes like color, x, y, and radius.  
- **ShapeFactory:** A factory class that manages the creation and reuse of `Circle` objects based on color.  
- **Main:** Demonstrates creating multiple circles, reusing existing ones to save memory.

---

## How to Run
1. Ensure **Java is installed** on your machine.  
2. Open a terminal and navigate to the project folder containing the source files.  
3. Compile the Java files:  
```bash
javac -d . src/flyweight/*.java

Run the Main class:
java flyweight.Main

The program will create and draw circles, showing when objects are reused.