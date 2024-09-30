import java.util.HashMap;
import java.util.Map;

public class HashMapTutorial {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        // System.out.println(map.get(3));

        // System.out.println(map.getOrDefault(4, "not present"));
        
        // testing entryset
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            // System.out.println(entry);
            if(entry.getValue().equals("two")) System.out.println(entry.getKey() + " was found!");
        }
    }
}
