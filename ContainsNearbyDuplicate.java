import java.util.Arrays;
import java.util.List;

public class ContainsNearbyDuplicate {

    public static void main(String[] args) {

        String[] names1 = {"Val", "John", "Andreh"};
        String[] names2 = {"Val", "John", "Andreh", "Bakita"};
        
        // System.out.println(containsBakita(names1));

        if(containsBakita(names2)) {
            System.out.println("Bakita is in the list");
        } else {
            System.out.println("We are sorry, Bakita is not in the list");
        }

    }

    public static boolean containsBakita(String[] names) {

        List<String> namesList = Arrays.asList(names);

        if(namesList.contains("Bakita")) {
            return true;
        }

        return false;

    }

}
