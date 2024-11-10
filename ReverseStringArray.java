public class ReverseStringArray {
    public static void main(String[] args) {
        char[] word = {'h', 'e', 'l', 'l', 'o'};

        int n = word.length;
        
        for(int i=0; i<n/2; i++){
            char temp = word[i];
            word[i] = word[n-1-i];
            word[n-1-i] = temp;
        }

        System.out.println(word);
    }
    
}
