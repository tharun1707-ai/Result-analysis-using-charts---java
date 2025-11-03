import java.util.*;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void clearStudents() {
        students.clear();
    }

    public boolean isEmpty() {
        return students.isEmpty();
    }
}
