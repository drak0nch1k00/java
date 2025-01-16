import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Statistics totalSum = new Statistics();
        Statistics evenSum = new Statistics();
        Statistics oddSum = new Statistics();

        System.out.println("Enter numbers:");

        while (true) {
            int number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            totalSum.addNumber(number);

            if (number % 2 == 0) {
                evenSum.addNumber(number);
            } else {
                oddSum.addNumber(number);
            }
        }

        System.out.println("Sum: " + totalSum.sum());
        System.out.println("Sum of even numbers: " + evenSum.sum());
        System.out.println("Sum of odd numbers: " + oddSum.sum());
    }
}
