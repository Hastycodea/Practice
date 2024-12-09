public class SingleNumber {
    public static void main(String[] args) {

        int[] nums = {3, 4, 4, 5, 6, 5, 6};

        System.out.println(singleNumber(nums));
        
    }

    public static int singleNumber(int[] nums) {
        int result = 0;

        for(int i=0; i<nums.length; i++) {
            // XOR operation num xor num = 0,, num xor 0 = num 
            result ^= nums[i];
        }


        return result;
    }
    
}
