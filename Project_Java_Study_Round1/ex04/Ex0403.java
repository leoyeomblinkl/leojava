package ex04;

public class Ex0403 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		int sum=0;
		
		for (int i = 1; i <= 10 ; i++) {
			num +=i;
			sum += num;
//			System.out.println(num);
//			System.out.println(sum);
//			System.out.println();
		}
		
		System.out.println(sum);
	}

}
