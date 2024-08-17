import java.util.Stack;

public class turing {

    public static void main(String[] args) {

        String[] values = {"5", "2", "C", "D", "+"};
        System.out.println(hockeyResult(values));
        
    }

    //to be reviewed
    public static int hockeyResult(String[] ops) {

        Stack<Character>  values = new Stack<>();
        Stack<Integer> newStack = new Stack<>();

        char[] result = ops.toString().toCharArray();

        for(int i = ops.length - 1; i >= 0; i--) {
            values.push(result[i]);
        }

        for(char c : values) {
            if (Character.isDigit(c)) {
                newStack.push(Integer.valueOf(c));                
            } else if(c == '+') {
                int a = newStack.pop();
                int add = a + newStack.peek();

                newStack.push(add);
            } else if(c == 'D') {
                int add = newStack.peek() * 2;
                newStack.push(add);
            } else if(c == 'C') {
                newStack.pop();
            }
        }

        int sum = 0;

        for(int i : newStack) {
            sum += i;
        }

        return sum;
    }
    
}
