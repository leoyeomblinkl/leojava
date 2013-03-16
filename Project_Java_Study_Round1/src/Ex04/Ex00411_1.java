package ex04;

public class Ex00411_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score=88;
		String grade=""	;
		
		switch (score/10) {
		case 10:
			grade="A+";
			break;

		case 9:
			grade=((score%10)>=5)? "A+" : "A";
			break;
		case 8:
			grade=((score%10)>=5)? "B+" : "B";
			break;
		case 7:
			grade=((score%10)>=5)? "C+" : "C";
			break;
		case 6:
			grade=((score%10)>=5)? "D+" : "D";
			break;
		default:
			grade="F";
			break;
		}
		
		System.out.println("Score : "+ score);
		System.out.println("Grade : "+ grade);
		
		
	}

}
