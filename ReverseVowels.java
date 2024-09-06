public class ReverseVowels {
    public static void main(String[] args) {

        String name = "Andreh";
        System.out.println(reverseVowels(name));
        
    }

    public static String reverseVowels(String word) {
        int n = word.length();
        int start = 0;
        int end = n - 1;
        String vowels = "aeiouAEIOU";
        char[] wordArray = word.toCharArray();

        while (start < end) {
            while (start < end && vowels.indexOf(wordArray[start]) == -1){
                start++;
            }

            while (start < end && vowels.indexOf(wordArray[end]) == -1) {
                end--;
            }

            //swapping
            char temp = wordArray[start];
            wordArray[start] = wordArray[end];
            wordArray[end] = temp;

            start++;
            end--;
        }

        String result = new String(wordArray);

        return result;
    }
}
