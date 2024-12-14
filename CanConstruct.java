import java.util.HashMap;
import java.util.Map;

public class CanConstruct {
    public static void main(String[] args) {
        String ransomNote = "ab";
        String magazine = "aacb";

        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magHash = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            magHash.put(c, magHash.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!magHash.containsKey(c) || magHash.get(c) <= 0) {
                return false;
            }
            magHash.put(c, magHash.get(c) - 1);
        }
        return true;
    }

}
