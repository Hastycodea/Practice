public class ReverseNumber {

    public static void main(String[] args) {

        System.out.println(reverseNumber(788888888));
        
    }

    public static int reverseNumber(int number) {

        int num = Math.abs(number);
        int rev = 0;

        while (num != 0) {
            int ld = num % 10;

            rev = rev * 10 + ld;
            num = num / 10;
        }

        if(Integer.MAX_VALUE < num || Integer.MIN_VALUE > num) return 0;

        return (number < 0) ? -rev : rev;

    }
    
}
