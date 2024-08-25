public class ReverseString {
    public static void main(String[] args) {

        String name = "Java";
        StringBuilder result = new StringBuilder(name);
        System.out.println(result.reverse().toString());

        
    }

    public static String reverseString(String word) {
        
        int n = word.length();
        StringBuilder result = new StringBuilder();

        for(int i = n - 1; i >= 0; i--) {
            result.append(word.charAt(i));
        }
        

        return result.toString();
    }
}
