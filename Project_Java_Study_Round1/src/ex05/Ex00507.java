package ex05;

public class Ex00507 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number= new int[10];
		int[] counter= new int[10];
		
		for (int i = 0; i < counter.length; i++) {
			System.out.print(number[i]=(int)(Math.random()*10)	);
		}
		System.out.println();
		
		for (int i = 0; i < counter.length; i++) {
			counter[number[i]]++;
		}
		
		for (int i = 0; i < counter.length; i++) {
			System.out.println(i+"ÀÇ °³¼ö :"+counter[i]);
		}
	}

}
