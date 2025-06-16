public class LMS2_Operators {
  public class StudentLMS {
    public static void main(String[] args) {
        // Student Information
        int studentID = 1001;
        String name = "Shaik Sameer";
        int age = 22;

        // Academic Scores
        float quizScore = 8.5f;
        float assignmentScore = 9.0f;
        float examScore = 87.5f;

        // Attendance
        float attendancePercentage = 92.0f;

        // 1. Arithmetic Operators 
        float totalScore = quizScore + assignmentScore + examScore;
        float averageScore = totalScore / 3;

        // 2. Relational Operator 
        boolean isPassing = averageScore >= 35;

        //Increment Operator
        attendancePercentage++; 

        boolean hasHighAttendance = attendancePercentage >= 90;
        boolean qualifiesForAward = isPassing && hasHighAttendance;

        System.out.println("----- Student Report -----");
        System.out.println("ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Quiz Score: " + quizScore);
        System.out.println("Assignment Score: " + assignmentScore);
        System.out.println("Exam Score: " + examScore);
        System.out.println("Total Score: " + totalScore);
        System.out.println("Average Score: " + averageScore);
        System.out.println("Attendance: " + attendancePercentage + "%");

        System.out.println("Passing Status: " + (isPassing ? "Passed" : "Failed"));
        System.out.println("Attendance Award: " + (qualifiesForAward ? "Eligible" : "Not Eligible"));
    }
}

}
