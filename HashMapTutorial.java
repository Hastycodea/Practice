import java.util.HashMap;
import java.util.Map;

public class HashMapTutorial {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");

        HashMap<Integer, String> numbersMap = new HashMap<>();
        numbersMap.put(1, "one");
        numbersMap.put(4, "four");
        numbersMap.put(5, "five");
        numbersMap.put(6, "six");
        numbersMap.put(7, "seven");

        System.out.println("To String() print of HashMap");
        System.out.println(numbersMap.toString());

        System.out.println("Printing all the keys");

        for (int key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println("Printing all the values");

        for (String value : map.values()) {
            System.out.println(value);
        }


        System.out.println("Printing the keyset");

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry);
        }

        // System.out.println(map.get(3));

        // System.out.println(map.getOrDefault(4, "not present"));

        // testing entryset
        // for(Map.Entry<Integer, String> entry : map.entrySet()) {
        // // System.out.println(entry);
        // if(entry.getValue().equals("two")) System.out.println(entry.getKey() + " was
        // found!");
        // if(entry.getValue().equals("four")) System.out.println(entry.getKey() + " was
        // found!");
        // if(entry.getValue().equals("five")) System.out.println(entry.getKey() + " was
        // found!");
        // }
    }
}
