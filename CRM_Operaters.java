   public class CRM_Operaters{
public static void main(String args[]){
   int customerId = 101;
    String customerName = "Jane Doe";
    double totalPurchases = 4500.0;
    int interactionCount = 12;

    int leadId = 501;
    double leadBudget = 3200.0;
    boolean isContacted = false;

    double opportunityValue = 6000.0;
    boolean isClosed = false;

    double averagePurchaseValue = totalPurchases / interactionCount;
    boolean isHighValueOpportunity = opportunityValue > 5000;
    boolean shouldPrioritizeLead = (leadBudget > 3000) && !isContacted;

    interactionCount++;

    System.out.println("----- CRM System Report -----");

    System.out.println("Customer ID                : " + customerId);
    System.out.println("Customer Name              : " + customerName);
    System.out.println("Total Purchases            : $" + totalPurchases);
    System.out.println("Interactions               : " + interactionCount);
    System.out.println("Average Purchase Value     : $" + averagePurchaseValue);

    System.out.println();
    System.out.println("Lead ID                    : " + leadId);
    System.out.println("Lead Budget                : $" + leadBudget);
    System.out.println("Contacted                  : " + isContacted);
    System.out.println("Should Prioritize Lead     : " + shouldPrioritizeLead);

    System.out.println();
    System.out.println("Opportunity Value          : $" + opportunityValue);
    System.out.println("Is Opportunity Closed      : " + isClosed);
    System.out.println("Is High Value Opportunity  : " + isHighValueOpportunity);
}
   }
