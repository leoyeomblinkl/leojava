package Ex04;

public class Ex0414 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer=(int)(Math.random()*100+1);
		int input = 0;
		int count = 0;
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			++count;
			System.out.print("Put numbers between 1~100 :");
			input = s.nextInt();
			
			if (input>answer) {
				System.out.println("Put smaller number");
			} else if(input<answer) {
				System.out.println("Put bigger number");
			} else {
				System.out.println("You got it");
				System.out.println("Your got the answer in "+count+" tries");
				break;
				
			}
			
		} while(true);
	}

}
