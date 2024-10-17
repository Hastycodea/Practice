public class LongDivision {
    public static void main(String[] args) {
       int result = longDivision(6, 3);
       System.out.println(result);
    }

    public static int longDivision(int divider, int divisor) {
        long result = 0;
        long sign = 1;

        if(divisor == 1) return divider;

        if((divider < 0 && divisor >= 0) || (divider >= 0 && divisor < 0)) sign = -1;

        long dd = Math.abs((long) divider);
        long dr = Math.abs((long) divisor);

        for(int i = 30; i >= 0; i--) {
            if(dd >= (dr << i)) {
                dd -= (dr << i);
                result += (1 << i);                
            }
        }

        return (int) (result * sign);
    }
}