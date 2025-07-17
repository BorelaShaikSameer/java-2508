package fifteen_polymorphism;

import java.util.Scanner;

public class NetBankingPayment extends AbstractPayment {
    private String  bankName;
    public String getBankName(){
        return bankName;
    }   
    public void setBankName(String bankName){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter bank name");
        bankName += sc.next();
        sc.nextLine(); // buffer
        this.bankName = bankName;
    }
     @Override
    public void processPayment(double amount) {
        
        System.out.println("Processing net banking payment of amount: " + amount);
        
    }
    

}
