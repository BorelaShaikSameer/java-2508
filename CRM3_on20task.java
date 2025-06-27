// File: CRMLoyaltyTracker.java
import java.util.Scanner;

public class  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---- Customer Module ----
        System.out.print("Enter Customer ID: ");
        int customerId = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();

        Customer customer = new Customer(customerId, customerName);

        System.out.print("How many interactions has the customer had? ");
        int interactions = sc.nextInt();
        customer.trackInteraction(interactions);

        System.out.print("Enter total deal value (₹): ");
        double dealValue = sc.nextDouble();
        customer.handleDeal(dealValue);

        customer.displayLoyaltyStatus();

        System.out.println("\n----- Salesperson Info -----");

        // ---- Salesperson Module ----
        System.out.print("Enter Salesperson ID: ");
        int salespersonId = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Salesperson Name: ");
        String salespersonName = sc.nextLine();

        Salesperson salesperson = new Salesperson(salespersonId, salespersonName);

        System.out.print("Enter number of deals closed: ");
        int dealsClosed = sc.nextInt();

        System.out.print("Rate the salesperson (1 to 5): ");
        int rating = sc.nextInt();

        salesperson.calculateEarnings(dealsClosed, rating);

        salesperson.displayEarnings();

        sc.close();
    }
}
