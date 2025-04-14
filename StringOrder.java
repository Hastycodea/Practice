import java.util.Scanner;

public class StringOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a word to manipulate: ");
        String word = scan.nextLine();

        char[] wordArray = word.toCharArray();
        
        for(int i=0; i<wordArray.length; i=i+2){
            System.out.print(wordArray[i]);
        }
        System.out.print(" ");
        for(int j=1; j<wordArray.length; j=j+2){
            System.out.print(wordArray[j]);
        }

        System.out.println();
        
    }
    
}
