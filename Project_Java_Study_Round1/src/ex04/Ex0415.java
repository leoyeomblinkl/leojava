package ex04;

public class Ex0415 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number= 12321;
		int tmp = number;
		
		int result=0;
		
		while(tmp !=0){
			result=result*10;
			result=result+tmp%10;
			tmp/=10;
			
			System.out.println(result);
		}

		if (number==result) {
			System.out.println(number+" is palindrome!");
		} else {
			System.out.println(number+" is not palindrome.");
		}

	}

}
