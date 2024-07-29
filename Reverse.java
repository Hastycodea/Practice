public class Reverse {
	public static void main(String[] args){
		String name  =  "Kuku mbegdui wa Zabangaa";	
		String[] nameParts = name.split(" ");
		
		for(int i = nameParts.length - 1; i >= 0; i--) {
			System.out.print(nameParts[i]);
			System.out.print(" ");	
		}
	System.out.println();	
	}





}
