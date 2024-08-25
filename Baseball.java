import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Baseball {
    public static void main(String[] args) {

        List<String> ops = Arrays.asList("5", "2", "C", "D", "+");
        int result = baseBall(ops);

        System.out.println(result);
        
    }

    public static int baseBall(List<String> ops) {
        
        /*
         * + => add the prev two
         * D => double prev
         * C => remove prev
         */

         Stack<Integer> result = new Stack<>();

         for (String op : ops) {
            if (op.equals("+")) {
                int a = result.pop();     
                int b = result.peek();
                result.push(a);
                result.push(a + b);    
                       
            } else if (op.equals("D")) {
                int a = 2 * result.peek();
                result.push(a);
            } else if (op.equals("C")) {
                result.pop();
            } else {
                int c = Integer.valueOf(op);
                result.push(c);
            }
         }

         int sum = 0;

         for(int number : result) {
            sum += number;
         }
        
        return sum;        
    }
}
