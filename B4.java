// Java program to demonstrate Constructor Overloading
class Student {
    String name;
    int age;
    String course;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
        course = "Not assigned";
    }

    // Constructor with one parameter
    Student(String name) {
        this.name = name;
        this.age = 0;
        this.course = "Not assigned";
    }

    // Constructor with two parameters
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.course = "Not assigned";
    }

    // Constructor with all parameters
    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("---------------------------");
    }
}

public class ConstructorOverloadingExample {
    public static void main(String[] args) {
        // Creating objects using different constructors
        Student student1 = new Student(); // Default constructor
        Student student2 = new Student("Alice"); // Constructor with one parameter
        Student student3 = new Student("Bob", 20); // Constructor with two parameters
        Student student4 = new Student("Charlie", 22, "Computer Science"); // Constructor with all parameters

        // Displaying student details
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
        student4.displayDetails();
    }
}
