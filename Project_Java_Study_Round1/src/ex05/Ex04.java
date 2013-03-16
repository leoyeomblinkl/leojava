package ex05;

public class Ex04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ballArr ={1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		for (int x = 0; x < 20; x++) {
			int i= (int)(Math.random()*ballArr.length);
			int j= (int)(Math.random()*ballArr.length);
			int tmp=0;
			
			tmp=ballArr[i];
			ballArr[i]=ballArr[j];
			ballArr[j]=tmp;
		}
		
		System.arraycopy(ballArr, 0, ball3, 0, 3);
		for (int i = 0; i < ball3.length; i++) {
			System.out.println(ball3[i]);
		}
	}

}
