import java.util.ArrayList;
public class StudentManagement {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\n===== Student List =====");

        for (Student student : students) {
            System.out.println("ID      : " + student.id);
            System.out.println("Name    : " + student.name);
            System.out.println("Age     : " + student.age);
            System.out.println("Course  : " + student.course);
            System.out.println("------------------------");
        }
    }
    public void searchStudent(int id) {

        for (Student student : students) {

            if (student.id == id) {

                System.out.println("\nStudent Found");
                System.out.println("ID      : " + student.id);
                System.out.println("Name    : " + student.name);
                System.out.println("Age     : " + student.age);
                System.out.println("Course  : " + student.course);

                return;
            }
        }

        System.out.println("Student not found.");
    }
    public void deleteStudent(int id) {

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).id == id) {

                students.remove(i);

                System.out.println("Student deleted successfully!");

                return;
            }
        }

        System.out.println("Student not found.");
    }
    public void updateStudent(int id, String name, int age, String course) {

        for (Student student : students) {

            if (student.id == id) {

                student.name = name;
                student.age = age;
                student.course = course;

                System.out.println("Student updated successfully!");

                return;
            }
        }

        System.out.println("Student not found.");
    }
}
