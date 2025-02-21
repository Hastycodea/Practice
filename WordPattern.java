import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat dog dog";

        System.out.println(wordPattern(pattern, s));
        
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if(pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> charToWord = new HashMap<>();
        HashSet<String> repeatedWords = new HashSet<>();
        

        for(int i = 0; i<pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];

            if(charToWord.containsKey(c)) {
                if(!charToWord.get(c).equals(w)) {
                    return false;
                } 

            } else {
                if(repeatedWords.contains(w)) {
                    return false;
                }

                charToWord.put(c, w);
                repeatedWords.add(w);
            }

        }
        return true;
    }
    
}
