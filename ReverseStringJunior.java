public class ReverseStringJunior {
   public static void main(String[] args) {

        String word = "hello";
        int length = word.length();
        
        String reverse = "";

        for(int i = 0; i < length; i++) {
            reverse = word.charAt(i) + reverse;
        }

       System.out.println(reverse);
   } 
}
