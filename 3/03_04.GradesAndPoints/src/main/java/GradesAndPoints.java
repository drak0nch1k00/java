
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]: ");
        int number = scan.nextInt();
        if (number > 100) {
            System.out.println("Grable: incredible! ");
        } else if (number >= 90) {
            System.out.println("Grable: 5 ");
        } else if (number >= 80) {
            System.out.println("Grable: 4 ");
        } else if (number >= 70) {
            System.out.println("Grable: 3 ");
        } else if (number >= 60) {
            System.out.println("Grable: 2 ");
        } else if (number >= 50) {
            System.out.println("Grable: 1 ");
        } else if (number >= 0) {
            System.out.println("Grable: failed ");
        } else if (number < 0) {
            System.out.println("Grabe: impossible!");
        }
    }
}
