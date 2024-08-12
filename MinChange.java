import java.util.List;
import java.util.HashMap;

public class MinChange{
	public static void main(String[] args) {
			List<Integer> coins = List.of(1, 2, 3, 4);
			int amount = 5;
			int result = minChange(amount, coins);
			System.out.println(result);
		}
	
	public static int minChange(int amount, List<Integer> coins) {
		return minChange(amount, coins, new HashMap<>());
	}

	public static int minChange(int amount, List<Integer> coins, HashMap<Integer, Integer> memo) {
		if(amount == 0) {
			return 0;
		}

		if(amount < 0) {
			return -1;
		}	
		
		if(memo.containsKey(amount)) {
			return memo.get(amount);
		}

		int minCoins = -1;
		for(int coin : coins) {
			int subAmount = amount - coin;
			int subCoins =  minChange(subAmount, coins, memo);
		
			if(subCoins != -1) {	
			int numCoins = subCoins + 1;

				if(numCoins < minCoins || minCoins == -1) {
					minCoins = numCoins;
			}	
		}	
	}

	memo.put(amount, minCoins);
	return minCoins;
}


}
