public class SubStringCheck {
    public static void main(String[] args) {
        String name = "Andreh";

        String result = name.substring(0, name.length()-2);
        String lastTwo = name.substring(name.length() - 2);
        // System.out.println(lastTwo);

        int hours = 4;
        String hourString = String.format("%02d", hours);
        System.out.println(hourString);
    }
}
