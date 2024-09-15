import java.util.Arrays;
import java.util.List;

public class AverageUniqueValues {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, -3, 10, 20, 5, -1);
        System.out.println(averageUnique(numbers));
        
    }

    public static double averageUnique(List<Integer> numbers) {

        // stream

        double average = numbers.stream()
                                .filter(n -> n > 0)
                                .distinct()
                                .mapToDouble(Integer::doubleValue) //method reference
                                .average()
                                .getAsDouble();

        return average;

    }
    
}
