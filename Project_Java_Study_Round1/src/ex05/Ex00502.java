package ex05;

public class Ex00502 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		float average =0f;
		
		int[] score={100,88,100,100,90};
		
		for (int i = 0; i < score.length; i++) {
			sum+= score[i];
		}
		average=sum / (float)score.length;
		
		System.out.println("Total score= "+sum);
		System.out.println("average = "+average);
		
	}

}
