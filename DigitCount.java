import java.util.HashMap;
import java.util.Map;

public class DigitCount {
    public static void main(String[] args) {

        String num = "1241";
        System.out.println(digitCount(num));
        
    }

    public static boolean digitCount(String num) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < num.length(); i++) {
            int ch = num.charAt(i) - '0';
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }

        int count = 0;
        for(int i = 0; i < num.length(); i++) {
            if(map.containsKey(i)) {
                count = map.get(i);
            } else {
                count = 0;
            }

            int x = num.charAt(i) - '0';
            if (x!=count) {
                return false;
            }
        }

        return true;
    }
}
