package homeworkdependency;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentRepository {
    private List<Student> students = new ArrayList<>();

    // Initial data
    public StudentRepository() {
        students.add(new Student(1, "Thuy"));
        students.add(new Student(2, "Na"));
    }

    public List<Student> findAll() {
        return students;
    }

    public Optional<Student> findById(int id) {
        return students.stream().filter(student -> student.getId() == id).findFirst();
    }

    public void save(Student student) {
        students.add(student);
    }

    public void update(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == student.getId()) {
                students.set(i, student);
                return;
            }
        }
    }

    public void deleteById(int id) {
        students.removeIf(student -> student.getId() == id);
    }
}
