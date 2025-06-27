public class LMS3_conditional {
    public static void main(String[] args) {
        int gradeLevel = 12;
    double baseTuition = 10000.00;
    double discount = 0.0;
    boolean isTopper = true;

    if (gradeLevel >= 9 && gradeLevel <= 12) {
        discount = isTopper ? 0.20 : 0.10;
    } else if (gradeLevel >= 6 && gradeLevel <= 8) {
        discount = 0.05;
    }

    switch (gradeLevel) {
        case 10:
            discount += 0.03;
            break;
        case 12:
            discount += 0.05;
            break;
    }

    double discountedFee = baseTuition - (baseTuition * discount);

    System.out.println("----- Tuition Fee Summary -----");
    System.out.println("Grade Level           : " + gradeLevel);
    System.out.println("Base Tuition Fee      : $" + baseTuition);
    System.out.println("Total Discount        : " + (discount * 100) + "%");
    System.out.println("Tuition After Discount: $" + discountedFee);
}
}


