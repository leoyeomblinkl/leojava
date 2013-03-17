package ex05;

public class Ex00505 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ball = new int[45];
		for (int i = 0; i < ball.length; i++) {
			ball[i]=i+1;
		}
		int temp=0;
		int j=0;
		
		for (int i = 0; i < 100; i++) {
			j=(int)(Math.random()*45);
			
			temp=ball[0];
			ball[0]=ball[j];
			ball[j]=temp;
		}
		for (int i = 0; i < 6; i++) {
			System.out.println(ball[i]);
		}
	}

}
