
import javax.sound.sampled.Line;
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Password? ");
        String text = scan.nextLine();
        if (text.equals("Caput Draconis")) {
            System.out.println("Welcome!");
        } else {
            System.out.print("Off with you!");
        }
        // Write your program here 
    }
}
