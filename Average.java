import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Average {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 5, 10, -3, 5, 10, 20, -1);

        System.out.println(calculateAverageOfUniquePositiveNumbers(numbers));
        
    }

    public static double calculateAverageOfUniquePositiveNumbers(List<Integer> numbers) {
        return numbers.stream()
                        .filter(n -> n > 0)
                        .distinct()
                        .mapToDouble(Integer::doubleValue)
                        .average()
                        .getAsDouble();
    }
}
