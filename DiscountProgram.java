import java.util.Scanner;

public class DiscountProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();
        double discount = 0;

        if (amount >= 500 && amount <= 1000) {
            discount = amount * 0.10;
        } else if (amount > 1000) {
            discount = amount * 0.20;
        }

        double finalAmount = amount - discount;
        System.out.println("Discount: " + discount);
        System.out.println("Final amount to pay: " + finalAmount);
        sc.close();
    }
}
