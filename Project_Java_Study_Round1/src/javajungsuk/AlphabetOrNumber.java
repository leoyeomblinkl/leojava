package javajungsuk;

public class AlphabetOrNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char a='¤Ä';
		
		if (('a'<=a && a<='z') || ('A'<= a && a <='Z') || ('0'<= a && a <='9')) {
			
			System.out.println(a);
			
		}
		
		else {
			
			System.out.println("It is not valid");
			
		}
		
		
	}

}
