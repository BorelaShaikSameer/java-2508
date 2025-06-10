import java.sql.Date;
import java.time.LocalDate;

public class CRMSystem {
     public static void main(String[] args) {
        printCustomerDetails();
        printSalesLeadDetails();
        printInteractionDetails();
        printSalesOpportunityDetails();
        printSupportTicketDetails();
    }

    static void printCustomerDetails() {
        int customerId = 101;
        String name = "Ravi Krishna";
        String email = "ravi.krishna@example.com";
        String phoneNumber = "9876543210";
        String address = "Hyderabad, India";
        LocalDate registrationDate = LocalDate.of(2024, 5, 1);

        System.out.println("----- Customer -----");
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Registered On: " + registrationDate);
        System.out.println();
    }

    static void printSalesLeadDetails() {
        int leadId = 201;
        String customerName = "Anita Sharma";
        String contactEmail = "anita@example.com";
        String contactNumber = "9123456780";
        String source = "Website";
        String status = "New";
        LocalDate createdDate = LocalDate.of(2025, 6, 10);

        System.out.println("----- Sales Lead -----");
        System.out.println("Lead ID: " + leadId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Email: " + contactEmail);
        System.out.println("Phone: " + contactNumber);
        System.out.println("Source: " + source);
        System.out.println("Status: " + status);
        System.out.println("Created On: " + createdDate);
        System.out.println();
    }

    static void printInteractionDetails() {
        int interactionId = 301;
        int customerId = 101;
        String interactionType = "Email";
        LocalDate date = LocalDate.of(2025, 6, 9);
        String notes = "Follow-up on product demo";
        String handledBy = "Sales Executive";

        System.out.println("----- Interaction -----");
        System.out.println("Interaction ID: " + interactionId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Type :"+handledBy);
        System.out.println("Type: " + interactionType);
        System.out.println("Date: " + date);
        System.out.println("Notes: " + notes);
        System.out.println("Handled By: " + handledBy);
        System.out.println();
    }

    static void printSalesOpportunityDetails() {
        int opportunityId = 401;
        int customerId = 101;
        float value = 50000.0f;
        LocalDate expectedCloseDate = LocalDate.of(2025, 7, 5);
        String stage = "Negotiation";
        String status = "Open";

        System.out.println("----- Sales Opportunity -----");
        System.out.println("Opportunity ID: " + opportunityId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Value: ₹" + value);
        System.out.println("Expected Close: " + expectedCloseDate);
        System.out.println("Stage: " + stage);
        System.out.println("Status: " + status);
        System.out.println();
    }

    static void printSupportTicketDetails() {
        int ticketId = 501;
        int customerId = 101;
        String issueType = "Technical";
        String description = "Login failure issue";
        String status = "Open";
        LocalDate createdDate = LocalDate.of(2025, 6, 10);
        LocalDate resolvedDate = null; // Not yet resolved

        System.out.println("----- Support Ticket -----");
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Issue Type: " + issueType);
        System.out.println("Description: " + description);
        System.out.println("Status: " + status);
        System.out.println("Created On: " + createdDate);
        System.out.println("Resolved On: " + resolvedDate);
        System.out.println();
    }
}