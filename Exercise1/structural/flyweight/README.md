# Flyweight Pattern – Circle Example

## Overview
This project demonstrates the **Flyweight design pattern** in Java.  
The Flyweight pattern is used to **minimize memory usage** by sharing as much data as possible with similar objects.  

In this example, multiple `Circle` objects are created, but circles with the same color are **reused** via a factory to reduce memory consumption.

---

## Structure
- **Shape:** Interface defining the `draw()` method.  
- **Circle:** Concrete implementation of `Shape` representing a circle, with attributes like `color`, `x`, `y`, and `radius`.  
- **ShapeFactory:** Manages the creation and reuse of `Circle` objects based on their `color`.  
- **Main:** Demonstrates creating multiple circles and shows memory savings by reusing existing circles.

---

## How to Run
1. Ensure **Java is installed** on your machine.  
2. Compile the Java files:
```bash
javac -d out src/*.java
java -cp out Main
```
## Example Usage
```bash
Creating circle of color: Red
Drawing Circle [Color: Red, x: 23, y: 65, radius: 100]

Creating circle of color: Green
Drawing Circle [Color: Green, x: 77, y: 12, radius: 100]

Reusing existing circle of color: Red
Drawing Circle [Color: Red, x: 40, y: 30, radius: 100]
...
```