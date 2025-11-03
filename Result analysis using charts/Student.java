public class Student {
    String name;
    int roll;
    int mark1, mark2, mark3;
    int total;
    double average;
    String grade;

    public Student(String name, int roll, int mark1, int mark2, int mark3) {
        this.name = name;
        this.roll = roll;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        calculateResult();
    }

    private void calculateResult() {
        total = mark1 + mark2 + mark3;
        average = total / 3.0;
        if (average >= 90) grade = "A+";
        else if (average >= 75) grade = "A";
        else if (average >= 60) grade = "B";
        else if (average >= 40) grade = "C";
        else grade = "Fail";
    }

    public String toString() {
        return "Name: " + name + "\nRoll No: " + roll +
                "\nMarks: " + mark1 + ", " + mark2 + ", " + mark3 +
                "\nTotal: " + total + "\nAverage: " + String.format("%.2f", average) +
                "\nGrade: " + grade;
    }
}
