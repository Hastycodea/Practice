public class MaxNumberArray {
    public static void main(String[] args) {
        int[] numbers = {100, 200, 300, 400};
        int k = 2;

        System.out.println(maxNumberArray(numbers, k));
        
    }

    public static int maxNumberArray(int[] arr, int k) {
        int n = arr.length;
        int currSum = 0;

        for(int i = 0; i < k; i++) {
            currSum += arr[i];
        }

        int result = currSum;
        for(int j = k; j < n; j++) {
            currSum = currSum + arr[j] - arr[j - k];
            result = Math.max(currSum, result);
        }

        return result;        
    }
}
