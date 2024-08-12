import java.util.Arrays;

public class StringRegex {
    public static void main(String[] args) {
        String name = "val ha    lla    j";
        String[] name2 = name.split(" ");

        StringBuilder sb = new StringBuilder();

        for (String s : name2) {
            if (!s.isEmpty()) 
            sb.append(s);
        }

        System.out.println(sb.toString());

    }
}
