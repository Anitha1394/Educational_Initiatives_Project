# Builder Pattern: Pizza Builder

## Overview
This project demonstrates the **Builder Design Pattern** using a **console-based pizza ordering system** in Java.  
The application allows users to customize a pizza by selecting **size, crust, and toppings**, then constructs the pizza using the Builder pattern.

---

## Features
- Choose **pizza size** (`small`, `medium`, `large`).  
- Choose **crust type** (`thin`, `thick`).  
- Add multiple **toppings** dynamically.  
- Ensures mandatory fields are validated (size and crust).  
- Creates an **immutable Pizza object** using the Builder pattern.  
- User-friendly console interface.

---

## How to Run
1. Compile all classes:
```bash
javac -d out src/creational/builder/src/*.java
java -cp out creational.builder.src.Main
```
## Example usage
```bash
=== Pizza Builder ===
Enter pizza size (small/medium/large): medium
Enter crust type (thin/thick): thin
Add a topping (or type 'done' to finish): cheese
Add a topping (or type 'done' to finish): olives
Add a topping (or type 'done' to finish): done

Your pizza is ready!
Pizza [Size=medium, Crust=thin, Toppings=[cheese, olives]]
```