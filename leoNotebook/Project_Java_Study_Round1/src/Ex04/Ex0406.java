package Ex04;

public class Ex0406 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumEqual6=0;
		for (int i = 1; i <=6; i++) {
			for (int j = 1; j <=6; j++) {
				if ((i+j)==6) {
					++sumEqual6;
					
				}
				
			}
		} 
		System.out.println(sumEqual6);
	}

}
