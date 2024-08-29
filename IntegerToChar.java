public class IntegerToChar {
    public static void main(String[] args) {
        int number = 1000101;
        String numberString = Integer.toString(number);
        char[] numberArray = numberString.toCharArray();

        for(int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] == '0') {
                numberArray[i] = '1';                                
            } else {
                numberArray[i] = '0';
            }
        }

        String result = new String(numberArray);
        System.out.println(result);

    }
}
