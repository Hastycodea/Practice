import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {

        String s = "4[bc]2[c]";
        System.out.println(decodeString(s));
        
    }

    public static String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> sbStack = new Stack<>();

        int k = 0;
        StringBuilder result = new StringBuilder();

        for(char c : s.toCharArray()) {
            if(Character.isDigit(c)) {
                k = 10 * k + (c - '0');

            } else if(c == '[') {
                numStack.push(k);
                sbStack.push(result);

                k = 0;
                result = new StringBuilder();

            } else if (c == ']') {
                StringBuilder sb = sbStack.pop();
                int repeat = numStack.pop();

                for(int i = 0; i < repeat; i++) {
                    sb.append(result);
                }

                result = sb;

            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
    
}
