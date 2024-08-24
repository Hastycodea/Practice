import java.util.Arrays;

public class ArrayMax {
    public static void main(String[] args) {
        int[][] arrayValues = {
                { 23, 45, 78, 12 },
                { 56, 90, 34, 67 },
                { 89, 21, 43, 76 }
            };

        int[] result = maxEachCol(arrayValues);

        System.out.println(Arrays.toString(result));


    }

    public static int[] maxEachRow(int[][] values) {
        int[] result = new int[values.length];

        for(int i = 0; i < values.length; i++) {
            int max = values[i][0];

            for(int j = 1; j < values[0].length; j++) {
                if (values[i][j] > max) {
                    max = values[i][j];                    
                }
            }

            result[i] = max; 
        }


        return result;
    }

    public static int[] maxEachCol(int[][] values) {
        int[] result = new int[values[0].length];

        for(int j = 0; j < values[0].length; j++) {
            int max = values[0][j];
            for(int i = 1; i < values.length; i++) {
                if (values[i][j] > max) {
                    max = values[i][j];
                }
            }
            result[j] = max;
        }

        return result;
    }
}
