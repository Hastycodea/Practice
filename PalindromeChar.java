public class PalindromeChar {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
        
    }

    public static boolean isPalindrome(String s) {
        
        int n = s.length();
        int i = 0;
        int j = n - 1;

        while (i <= j) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;                
            }

            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;                
            }

            char ci = Character.toLowerCase(s.charAt(i));
            char cj = Character.toLowerCase(s.charAt(j));

            if (ci != cj) {
                return false;
            }

            i++;
            j--;
            
        }
        
        return true;
    }
}
