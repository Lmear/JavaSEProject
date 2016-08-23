public class Task6{

	public static void main(String[] args) {

		int N=3000000; //Value to search for primes up to
				
		boolean[]isPrime = new boolean [N]; //create array of values
		isPrime[0] = false; 
		for (int c = 1; c < N; c++){
			isPrime[c] = true;
		}
		for (int i = 2; i <= N; i++){
			if(isPrime[i-1]){
				System.out.println(i);
				for (int j = 2*i; j<= N; j+=i){
					isPrime[j-1] = false;
				}
			}
		}
	}
}