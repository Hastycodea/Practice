public class Factorial {

    public static void main(String[] args) {
       System.out.println(factorial(3));
       System.out.println(factorial(0));
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
