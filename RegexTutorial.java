
public class RegexTutorial {
    public static void main(String[] args) {
        String word = "01[a-z]{3}";
        String result = "01ghk";

        if (result.matches(word)) {
            System.out.println("True");
        } else {
            System.out.println("Wrong word");
        }

    }
}