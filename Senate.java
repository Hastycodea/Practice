import java.util.LinkedList;
import java.util.Queue;

public class Senate {

    public static void main(String[] args) {

        System.out.println(partyVictory("RDDR"));
        
    }

    public static String partyVictory(String senate) {

        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();

        int n = senate.length();

        for(int i = 0; i < n; i++) {
            if(senate.charAt(i) == 'R') {
                radiant.add(i);
            } else {
                dire.add(i);
            }
        }

        while(!radiant.isEmpty() && !dire.isEmpty()) {
            int r = radiant.poll(), d = dire.poll();

            if (r < d) {
                radiant.add(r + n);                
            } else {
                dire.add(d + n);
            }
        }


        return radiant.size() > dire.size() ? "Radiant" : "Dire";
    }
    
}
