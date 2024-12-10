import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CloseWords {
    public static void main(String[] args) {

        String word1 = "abc";
        String word2 = "cba";

        String word3 = "abc";
        String word4 = "cba";

        System.out.println(closeWords(word1, word2));

    }

    public static boolean closeWords(String word1, String word2) {
        
        if(word1.length() != word2.length()) return false;

        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        
        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for(char c : word1.toCharArray()) {
            count1[c - 'a']++;
            set1.add(c);
        }

        for(char c : word2.toCharArray()) {
            count2[c - 'a']++;
            set2.add(c);
        }

        Arrays.sort(count1);      
        Arrays.sort(count2);
        
        return Arrays.equals(count1, count2) && set1.equals(set2);
    }
}
