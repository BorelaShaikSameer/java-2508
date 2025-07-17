package fifteen_polymorphism;
import java.util.Scanner;
public class CreditCardPayment extends AbstractPayment {
private int cardNumber;
public int getCardNumber() {
    return cardNumber;

}
public void setCardNumber(int cardNumber) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Credit Card Number");
    cardNumber = sc.nextInt();
    this.cardNumber = cardNumber;
}

@Override
public void processPayment(double amount) {
    System.out.println("Processing credit card payment of amount: " + amount);
}
}