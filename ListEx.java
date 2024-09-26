import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

        // // removing an element from a list
        // numbers.remove(Integer.valueOf(12));

public class ListEx {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        Collections.addAll(numbers, 12, 8, 9, 12, 1, -3, 7, 12, 2, -6);

        // for(int num : numbers) {
        //     if (num == 12) {
        //         int i =numbers.indexOf(num);
        //         numbers.remove(i);                
        //     }

        // }


        // System.out.println(numbers.toString());

        List<Integer> result = numbers.stream()
                                            .filter(n -> n > 4)
                                            .collect(Collectors.toList());  //.collect(Collectors.toCollection(ArrayList::new))


        result.forEach(System.out::println);


        int sum = result.stream().mapToInt(Integer::intValue).sum();  // summing values in a list usng stream => .reduce(0, Integer::sum)
        System.out.println("Sum : " + sum);








    }


    
}
