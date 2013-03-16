package ex03;

public class Ex0310 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch ='N';

		char lowerCase = (('A'<=ch)&&(ch<='Z')) ? (char)(ch+32) : ch ;
		
		System.out.println("ch : " +ch);
		System.out.println("lowercase ch : "+lowerCase);
		
		
		
	}

}
