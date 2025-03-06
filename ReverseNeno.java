public class ReverseNeno {

    public static void main(String[] args) {

        System.out.println(ReverseWord("Andreh"));
        
    }

    public static String ReverseWord(String word) {

        String result = "";

        for(int i = word.length() - 1; i >= 0; i--) {
            result += word.charAt(i);
        }
        
        return result;

    }
    
}
