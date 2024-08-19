public class Euler {
    public static void main(String[] args) {
        System.out.println(sumOfMultiplesThreeFive(1000));        
    }

    public static int sumOfMultiplesThreeFive(int number) {
        int sum = 0;

        for(int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        return sum;
    }
    
}
