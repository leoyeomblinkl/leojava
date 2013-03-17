package ex05;

public class Ex0511 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score={
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};
		
		int[][] result= new int[score.length+1][score[0].length];
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[0].length; j++) {
				result[i][score[i].length]+=score[i][j];
			}
		}
		System.out.println(result[0][2]);
		
		System.out.println();
}
}
