import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CountPaths {
    public static void main(String[] args) {
        List<List<String>> grid = new ArrayList<>();

        List<String> row1 = new ArrayList<>();
        List<String> row2 = new ArrayList<>();
        List<String> row3 = new ArrayList<>();

        Collections.addAll(row1, "-", "-", "X");
        Collections.addAll(row2, "-", "X", "-");
        Collections.addAll(row3, "-", "-", "-");

        grid.add(row1);
        grid.add(row2);
        grid.add(row3);

        int result = countPaths(grid);
        System.out.println(result);
    }

    public static int countPaths(List<List<String>> grid) {
        return countPaths(0, 0, grid, new HashMap<>());
    }

    public static int countPaths(int r, int c, List<List<String>> grid, HashMap<List<Integer>, Integer> memo) {
        if (r == grid.size() || c == grid.get(0).size()) {
            return 0;            
        }
        
        if (r == grid.size() - 1 && c == grid.get(0).size() - 1) {
            return 1;            
        }

        if (grid.get(r).get(c) == "X") {
            return 0;            
        }

        List<Integer> pos = List.of(r, c);
        if (memo.containsKey(pos)) {
            return memo.get(pos);
        }

        int result = countPaths(r+1, c, grid, memo) + countPaths(r, c+1, grid, memo);
        memo.put(pos, result);

        return result;
    }
}
