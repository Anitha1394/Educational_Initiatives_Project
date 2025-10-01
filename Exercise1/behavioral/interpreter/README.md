# Interpreter Pattern – Mathematical Expression
## Overview
This project demonstrates the **Interpreter Design Pattern** by implementing a **console-based arithmetic expression interpreter** in Java.  
The application can evaluate **basic arithmetic expressions** (`+`, `-`, `*`, `/`) using the Interpreter pattern, where each operation is represented as a separate expression class.

---

## Features
- Supports **addition, subtraction, multiplication, and division**.  
- Handles **division by zero** gracefully.  
- Validates input format and numbers.  
- User-friendly **console interface**.  
- Implements **Interpreter Design Pattern** with:
  - `Expression` interface  
  - Concrete classes: `AddExpression`, `SubtractExpression`, `MultiplyExpression`, `DivideExpression`, `NumberExpression`  

---

## How to Run
```bash
javac -d out src/behavioral/interpreter/src/*.java
java -cp out behavioral.interpreter.src.Main

```

## Example Usage

```bash

Enter expression (e.g., 5+3, 10-2, 4*6, 20/5)
Supported operators: +, -, *, /
Type 'exit' to quit.

Enter expression: 5+3
Result: 8

Enter expression: 10/0
Error: Division by zero!

Enter expression: 7*4
Result: 28

Enter expression: exit
Exiting Arithmetic Interpreter.
```