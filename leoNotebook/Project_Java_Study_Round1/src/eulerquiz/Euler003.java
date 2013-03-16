package eulerquiz;

public class Euler003 {


	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		long givenNumber = 600851475143l;
		
	 for(long i=2; i<=givenNumber||i!=1; i++) {
			
		 
		 	if (givenNumber==i) {
				
				System.out.println("the largest prime factor is  "+givenNumber);
				
				
			}
			
		 	while (givenNumber%i==0) {
		 		
		 		givenNumber= givenNumber/i;
		 				 		
				
			}
		 	
		 	
			
		}
		
	
		
	}

}


/*어떤 수를 소수의 곱으로만 나타내는 것을 소인수분해라 하고, 이 소수들을 그 수의 소인수라고 합니다.
예를 들면 13195의 소인수는 5, 7, 13, 29 입니다.

600851475143의 소인수 중에서 가장 큰 수를 구하세요.*/