public class Paleen {

    public static void main(String[] args) {
         System.out.println(Ndrome("ouyo"));

    }

    public static boolean Ndrome(String word) {
        StringBuilder sb = new StringBuilder(word);
        if (word.equals(sb.reverse().toString())) {
            return true;
        }

        return false;
    }

}
