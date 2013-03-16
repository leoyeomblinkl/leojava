package javajungsuk;

public class LottoEx2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ball = new int[45];

		// ball 배열에 1부터 45의 값을 넣는다.

		for (int i = 0; i < ball.length; i++) {

			ball[i] = i + 1;
			// System.out.println(ball[i]);
		}

		// 랜덤하게 배열안의 숫자를 바꾼다.

		for (int i = 0; i < (ball.length)*3; i++) {

			int temp;
			int j;

			j = (int) (Math.random() * 45);

			temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;

		}

//		6개의 공을 순서대로 뽑는다.
		
		for (int j2 = 0; j2 < 6; j2++) {

			System.out.println((j2 + 1) + "번째 당첨공은 " + ball[j2] + "입니다.");
		}
 
	}
}
