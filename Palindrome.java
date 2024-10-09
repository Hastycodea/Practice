
public class Palindrome{
	public static void  main(String[] args){
		String name = "A man, a plan, a canal, Panama!";
		String nameRefined = name.replaceAll("[,\\s!]", "").toLowerCase();
		StringBuilder sb = new StringBuilder(nameRefined);
		String reverse = sb.reverse().toString();
    
    String company = "Google Chrome";
    System.out.println(palindrome(company)); 

		if(nameRefined.equals(reverse)) {
			System.out.println("The "+name+" is a palindrome");
		} else {
			System.out.println(name + " and " + reverse + " are not same");	
		}

		boolean result2 = palindrome(name);

		System.out.println(result2);
		
	}

	public static boolean palindrome(String word) {
		//match everything except 
		String cleanWord = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		StringBuilder sb = new StringBuilder(cleanWord);
		String reverseWord = sb.reverse().toString();
		if (cleanWord.equals(reverseWord)) {
			return true;
	}
		return false;
	}
}
