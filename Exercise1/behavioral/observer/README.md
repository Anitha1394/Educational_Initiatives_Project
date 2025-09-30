# Observer Pattern – Weather Update

## Overview
This project demonstrates the **Observer design pattern** in Java. The pattern is used to implement a **weather update notification system** where multiple observers (like mobile apps, dashboards, or consoles) automatically receive updates when the weather changes.  


## Structure
- **WeatherSubject:** An interface representing the subject (weather data source) that maintains a list of observers and notifies them of changes.  
- **WeatherStation:** A class implementing `WeatherSubject`, which updates weather data and notifies observers.  
- **Observer:** An interface representing observers that want to receive updates.  
- **ConsoleObserver:** A concrete observer that displays weather updates in the console.  
- **MobileAppObserver:** A concrete observer simulating a mobile app receiving weather updates.  
- **Main:** The main class that allows the user to interactively update weather data and see notifications sent to observers.


## How to Run
1. Ensure you have **Java installed** on your machine.  

3. Compile the Java files:  

    javac -d . src/observer/*.java

    java observer.Main

    Follow the prompts to update weather data. Observers will automatically receive and display the updates.

    Type exit to quit the program.

