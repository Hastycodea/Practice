import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DiffArray {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        Collections.addAll(list1, 1, 2, 3);
        Collections.addAll(list2, 2, 4, 6);

        List<List<Integer>> result = diffArray(list1, list2);
        System.out.println(result.toString());

        
    }

    public static List<List<Integer>> diffArray(List<Integer> num1, List<Integer> num2) {
        List<List<Integer>> result = new ArrayList<>();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int num : num1) {
            set1.add(num);
        }        

        for(int num : num2) {
            set2.add(num);
        }

        List<Integer> list1 = new ArrayList<>();
        for(int num : num1) {
            if(!set2.contains(num)) list1.add(num);
        }

        List<Integer> list2 = new ArrayList<>();
        for(int num : num2) {
            if(!set1.contains(num)) list2.add(num);
        }

        result.add(list1);
        result.add(list2);

        return result;
    }
}
