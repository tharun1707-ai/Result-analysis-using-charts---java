# 🎓 Result Analysis System with Charts

A Java Swing application that manages and visualizes student results using **JFreeChart**. It allows users to input student details, calculate total and average marks, assign grades, and display performance charts.

## 🚀 Features
- Add multiple student records with marks.
- Automatically calculate total, average, and grade.
- Display all student results in a text area.
- Generate bar charts of student performance using JFreeChart.
- Simple, user-friendly GUI built with Swing.

## 🧩 Project Structure
- **Student.java** – Defines student details and result logic.  
- **StudentManager.java** – Manages the list of students.  
- **ChartGenerator.java** – Generates bar charts using JFreeChart.  
- **ResultAnalysisSystem.java** – Main GUI application.

## ⚙️ Requirements
- JDK 8 or higher  
- JFreeChart and JCommon libraries  
  - `jfreechart-1.5.4.jar`  
  - `jcommon-1.0.23.jar`  
- Runs on Windows, macOS, or Linux  

## 🧠 How to Run
**1. Compile**
```bash
javac -cp ".;jfreechart-1.5.4.jar;jcommon-1.0.23.jar" *.java

2. Run

java -cp ".;jfreechart-1.5.4.jar;jcommon-1.0.23.jar" ResultAnalysisSystem

📊 Output

GUI window for student result entry

Text area showing student details and grades

Bar chart visualization of total marks

🧑‍💻 Author

Tharun Kumar S
https://github.com/tharun1707-ai

📜 License

This project is open-source under the MIT License.