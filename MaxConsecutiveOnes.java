public class MaxConsecutiveOnes {
    public static void main(String[] args) {

        int[] numbers = {1,1,1,0,0,0,1,1,1,1,0};
        // int[] numbers2 = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        System.out.println(maxConsecutiveOnes(numbers, 2));
        
    }

    public static int maxConsecutiveOnes(int[] numbers, int k) {
        
        int i = 0;
        int j = 0;

        while (i < numbers.length) {

            if (numbers[i] == 0) k--;

            if (k < 0) {
                if (numbers[j] == 0) {
                    k++;
                }

                j++;
            }

            i++;            
        }        

        return i - j;
    }
}
