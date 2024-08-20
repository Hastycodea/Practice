import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratorWork {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 6, 3, 4, 9, 2, 1, 5, 4, 6);

        Iterator<Integer> printAll = numbers.iterator();

        while (printAll.hasNext()) {
            if (printAll.next() > 8) {
                System.out.println(printAll.next());
            }
        }
    }
}
