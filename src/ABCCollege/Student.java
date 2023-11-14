package ABCCollege;

public class Student extends StudentManagementApp {
    private int id;
    private int age;
    private String name;
    private String course;
    private String email;
    
     public Student(int id, String name, int age, String email, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
    }


     // Getter methods to retrieve individual student attributes
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
     public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }
}
