import java.util.List;

public class SumPossible {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(6, 3, 9);
        int amount = 12;
        boolean result = sumPossible(amount, numbers);
        System.out.println(result);
        
    }

    public static boolean sumPossible(int amount, List<Integer> numbers) {
        if(amount == 0) return true;

        if(amount < 0) return false;

        for(int number : numbers) {
            int subAmount = amount - number;
            if (sumPossible(subAmount, numbers)) {
                return true;
            }
        }
        return false;
    }
}
