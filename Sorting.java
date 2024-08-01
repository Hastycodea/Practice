import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {

        // sorting integer array
        int[] numbers = {3, 5, 19, 8, -2, 7, 3, 1};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        // sorting string array
        String[] names = {"Kim", "Zadock", "Paul", "Austine", "Maria"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        // sorting integer in an ArrayList
        ArrayList<Integer> numbersList = new ArrayList<>();
        Collections.addAll(numbersList, 14, 27, 3, 6, 9, 11, -7, 1);
        Collections.sort(numbersList);
        System.out.println(numbersList.toString());

        // sorting strings in an ArrayList
        ArrayList<String> namesList = new ArrayList<>();
        Collections.addAll(namesList, "Kimberly", "Tony", "Stack", "Barbra", "Paul", "Zendaya");
        // System.out.println(namesList.toString());
        Collections.sort(namesList);
        System.out.println(namesList.toString());
    }
}
