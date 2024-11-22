import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {
        Random rand = new Random();
        // int number = rand.nextInt(100); // range from 0-99 inclusive
        // int number2 = rand.nextInt(100) + 1; // range from 1-100 inclusive

        // How many random numbers should be printed?
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many digits random digits should be printed? ");
        int input = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < input; i++) {
            int randomNumber = rand.nextInt(11);
            System.out.println(randomNumber);
        }

    }
    
}
