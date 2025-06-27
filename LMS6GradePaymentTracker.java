import java.util.Scanner;

import Student1.trainer;

public class LMS6GradePaymentTracker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Student id");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("enter Student NAme");
        String name=sc.nextLine();
        System.out.println("enter Student attendance/sessions attended");
        int sessions_Attended=sc.nextInt();
        System.out.println("enter Studnet Score from 0 to 100 ");
        int score=sc.nextInt();  
       Student1 s=new Student1(id, name);
       s.scoreCal(sessions_Attended);
       s.performanceCal(score);
       s.final_Achievement();
       System.out.println();


       //trainer details
       System.out.println(" enter Trainer ID "); 
       int trainer_id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Trainer Name:");
       String trainer_name=sc.nextLine();
       System.out.println("enter number of Sessions taken by trainer");
       int sessionsTaken=sc.nextInt();
       System.out.println("enter Student rating from 0 to 5: ");
       int Student_rating=sc.nextInt();
       trainer t=new trainer(trainer_id,trainer_name);
       t.trainer_payment(sessionsTaken,Student_rating);
    }
}
class Student1{
    int id;
    String name;
    int sessions_Attended;
    int attendance_credits;
    int performance_credits;
    public Student1(int id,String name){
        this.id=id;
        this.name=name;
        System.out.println(" id and NAme of the student:"+id+" "+name);
    }
    public void scoreCal(int sessions_Attended){
     if(sessions_Attended>=30){
        attendance_credits+=5;
     }
     else if(sessions_Attended>=20){
        attendance_credits+=3;
     }

     else if(sessions_Attended <20){
        attendance_credits+=0;
     }
     System.out.println("the attendence credits of Student: "+attendance_credits);
    }
     public void performanceCal(int Score){
      if(Score>=85){
        performance_credits+=5;
      }
      else if(Score>=60){
        performance_credits+=3;
      }
      else if(Score<60){
        performance_credits+=0;
      }
      System.out.println(" performance credits of Student: "+performance_credits);
     }
     public void final_Achievement(){
       int total_credits=attendance_credits+performance_credits;
       if(total_credits>=10){
        System.out.println("Student Achieved : Gold");
       }
       else if(total_credits>=8){
        System.out.println("Studnet Acheived : Silver");
       }
       else if(total_credits<8){
        System.out.println(" Student you need to improve");
       }
       System.out.println("total credits for Student: "+total_credits);
     }
    }
     class trainer{
        int trainer_id;
        String trainer_Name;
        int sessionsTaken;
        int payment=0;
        public trainer(int trainer_id,String trainer_Name){
            this.trainer_id=trainer_id;
            this.trainer_Name=trainer_Name;
            System.out.println("id and name of the trainer: "+trainer_id+" "+trainer_Name);
        }
        public void trainer_payment(int sessionsTaken,int Student_rating){
           payment=sessionsTaken*1500;
           if(Student_rating==5){
            payment+=5000;
           }
           System.out.println("Total payment for the trainer :"+payment);
        }
     }
