public class TwoSum {
    public static void main(String[] args) {
        
    }

    public static int[] twoSum(int[] arr, int sum) {
        int[] result = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i == j) continue;
                int total = arr[i] + arr[j];
                if(total - sum == 0) {
                    result[0] = arr[i];
                    result[1] = arr[j];
                }
            }
        }

        return result;
    }
}
