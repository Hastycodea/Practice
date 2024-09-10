
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

		System.out.println(palindrome(name));
		
	}

	public static boolean palindrome(String word) {
		String cleanWord = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		StringBuilder sb = new StringBuilder(cleanWord);
		String reverseWord = sb.reverse().toString();
		if (cleanWord.equals(reverseWord)) {
			return true;
		}
		return false;
	}
}
