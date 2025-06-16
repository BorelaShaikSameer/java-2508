public class Inventory_management _Operaters {
    public static void main(String[] args){
            String productName = "Wireless Mouse";
    int productQuantity = 15;
    double unitPrice = 25.5;
    int reorderThreshold = 10;
    boolean isAvailableForSale = true;

    double stockValue = productQuantity * unitPrice;

    boolean isBelowReorder = productQuantity < reorderThreshold;
    boolean isAvailable = productQuantity > 0 && isAvailableForSale;

    productQuantity--;

    System.out.println("----- Inventory Status -----");
    System.out.println("Product Name     : " + productName);
    System.out.println("Available Status : " + (isAvailable ? "Available" : "Unavailable"));
    System.out.println("Stock Value      : $" + stockValue);
    System.out.println("Updated Quantity : " + productQuantity);
}
}
