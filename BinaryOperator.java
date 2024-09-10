public class BinaryOperator {
    public static void main(String[] args) {
        int number = 3;
        System.out.println(~2);


        // Binary String
        String binaryString = Integer.toBinaryString(number);
        //
        String result = String.format("%32s", binaryString).replace(' ', '0');
        System.out.println(result);
        
        double value = 0.9393939393;
        System.out.println(String.format("%.2f", value)); //2dp

    }
}
