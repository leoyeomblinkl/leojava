package ex05;

public class Ex00513 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score= new int[6][];
		score[0]=new int[5];
		score[1]=new int[9];
		score[2]=new int[3];
		score[3]=new int[2];
		score[4]=new int[4];
		score[5]=new int[7];
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j]=i+j;
				System.out.println("score["+i+"]["+j+"]:"+score[i][j]);
			}
		}
	}

}
