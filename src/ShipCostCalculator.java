import java.util.Scanner;
public class ShipCostCalculator {
    public static void main(String[] args) {
        double itemPrice = 0;
        double FREE_SHIPPING_PRICE = 100.00;
        double shippingFee = 0;
        System.out.println("Please enter the cost of the item.");
        Scanner input = new Scanner(System.in);
        itemPrice = input.nextDouble();
        if (itemPrice < FREE_SHIPPING_PRICE) {shippingFee = 0.02;}
        double totalCost = itemPrice + (itemPrice * shippingFee);
        System.out.println("The total cost is " + totalCost + " dollars.");
    }
}
