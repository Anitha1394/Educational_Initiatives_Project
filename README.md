# Description

This repository contains two exercises: **exercise-1** for understanding design patterns with suitable use cases, and **exercise-2** for a console-based application designed to help astronauts manage their daily tasks efficiently.

---

## Exercise 1: Problem Statement on Design Patterns

### Overview
This exercise demonstrates the understanding and application of various software design patterns through six different use cases.

### Behavioral Design Patterns
- Interpreter 
- Observer  

### Creational Design Patterns
- Builder  
- Singleton  

### Structural Design Patterns
- Adapter  
- Flyweight  

---

## Exercise 2: Astronaut Daily Schedule Organizer

### Project Description
The "Astronaut Daily Schedule Organizer" is a console-based application designed to help astronauts manage their daily tasks efficiently. It allows users to add, remove, view, and manage tasks while ensuring no conflicts in scheduling.

### Features
- **Add Tasks** – Enter description, start and end times, and priority.  
- **View Tasks** – Display all scheduled tasks in a neat format.  
- **Remove Tasks** – Handles duplicates intelligently:  
  - Single match → removes directly.  
  - Multiple matches → user selects which one to delete.  
- **Time Format Support** – Accepts `HH:mm` (e.g., 09:00) and military `HHmm` (e.g., 0900).  
- **Conflict Detection** – Uses Observer pattern to alert if tasks overlap.  
- **Extensible Design** – Easy to add new UI or persistence layers.


## Example Usage

### 1. Adding a Task
```text
--- Astronaut Daily Schedule ---

1. Add Task
2. Remove Task
3. View Tasks
4. Exit

Choose an option: 1
Description: Morning Exercise
Start Time (HH:mm or HHmm): 0700
End Time (HH:mm or HHmm): 0800
Priority (High/Medium/Low): High
Task added successfully.


Choose an option: 3
Scheduled Tasks:
1. Morning Exercise | 07:00 - 08:00 | High
2. Team Meeting     | 09:00 - 10:00 | Medium
3. Team Meeting     | 14:00 - 15:00 | High

Choose an option: 2
Enter task description: "Morning Exercise"
Task "Morning Exercise" removed successfully!

Enter task description: "Team Meeting"
Multiple tasks found with description "Team Meeting":
1. 09:00 - 10:00 [Medium]
2. 14:00 - 15:00 [High]
Enter the number of the task to delete: 2
Task "Team Meeting" removed successfully!
```
---

### Design Patterns Used
- **Factory Pattern** – `TaskFactory` creates `Task` objects.  
- **Observer Pattern** – `Notifier` system alerts if new tasks conflict with existing ones.  
- **SOLID Principles** – Each class has a single, focused responsibility.

---
