package ex04;

public class Ex0413 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value ="12o45";
		char ch=' ';
		boolean isNumber = true;
		
		// charat(int i)
		
		for (int i = 1; i <= value.length(); i++) {
			if(('0'<=value.charAt(i))&&(value.charAt(i)<='9')){
				isNumber=true;
			} else {
				isNumber=false;
				break;
			}
		}
		if (isNumber) {
			System.out.println(value+" is number");
		} else {
			System.out.println(value+" is NOT number");
		}
	}

}
