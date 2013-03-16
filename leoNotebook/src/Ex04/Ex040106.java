package Ex04;

public class Ex040106 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2024;
		boolean result=false;
		if ((year%400==0)||((year%4==0)&&(year%100!=0))) {
			result=true;	
			
		} else {
			result=false;
		}
		System.out.println(result);
	}

}
