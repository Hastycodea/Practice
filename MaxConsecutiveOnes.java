public class MaxConsecutiveOnes {
    public static void main(String[] args) {

        int[] numbers = {1,1,1,0,0,0,1,1,1,1,0};
        int[] numbers2 = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        System.out.println(maxConsecutiveOnes(numbers2, 3));
        
    }

    public static int maxConsecutiveOnes(int[] numbers, int k) {
        
        int maxCount = 0;
        int count = 0;
        int zeroCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 1 || (numbers[i] == 0 && zeroCount < k)) {
                count++;
            }

            maxCount = count;

            if (numbers[i] == 0) {
                zeroCount++;
            }

            if (zeroCount == k) {
                count = 0;
                zeroCount = 0;                
            }

            maxCount = Math.max(count, maxCount);
        }

        return maxCount;
    }
}
