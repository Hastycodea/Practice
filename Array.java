public class Array{
    public static void main(String[] args) {
        int[] numbers = {1, 5, 6, 9, 0, 1};
        int number4 = numbers.length;
        System.out.println(number4);


        for(int number : numbers) {
            System.out.println(number);
        }
    }
}