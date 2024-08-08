package homeworkdependency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        StudentService studentService = context.getBean(StudentService.class);

            System.out.println("All students:");
            studentService.getAllStudents().forEach(System.out::println);

            Student newStudent = new Student(3, "Hang");
            studentService.addStudent(newStudent);
            System.out.println("\nAfter adding Hang:");
            studentService.getAllStudents().forEach(System.out::println);

            Student updatedStudent = new Student(2, "Ly Na");
            studentService.updateStudent(updatedStudent);
            System.out.println("\nAfter updating Na to Ly Na:");
            studentService.getAllStudents().forEach(System.out::println);

            studentService.deleteStudentById(1);
            System.out.println("\nAfter deleting Alice:");
            studentService.getAllStudents().forEach(System.out::println);
    }
}