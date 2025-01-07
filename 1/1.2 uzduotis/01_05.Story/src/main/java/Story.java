
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String input = scanner.nextLine();
        System.out.println("What is their job?");
        String input2 = scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + input + ", who was " + input2 + ".");
        System.out.println("On the way to work, " + input + " reflected on life.");
        System.out.println("Perhaps " + input + " will not be " + input2 + " forever.");


    }
}
