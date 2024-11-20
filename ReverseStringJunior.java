public class ReverseStringJunior {
    public static void main(String[] args) {

        String word = "hello";
        String word1 = "kankan";
        String sentence = "Andreh made it to the top";

        int length = word.length();

        String reverse = "";

        for (int i = 0; i < length; i++) {
            reverse = word.charAt(i) + reverse;
        }

        System.out.println(reverse);

    }
}
