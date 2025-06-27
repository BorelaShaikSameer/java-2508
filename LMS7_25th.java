import java.util.Scanner;

public class LMS7_25th {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter course of student: ");
        String course = sc.nextLine();
        
        student7 s = new student7();                 
        student7 s1 = new student7(id, name);        
        student7 s2 = new student7(id,name, course); 

        sc.close();
    }
}

class student7 {
    int id;
    String name;
    String course;

    // Default constructor
    public student7() {
        System.out.println("It's the default constructor");
    }

    // Constructor with ID and name
    public student7(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("ID and name of the student: " + id + " " + name);
    }

    // Constructor with ID, name, and course — using this()
    public student7(int id, String name, String course) {
        this(id, name); // Reusing the 2-arg constructor
        this.course = course;
        System.out.println("More details of the student:");
        System.out.println(id + "\n" + name + "\n" + course);
    }
}
