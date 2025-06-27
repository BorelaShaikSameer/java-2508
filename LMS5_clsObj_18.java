import java.util.Scanner;

public class LMS5_clsObj_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.println("Enter Student Details: Name, Mobile, Age, Course");
        String Name = sc.nextLine();
        String mobile = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine(); 
        String course = sc.nextLine();

        Student s = new Student();
        s.setStudentDetails(Name, mobile, age, course);

        System.out.println("Enter Trainer Details: Name, Experience, Number of Courses");
        String tName = sc.nextLine();
        int experience = sc.nextInt();
        int numberOfCourses = sc.nextInt();
        sc.nextLine(); 

        Trainer t = new Trainer();
        t.setTrainerDetails(tName, experience, numberOfCourses);

        System.out.println("Enter Course Details: Title, Trainer Name, Duration");
        String title = sc.nextLine();
        String trainerName = sc.nextLine();
        int duration = sc.nextInt();

        Course c = new Course();
        c.setCourseDetails(title, trainerName, duration);

        System.out.println("\n--- Student Details ---");
        s.display();
        System.out.println("\n--- Trainer Details ---");
        t.display();
        System.out.println("\n--- Course Details ---");
        c.display();
    }
}

class Student {
    String name, mobile, course;
    int age;

    public void setStudentDetails(String name, String mobile, int age, String course) {
        this.name = name;
        this.mobile = mobile;
        this.age = age;
        this.course = course;
    }

    public void display() {
        System.out.println("Name of the Student: " + name);
        System.out.println("Mobile no of Student: " + mobile);
        System.out.println("Age of the Student: " + age);
        System.out.println("Course enrolled by the Student: " + course);
    }
}

class Trainer {
    String name;
    int experience, numberOfCourses;

    public void setTrainerDetails(String name, int experience, int numberOfCourses) {
        this.name = name;
        this.experience = experience;
        this.numberOfCourses = numberOfCourses;
    }

    public void display() {
        System.out.println("Name of the Trainer: " + name);
        System.out.println("Experience of Trainer: " + experience);
        System.out.println("Number of Courses training: " + numberOfCourses);
    }
}

class Course {
    String title, trainer;
    int duration;

    public void setCourseDetails(String title, String trainer, int duration) {
        this.title = title;
        this.trainer = trainer;
        this.duration = duration;
    }

    public void display() {
        System.out.println("Trainer Name: " + trainer);
        System.out.println("Course Title: " + title);
        System.out.println("Duration of Course: " + duration + " weeks");
    }
}
