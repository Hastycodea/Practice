public class ColumnToInt {
    public static void main(String[] args) {
       System.out.println(columnToInt("AA")); 
    }

    public static int columnToInt(String columnName) {
        int result = 0;

        for(char c : columnName.toCharArray()) {
            result = result * 26 + (c - 'A' + 1);
        }
        return result;
    }
    
}
