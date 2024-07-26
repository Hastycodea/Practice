import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamsPractice {
    public static void main(String[] args) {

        // printing odd numbers between 1 and 20(inclusive);

        IntStream
            .range(1, 21)
            .filter(n -> n % 2 != 0)
            .map(n -> n * 2)
            .forEach(System.out::println);
    }
    public static void first() {
        IntStream
        .range(1, 20)
        .forEach(System.out::print);

    }

    public static void second() {
        IntStream
        .range(1, 10)
        .skip(5) // skipping the first five elements
        .forEach(System.out::print);
        System.out.println();

    }

    public static void sumStream() {
        int number = IntStream
                        .range(1, 5)
                        .sum();
        System.out.println(number);
    }

    public static void namesArray() {
        String[] names = {"Andreh", "Albert", "Nancy", "Kimberly", "Kiaatanui", "Aaron"};

        Arrays.stream(names)
            .filter(s -> s.startsWith("K"))
            .sorted()
            .forEach(System.out::println);
    }
}
