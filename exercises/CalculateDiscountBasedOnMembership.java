import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String membership = scanner.next();
        double amount = scanner.nextDouble();

        // Step 1: Validate amount
        if (amount < 0) {
            System.out.println("Invalid amount");
        } 
        // Step 2: Check membership and apply discount
        else if (membership.equals("Gold")) {
            double finalAmount = amount - (0.30 * amount);
            System.out.println("Final Amount after Discount: " + finalAmount);
        } 
        else if (membership.equals("Silver")) {
            double finalAmount = amount - (0.20 * amount);
            System.out.println("Final Amount after Discount: " + finalAmount);
        } 
        else if (membership.equals("Regular")) {
            double finalAmount = amount - (0.07 * amount);
            System.out.println("Final Amount after Discount: " + finalAmount);
        } 
        // Step 3: Invalid membership
        else {
            System.out.println("Invalid membership");
        }

        scanner.close();
    }
}