# 📘 Student Attendance System

## 📝 Description

The **Student Attendance System** is a simple Java-based console application designed to manage and record the attendance of students in a classroom setting. It allows users to mark attendance for students, store the data per subject and date, and view all attendance records through a command-line interface.

This system automates the traditionally manual process of recording attendance and ensures data consistency, better organization, and easier access to records.

---

## 💡 Key Features

- ✅ **Mark Attendance**: Add a student's attendance by specifying student ID, name, subject, and whether the student is present or absent.
- 📅 **Date-wise Tracking**: Stores attendance data along with the subject and date.
- 📋 **Display Records**: View the list of all students and their corresponding attendance entries.
- 🛠️ **Object-Oriented Design**: Utilizes classes like `Student`, `Attendance`, and `AttendanceService` for modular, clean code.
- 💻 **Command-Line Interface**: Simple CLI interface that accepts commands like `mark`, `show`, and `exit`.

---

## 🛠️ Technologies Used

- **Language:** Java (Console-based)
- **Tools:** VS Code / IntelliJ / Command Prompt
- **Version Control:** Git & GitHub

---

## 🔧 Classes Overview

- `Student`: Represents a student with ID, name, and list of attendance records.
- `Attendance`: Contains details about a specific attendance entry (subject, date, presence).
- `AttendanceService`: Handles logic for adding and displaying attendance.
- `Main`: Provides the user interface and manages CLI input/output.

---

## screenshot
![Uploading Screenshot 2025-08-06 161139.png…]()


## 📂 How to Run

1. **Compile all Java files:**
   ```bash
   javac *.java
   java Main
comands
mark [studentId] [studentName] [subject] [true/false]
show
exit
📈 Future Enhancements (Optional)
Export attendance to CSV or Excel

Add GUI using JavaFX or Swing

Store data in a database (e.g., MySQL) for persistence

Generate monthly or subject-wise attendance reports

📌 Author
Joshua (@Joshua12-code)


