import java.util.HashMap;

public class HashReview {
    public static void main(String[] args) {
        HashMap<Integer, String> ids = new HashMap<>();

        ids.put(2, "two");
        ids.put(3, "three");
        ids.put(4, "four");

        


        ids.keySet().stream().forEach(System.out::println);
        ids.values().stream().forEach(System.out::println);
    }
}
