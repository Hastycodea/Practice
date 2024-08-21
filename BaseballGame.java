import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BaseballGame {
    public static void main(String[] args) {

        List<String> values = Arrays.asList("5", "-2", "4", "C", "D", "9", "+", "+");

        System.out.println(strangeRules(values));
        
    }

    public static int strangeRules(List<String> ops) {
        Stack<Integer> scores = new Stack<>();

        for(String op : ops) {
            if (op.equals("+")) {
                int a = scores.pop();
                int b = scores.peek();
                int c = a + b;
                scores.push(a);
                scores.push(c);
            } else if (op.equals("D")) {
                int total = scores.peek() * 2;
                scores.push(total);
            } else if (op.equals("C")) {
                scores.pop();
            } else {
                int value = Integer.valueOf(op);
                scores.push(value);
            }
        }

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }

        return sum;
    }
}
