import java.util.Scanner;

public class User {

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.println("Your name is "+ name);
        }
    }
    
}
    