package ex04;

public class Ex00411 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score=88;
		char grade =' ';
		
		switch(score/10){
		case 10: case 9 :
			grade='A';
			break;
		case 8:
			grade='B';
			break;
		case 7:
			grade='C';
			break;
		case 6: case 5: case 4: case 3: case 2: case 1: case 0:
			grade='F';
			break;
		}
		
		System.out.println("grade : "+grade);

	}

}
