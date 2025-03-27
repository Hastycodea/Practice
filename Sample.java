import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        String s = "Hackerrank ";

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        scan.nextLine();

        System.out.print("Enter your name: ");
        String s2 = scan.nextLine();

        System.out.println(s2 + " is of age " + age);
    }
    
}
