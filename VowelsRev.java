public class VowelsRev {

    public static void main(String[] args) {

        String word = "Monica";
        System.out.println(reverseVowels(word));
        
    }

    public static String reverseVowels(String word) {
        char[] words = word.toCharArray();
        int start = 0;
        int end = words.length - 1;

        String vowels = "aeiouAEIOU";

        while(start < end) {

            if(start < end && vowels.indexOf(word.charAt(start)) == -1) {
                start++;
            }

            if(start < end && vowels.indexOf(word.charAt(end)) == -1) {
                end--;
            }

            char temp = word.charAt(start);
            words[start] = word.charAt(end);
            words[end] = temp;


            start++;
            end--;
        }

        String result = new String(words);
        return result;
    }
    
}
