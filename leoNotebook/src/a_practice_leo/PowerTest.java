package a_practice_leo;

public class PowerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2;
		int n=5;
		long result=0;
		
		for (int i = 0; i <= n; i++) {
			
			result+= power(x,i);
			
		}
		System.out.println(result);
	}
	
	static long power(int x, int n){
		if(n==1) return x;
		return x*power(x,n-1);
	}
}
