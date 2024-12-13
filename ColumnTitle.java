public class ColumnTitle {

    public static void main(String[] args) {
        System.out.println(columnTitle(1));
        System.out.println(columnTitle(28));
    }

    public static String columnTitle(int columnNumber) {
        String result = "";

        while (columnNumber > 0) {
            int rem = columnNumber % 26;
            char c = (char) (rem + 'A' - 1);
            result = c + result;

            columnNumber = columnNumber / 26;
        }

        return result;
    }

}
