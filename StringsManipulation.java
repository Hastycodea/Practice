import java.util.Arrays;

public class StringsManipulation {
    public static void main(String[] args) {
        String name = "Kankan";
        String subName = "Kan";

        int[] numbers = {1, 2, 4, 5, 6};
        System.out.println(Arrays.toString(numbers));

        String result = name.substring(0, 2);
        System.out.println(result);

        System.out.println(name.contains(subName));
    }
}
