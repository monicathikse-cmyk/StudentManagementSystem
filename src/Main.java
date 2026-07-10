import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManagement management = new StudentManagement();

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Update Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    Student student = new Student(id, name, age, course);

                    management.addStudent(student);

                    break;

                case 2:

                    management.displayStudents();

                    break;

                case 3:

                    System.out.print("Enter Student ID to search: ");
                    int searchId = sc.nextInt();

                    management.searchStudent(searchId);

                    break;
                case 4:

                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = sc.nextInt();

                    management.deleteStudent(deleteId);

                    break;
                case 5:

                    System.out.print("Enter Student ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Age: ");
                    int newAge = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Course: ");
                    String newCourse = sc.nextLine();

                    management.updateStudent(updateId, newName, newAge, newCourse);

                    break;

                case 6:

                    System.out.println("Thank you!");
                    return;

                default:

                    System.out.println("Invalid Choice!");

            }

        }

    }
}
