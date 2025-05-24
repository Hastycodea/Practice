public class Lcm {

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6, 7};
        System.out.println(lcmArray(nums));
        
    }

    public static int lcmArray(int[] numsArray){
        if(numsArray.length == 0) return 0;

        int num1 = numsArray[0];
        int lcm = num1;

        for(int i = 1; i < numsArray.length; i++) {
            lcm = lcm(num1, numsArray[i]);
        }
        return lcm;
    }

    public static int gcd(int a, int b) {
        if(a < b) return gcd(b, a);
        if(a % b == 0) return b;
        else return gcd(b, a%b);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    
}
