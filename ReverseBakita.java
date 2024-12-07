public class ReverseBakita {
    public static void main(String[] args) {

        String name = "Bakhita";

        String result = "";

        for(int i=0; i<name.length(); i++){
            result = name.charAt(i) + result;
        }

        System.out.println(result);
        
    }


    
}
