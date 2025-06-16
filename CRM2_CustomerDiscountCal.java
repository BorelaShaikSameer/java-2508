public class CRM2_CustomerDiscountCal {
    public static void main(String[] args) {
            int customerId = 101;
    String customerName = "Rahul Sharma";
    boolean isPremium = false;
    int yearsPartnership = 4;
    String dealStage = "Negotiation";
    double dealValue = 25000.00;

    double baseDiscount = isPremium ? 0.10 : (yearsPartnership >= 3 ? 0.05 : 0.0);
    double extraDiscount = 0.0;

    switch (dealStage) {
        case "Proposal":
            extraDiscount = 0.02;
            break;
        case "Negotiation":
            extraDiscount = 0.03;
            break;
        case "Closed":
            extraDiscount = 0.05;
            break;
    }

    double totalDiscount = baseDiscount + extraDiscount;
    double finalDealValue = dealValue - (dealValue * totalDiscount);

    System.out.println("----- CRM Deal Summary -----");
    System.out.println("Customer ID        : " + customerId);
    System.out.println("Customer Name      : " + customerName);
    System.out.println("Premium Status     : " + isPremium);
    System.out.println("Years of Partnership: " + yearsPartnership);
    System.out.println("Deal Stage         : " + dealStage);
    System.out.println("Original Deal Value: $" + dealValue);
    System.out.println("Base Discount      : " + (baseDiscount * 100) + "%");
    System.out.println("Extra Discount     : " + (extraDiscount * 100) + "%");
    System.out.println("Total Discount     : " + (totalDiscount * 100) + "%");
    System.out.println("Final Deal Value   : $" + finalDealValue);
}

    }
