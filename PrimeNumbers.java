
public class PrimeNumbers{
	public static void main(String[] args){
	
	int number = 100;

	for(int i = 1; i <= number; i++){
		if(!isPrime(i)){
			continue;	
		
		} else {
		System.out.println(i);	
		}
	
	}


	}
	public static boolean isPrime(int number) {
		if (number == 0 || number == 1) return false;
		for(int i = 2; i <= Math.sqrt(number); i++) {
			if(number%i == 0) return false;
		}	
		return true;
	
	}

}
