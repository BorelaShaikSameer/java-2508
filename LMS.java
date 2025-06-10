public class LMS {
    public static void StudentEntity(){
     int StudentID=12345;
     String StudentName="Sameer";
     String Email="shaiksameer95067@gmail.com";
     String phoneNumber="9398428018";
     String enrolldCourse="fullStackjava";
     long courseFees=100000;
     System.out.println("This about Student Entity");
     System.out.println("Student id is :"+StudentID);
     System.out.println("Student name is :"+StudentName);
     System.out.println("Email is :"+Email);
     System.out.println("phone number is :"+phoneNumber);
     System.out.println("enrolled course is :"+enrolldCourse);
     System.out.println("course fees is :"+courseFees);
        System.out.println("==========================================================");
    System.out.println();
    }
    public static void CoursesEntity(){
        int courseId=12345;
        String courseTitle="FullStackJava";
        String descCourse="it contains multiple technologies";
        String duration="4 months";
        int trainerId=1234;
        int NoofStudents=1234;
        System.out.println("This is about Course entity");
    System.out.println("Course id is :"+courseId);
     System.out.println("Course name is :"+courseTitle);
     System.out.println("discription about course :"+descCourse);
     System.out.println("duration of course is :"+duration);
     System.out.println("enrolled course trainer id is :"+trainerId);
     System.out.println("Number of students is :"+NoofStudents);
     System.out.println("==========================================================");
     System.out.println();
    }
    public static void TrainerEntity(){
        int trainerId=1234;
        String TrainerName="Ravi";
        String email="ravi@gmail.com";
        String expertise="core JAva";
        int salary=100000;
        System.out.println("This about Trainer ID");
        System.out.println("Trainer id is :"+trainerId);
    System.out.println("Student id is :"+TrainerName);
     System.out.println("trainer email is: "+email);
     System.out.println("expertise in :"+expertise);
     System.out.println("salary for the trainer is :"+salary);
    }
    public static void main(String[] args) {
        StudentEntity();
        CoursesEntity();
        TrainerEntity();
    }
}
