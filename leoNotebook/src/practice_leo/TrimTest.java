package practice_leo;

public class TrimTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str1="   1 2 3 4 5 6  ";
		String str2;
		System.out.println(str1);
		str1.trim();
		System.out.println(str1);
		str2=str1.replace(" ", "");
		System.out.println(str2);
	}

}
