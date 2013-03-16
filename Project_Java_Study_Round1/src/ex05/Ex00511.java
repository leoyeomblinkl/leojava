package ex05;

public class Ex00511 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score= new int[10][2];
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j]=10;
				System.out.println("score["+i+"]["+j+"]=" +score[i][j]);
			}
		}
	}

}
