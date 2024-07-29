import java.util.HashMap;
import java.util.List;

public class SumPossible {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(6, 3, 9);
        int amount = 12;
        boolean result = sumPossible(amount, numbers);
        System.out.println(result);
        
    }

    public static boolean sumPossible(int amount, List<Integer> numbers) {
        return sumPossible(amount, numbers, new HashMap<>());
    }

    public static boolean sumPossible(int amount, List<Integer> numbers, HashMap<Integer, Boolean> memo) { 
        if(amount == 0) return true;

        if(amount < 0) return false;

        if (memo.containsKey(amount)) {
            return memo.get(amount);
        }

        for(int number : numbers) {
            int subAmount = amount - number;
            if (sumPossible(subAmount, numbers)) {
                memo.put(number, true);
                return true;
            }
        }
        memo.put(amount, false);
        return false;
    }
}
