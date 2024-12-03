public class Excel {
    public static void main(String[] args) {
        System.out.println("My results");
        System.out.println(excelAlgo(27));
        System.out.println(excelAlgo(28));

    }

    public static String excelAlgo(int columnNumber) {
        String result = "";

        while (columnNumber > 0) {
            int num = (columnNumber - 1) % 26;
            result = (char) (num + 'A') + result;
            columnNumber = (columnNumber - 1) / 26;
        }

        return result;
    }
}
