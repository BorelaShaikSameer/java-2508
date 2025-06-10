import java.lang.invoke.StringConcatFactory;

public class CollegeAdmission {
   public static void StudentDetails(){
     String LastName="borela";
     String FirstName="Sameer";
     String MiddleNAme="Shaik";
     String Address="Nandyal dist Andrapradesh India";
     String DOB="15-04-2004";
    String Citizenship="India";
    char Sex='M';
    String phoneNumber="9398428018";
    String Religion="Muslim";
    String nameofSpouse="na";
    System.out.println("Student details");
    System.out.println("lastname of the student :"+LastName);
    System.out.println(" first name of the student :"+ FirstName);
    System.out.println("Middle name of the Student :"+MiddleNAme);
    System.out.println("complete Address of the student :"+Address);
    System.out.println(" date of birth of the Student :"+DOB);
    System.out.println("Citizenship of the Student :"+Citizenship);
    System.out.println("Gender of the student :"+Sex);
    System.out.println("cobtact number of the student :"+phoneNumber);
    System.out.println("Name of the spouse :"+nameofSpouse);
     System.out.println("========================================================================================");
   } 
   public static void FatherDetails(){
    String name="ChandBasha";
    String occupation="Bussiness";
    String ContactNumber="8121112345";
    
    System.out.println("========================================================================================");
   System.out.println("Details of FAther :");
    System.out.println("name of the father :"+name);
   System.out.println("occupation of the Father :"+occupation);
   System.out.println("Contact number of father :"+ContactNumber);
   }
   public static void highschooldetails(){
    String SchoolNAme="Nation collegee NAndyal";
    int yearofpassout=2021;
    float f=56.1f;
    String Course="MPC";
    System.out.println("========================================================================================");
    System.out.println("details of schooling ");
    System.out.println("SchoolNAme is :"+SchoolNAme);
    System.out.println("year of passout :"+yearofpassout);
    System.out.println("percentage is :"+f);
    System.out.println("Studied Course is :"+Course);
   }
   public static void main(String[] args) {
    StudentDetails();
    FatherDetails();
    highschooldetails();
   }
}
