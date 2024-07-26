import java.util.Arrays;

public class BinarySearch{

	public static void main(String[] args) {
		int[] numbers = {1, 6, 9, 3, 2, 12, 4};
	    	int[] figures = {1, 3, 5, 7, 9, 14, 17};	
		Arrays.sort(numbers);

		System.out.println(Arrays.toString(numbers));
		System.out.println(binarySearch(numbers, 9));
		System.out.println(binarySearch(numbers, 10));
	}

	public static int binarySearch(int[] numbers, int k){
		int l = 0, h = numbers.length-1, m = 0;
		while(l <= h) {
			m = (l+h)/2;
			if(k == numbers[m]){
				return m;	
			} else if (k < numbers[m]){
				h = m -1;	
			} else {
				l = m +1;	
			}
		} 
		return -1;
	}
}
