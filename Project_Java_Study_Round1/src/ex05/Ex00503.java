package ex05;

public class Ex00503 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score ={79,88,91,33,100,55,95};
		
		int max= score[0];
		int min= score[0];
		
		for (int i = 0; i < score.length; i++) {
			if(score[i]>max){
				max=score[i];
			}
			if (score[i]<min) {
				min=score[i];
			}	
		}
		System.out.println("Max : "+max);
		System.out.println("min : "+min);
	}

}
