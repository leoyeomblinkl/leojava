package ex04;

public class Ex0402 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		for (int i = 1; i <= 20; i++) {
			if ((i%2!=0)||(i%3!=0)) {
				sum += i;
			}
			
		}
		System.out.println(sum);
	}
	

}
