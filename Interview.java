import java.util.HashMap;
import java.util.Map;

public class Interview {
    public static void main(String[] args) {
        // System.out.println(reverseString("Andreh"));
        // String name = "Andreh Brian Andere - 45 / #";
        // System.out.println(name.replaceAll("[^a-zA-Z0-9]", "").toLowerCase());
		// String name = "A man, a plan, a canal, Panama!";
        // String ship = "titanic";
        // System.out.println(palindrome(name));
        // System.out.println(palindrome(ship));

        Map<String, Integer> students = new HashMap<>();

        students.put("Andreh", 45);
        students.put("Kim", 43);

        // print all
        System.out.println(students.toString());

        // get value
        System.out.println(students.get("Andreh"));

        // confirm key
        System.out.println(students.containsKey("Kim"));

        // iterating all values and key
        for ( Map.Entry<String, Integer> map : students.entrySet() ) {
            System.out.println(map.getKey() + ":" + map.getValue());
        }

    }

    public static String reverseString(String word) {
        
        String result = "";

        for(int i=0; i<word.length(); i++) {
            result = word.charAt(i) + result;
        }

        return result;
    }

    public static boolean palindrome(String word) {

        String cleanWord = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
        String reverseWord = "";

        for(int i=0; i<cleanWord.length(); i++) {
            reverseWord = cleanWord.charAt(i) + reverseWord;
        }

        if(cleanWord.equals(reverseWord)) {
            return true;
        }

        return false;
    }
}
