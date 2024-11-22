import java.util.HashMap;
import java.util.Map;

public class MapFunctions {
    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();

        students.put("Junior", 8939);
        students.put("Andreh", 4331);
        students.put("Junior5", 8739);
        students.put("Kunior", 8932);
        students.put("Kunior", 892);


        System.out.println(students);

        // getting the values
        String person = "Andreh";
        System.out.println(person + " : " + students.get(person));
        System.out.println("Kim : " + students.getOrDefault("Kim", 33));

        // checking if it contains key or value
        System.out.println("Contains Junior: " + students.containsKey("Junior"));
        System.out.println("Contains value: " + students.containsValue(111));

        // iterating using keys
        for(String key : students.keySet()) {
            System.out.println(students.get(key));

        }

        

        // iterating using values
        for(int value : students.values()) {
            System.out.println(value);
        }

        // iterating KV Pairs
        for(Map.Entry<String, Integer> pairs : students.entrySet()) {
            System.out.println(pairs.getKey() + ": " + pairs.getValue());
        }

        // using stream APIs
        System.out.println("Using Stream APIs");
        students.values().stream()
                            .forEach(v -> System.out.println(v));

        System.out.println("Printing the keys");
        students.keySet().stream().forEach(System.out::println);

        System.out.println("Printing the KV pairs");
        students.entrySet().stream().forEach(s -> System.out.println(s.getKey() + ": " + s.getValue()));
        
    }
}
