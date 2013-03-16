package Ex03;


public class Ex0307 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fahrenheit = 100;
		float celcius =( 
				
				(((((fahrenheit-32)*5f/9)*1000)%10)<5)? (int)((((fahrenheit-32)*5f/9)*1000))/1000f : (int)(((((fahrenheit-32)*5f/9)*1000)+1))/1000f
				
				);
		System.out.println("Fahrenheit="+fahrenheit);
		System.out.println("Celcius="+celcius);
		
		
	}

}
