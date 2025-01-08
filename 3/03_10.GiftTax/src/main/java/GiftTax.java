
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift? ");
        double giftValue = scan.nextDouble();
        if (giftValue >= 5000) {
            double tax = 0;
            if (giftValue <= 25000) {
                tax = 100 + (giftValue - 5000) * 0.08;
            } else if (giftValue <= 55000) {
                tax = 1700 + (giftValue - 25000) * 0.10;
            } else if (giftValue <= 100000) {
                tax = 4700 + (giftValue - 55000) * 0.12;
            } else if (giftValue <= 142100) {
                tax = 22100 + (giftValue - 100000) * 0.15;
            } else {
                tax = 47000 + (giftValue - 142100) * 0.17;
            }
            System.out.println("Tax: " + tax);
        } else {
            System.out.println("No tax!");
        }
    }
}
