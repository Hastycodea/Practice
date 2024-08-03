
public class Palindrome{
	public static void  main(String[] args){
		String name = "A man, a plan, a canal, Panama!";
		String nameRefined = name.replaceAll("[,\\s!]", "").toLowerCase();
		StringBuilder sb = new StringBuilder(nameRefined);
		String reverse = sb.reverse().toString();

		if(nameRefined.equals(reverse)) {
			System.out.println("The "+name+" is a palindrome");
		} else {
			System.out.println(name + " and " + reverse + " are not same");	
		}
		
	}
}
