# Observer Pattern: Weather Notification System

## Overview
This project demonstrates the **Observer Design Pattern** using a **console-based weather notification system** in Java.  
The application allows multiple observers (users) to **subscribe** to a `WeatherStation` and receive updates whenever the temperature changes.  

---

## Features
- Register and remove observers dynamically.  
- Update temperature in the `WeatherStation`.  
- Notify all registered observers when the temperature changes.  
- Handles duplicate observers gracefully.  
- User-friendly console interface with input validation.  

---

## How to Run
1. Compile all classes:
```bash
javac -d out src/behavioral/observer/src/*.java
java -cp out behavioral.observer.src.Main
```
## Example usage
```bash
=== Weather Notification System ===

1. Add Observer
2. Remove Observer
3. Update Temperature
4. Exit
Choose an option: 1
Enter observer name: Alice
Observer registered: Alice

Choose an option: 3
Enter new temperature: 30

WeatherStation: Temperature changed to 30°C
[Alice] received temperature update: 30°C

Choose an option: 1
Enter observer name: Bob
Observer registered: Bob

Choose an option: 3
Enter new temperature: 32

WeatherStation: Temperature changed to 32°C
[Alice] received temperature update: 32°C
[Bob] received temperature update: 32°C

Choose an option: 4
Program exited.
```