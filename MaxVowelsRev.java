public class MaxVowelsRev {
    public static void main(String[] args) {
        String word = "Leetcode";

        System.out.println(maxVowels(word, 3));
        
    }

    public static int maxVowels(String word, int k) {
        int window = 0;
        int ans = 0;
        char[] wordArray = word.toCharArray();

        for(int i=0; i<k; i++) {
            if(isVowel(word.charAt(i))) {
                window++;
            }
        }

        ans = window;

        for(int j = k; j < word.length(); j++) {
            if(isVowel(word.charAt(j))) {
                window++;
            }
            if(isVowel(word.charAt(j-k))) {
                window--;
            }
            ans = Math.max(ans, window);
        }

        return ans;

    }

    public static boolean isVowel(char c) {
        return c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u'; 
    }
    
}
