
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" ");
        int number = scan.nextInt();
        if (number >= 0 && number <= 120) {
            System.out.println("OK");

        } else {
            System.out.println("Impossible!");
        }


    }
}
