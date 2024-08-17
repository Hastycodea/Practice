import java.util.ArrayList;
import java.util.Collections;

        // // removing an element from a list
        // numbers.remove(Integer.valueOf(12));

public class ListEx {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        Collections.addAll(numbers, 12, 8, 9, 12, 1, -3, 7, 12, 2, -6);

        for(int num : numbers) {
            if (num == 12) {
                int i =numbers.indexOf(num);
                numbers.remove(i);                
            }

        }


        System.out.println(numbers.toString());






    }


    
}
