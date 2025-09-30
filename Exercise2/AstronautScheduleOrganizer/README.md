# Astronaut Daily Schedule

A simple **console-based Java application** to manage astronaut daily tasks.
Focuses on clean code, **OOP principles**, and **design patterns**.

---

##  Features

* Add tasks (description, start time, end time, priority)
* View tasks sorted by time
* Remove tasks by description (handles duplicates by letting user choose)
* Prevent overlapping tasks
* Validate time format (`HH:mm` or `HHmm`)

---

##  How to Run

```bash
javac -d out src/com/astronaut/**/*.java
java -cp out com.astronaut.ui.ConsoleUI
```

---

##  Design Patterns Used

* **Singleton** – Single instance of `ScheduleManager`
* **Factory** – `TaskFactory` for creating tasks
* **Observer** – Notifies conflicts when tasks overlap

---

##  Example

```
--- Astronaut Daily Schedule ---
1. Add Task
2. Remove Task
3. View Tasks
4. Exit
Choose an option: 1
Description: Morning Exercise
Start Time: 0700
End Time: 0800
Priority: High
Task added successfully.
```
