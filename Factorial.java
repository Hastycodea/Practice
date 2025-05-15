public class Factorial {

    public static void main(String[] args) {
       //System.out.println(factorial(3));
       //System.out.println(factorial(0));
      int num = 5;
      System.out.println(Integer.toBinaryString(num));
    }

    public static int factorial(int n){
        if(n == 1 || n == 2) {
            return n;
        }
        if(n == 0){
            return 1;
        }

        return n * factorial( n - 1);
    }
    
}
