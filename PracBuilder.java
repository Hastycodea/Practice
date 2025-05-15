public class PracBuilder {

    public static void main(String[] args) {

        String animal = "Antelope";
        System.out.println(animal.toLowerCase());

        StringBuilder sb = new StringBuilder(animal);
        sb.reverse();
        System.out.println(sb.toString().toLowerCase());
    }
    
}
