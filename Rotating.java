import java.util.Arrays;

public class Rotating {

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 4, 5 };
        int k = 2;

        int[] result = rotating(nums, k);

        System.out.println(Arrays.toString(result));

    }

    /*
     * 1. Array Manipulation
     * Task: Write a function that rotates an array to the right by k steps.
     * Input: An array of integers and an integer k.
     * Output: The rotated array.
     * Concepts: Arrays, loops.
     * Explanation:
     * Rotating an array to the right by k steps means that each element in the
     * array shifts to the right by k positions. The last k elements of the array
     * wrap around and move to the front.
     * 
     * For example, let's consider the array [1, 2, 3, 4, 5] and rotate it by k = 2
     * steps to the right.
     * 
     * Input
     * Array: [1, 2, 3, 4, 5]
     * Integer k: 2
     * Expected Output
     * Rotated Array: [4, 5, 1, 2, 3]
     */

    public static int[] rotating(int[] arr, int k) {

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];

            for (int j = 0; j < arr.length; j++) {
                int pos = i + k;
                if ((pos) < arr.length) {
                    result[pos] = value;

                } else {
                    result[pos - arr.length] = value;
                }
            }
        }

        return result;
    }

}
