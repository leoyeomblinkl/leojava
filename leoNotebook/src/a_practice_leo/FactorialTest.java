package a_practice_leo;

public class FactorialTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(10));
	}
	
	static long factorial(int n){
		long result=0;
		
		if (n==1){
			result=1;
			
		} else {
			result=n*factorial(n-1);
		}
		
		return result;
	}
}
