import java.util.Scanner;

public class ValidInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter a number: ");
                int number = Integer.parseInt(scanner.nextLine());
                validInput = true;

            } catch (Exception e) {
                System.out.println("Invalid input");
            }            
        }
    }
}
