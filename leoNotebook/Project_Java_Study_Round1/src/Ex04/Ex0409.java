package Ex04;

public class Ex0409 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "12345123";
		int sum = 0;
		
		for (int i = 1; i <str.length(); i++) {
			sum+=(str.charAt(i)-'0');
//			System.out.println(sum);
			
		}
		System.out.println("sum= "+sum);
	}

}
