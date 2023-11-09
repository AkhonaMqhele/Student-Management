package ABCCollege;
 
import java.util.Scanner;
import java.util.ArrayList;
public class StudentManagement {
    private static ArrayList<Student> studentsList = new ArrayList<>();

    
    private static void studentManagementApplication(){
        Scanner input = new Scanner(System.in);
      Student student = new Student();
        System.out.println("Student Management Application");
        System.out.println("***********************************");
        System.out.println("Enter (1) to launch menu or any other key to exit");
        int key = input.nextInt();
        if (key == 1) {
            System.out.println("Please select one of the following meny items: ");
            System.out.println("""
                               (1) Capture a new student
                               (2) Search for a student
                               (3) Delete a student
                               (4) Print student report
                               (5) Exit Application""");
         
            int menuOption = input.nextInt();

            switch (menuOption) {
                case 1 -> {
                    Student newStudent = new Student();
                    System.out.println("CAPTURE A NEW STUDENT");
                    System.out.println("***************************");
                    System.out.print("Enter the student id:");
                    int id = input.nextInt();
                    student.setStudentID((short) id);
                    System.out.print("Enetr student name:");
                    String name = input.nextLine();
                    student.setStudentName(name);
                    System.out.print("Enetr  student age:");
                    byte age = input.nextByte();
                    if(age <=16){
                        System.out.println("You have entered a incorrect student age!!!");
                        System.out.println("Plese re enter the student age >>>");
                        // Enter age input method!!!
                    }
                    student.setStudentAge(age);
                    System.out.print("Enetr student email:");
                    String email = input.nextLine();
                    student.setStudentEmail(email);
                    System.out.print("Enetr student course:"); 
                    String course = input.nextLine();
                    student.setStudentCourse(course);
                    System.out.println("Enter (1) to launch menu or any other key to exit");
                    menuOption = input.nextInt();
                    
                    
                }
                case 2 -> {
                    
                }
                case 3 -> {
                }
                case 4 -> {
                }
                case 5 -> {
                }
                
                default -> {
                }
            }
        } else {
            student.exitStudentApplication();
        }
    }

    public static void main(String[] args) {
        studentManagementApplication();
    }
    
}
