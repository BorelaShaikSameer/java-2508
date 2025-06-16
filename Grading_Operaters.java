public class Grading_Operaters {
    public static void main(String[] args) {
            String studentName = "Anita Sharma";
    int subject1 = 60;
    int subject2 = 55;
    int subject3 = 70;

    int totalMarks = subject1 + subject2 + subject3;
    double average = totalMarks / 3.0;

    boolean passedAll = subject1 >= 50 && subject2 >= 50 && subject3 >= 50;
    boolean isPass = average >= 50;
    boolean highPerformance = passedAll && average >= 70;

    System.out.println("----- Student Result -----");
    System.out.println("Student Name : " + studentName);
    System.out.println("Subject 1    : " + subject1);
    System.out.println("Subject 2    : " + subject2);
    System.out.println("Subject 3    : " + subject3);
    System.out.println("Average      : " + average);
    System.out.println("Result       : " + (isPass ? "Pass" : "Fail"));
}

    }
