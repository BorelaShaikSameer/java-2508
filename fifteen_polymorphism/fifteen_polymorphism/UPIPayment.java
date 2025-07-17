package fifteen_polymorphism;

import java.util.Scanner;

public class UPIPayment extends AbstractPayment {
   private String  upiId; 
   private String UPIPaymentType;

    public void setUpiId(String upiID) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter UPI ID");
        sc.nextLine(); // buffer
        upiId = sc.next();
        this.upiId = upiId;
        sc.close();
    }
     public String getUpiId() {
         return upiId;
    }

    public void setUPIPaymentType(String UPIPaymentType) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter UPI Payment Type");
        sc.nextLine(); // buffer
        UPIPaymentType = sc.next();
        this.UPIPaymentType = UPIPaymentType;
    }
       public String getUPIPaymentType() {
        return UPIPaymentType;
    }
    @Override
    public void processPayment(double amount) {
        System.out.println("upi payment of amount: " + amount);
    }
    
    

}
