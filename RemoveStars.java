import java.util.Stack;

public class RemoveStars {
    public static void main(String[] args) {

        String name = "leet**cod*e";
        // String result = name.replaceAll("\\*", "");

        System.out.println(removeStars(name));

        
        
    }

    public static String removeStars(String word) {

        Stack<Character> wordCharacters = new Stack<>();

        for(char c : word.toCharArray()) {
            if (c == '*' && !wordCharacters.isEmpty()) {
                wordCharacters.pop();
            } else {
                wordCharacters.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();

        // for(int i = wordCharacters.size() - 1; i >= 0; i--) {
        //     sb.append(wordCharacters.get(i));
        // }

        for(char c : wordCharacters) {
            sb.append(c);
        }

        String result = sb.toString();

        return result;
    }
}
