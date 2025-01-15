import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter class code: ");
        String code = scanner.nextLine();

        System.out.print("Enter number of seats: ");
        int seats = scanner.nextInt();

        Room room = new Room(code, seats);

        System.out.println("Room created with code: " + room.getCode());
        System.out.println("Number of seats: " + room.getSeats());

        scanner.close();
    }
}
