package fifteen_polymorphism;

import java.util.Random;

public abstract class AbstractPayment {
private String transactionId;
public abstract void processPayment(double amount);
public String getTransactionId(){
    Random  randomID= new Random();
    transactionId="TX-ID-"+randomID.nextInt(1000000);
    return transactionId;
}
public void generateReceipt(String transactionId){
    System.out.println("receipt generated for transaction ID: " + transactionId);
}

}
