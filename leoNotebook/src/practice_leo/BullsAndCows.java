package practice_leo;

import javax.swing.JOptionPane;

public class BullsAndCows {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] number=new int[9];
		int bullCount=0;
		int cowCount=0;
		String startMessage="";
		int count=0;
		
		for (int i = 0; i < 9; i++) { // put 1~9 numbers into number array
			number[i]=i+1;
		}
		
		for (int i = 0; i < 20; i++) { // shuffle number array
			int temp;
			int j=(int)(Math.random()*9);
			
			temp=number[j];
			number[j]=number[0];
			number[0]=temp;
		}
		
		int[] answer=new int[4]; // answer 
		System.arraycopy(number, 0, answer, 0, 4); // pick first 4 numbers from number array to answer array
		
		
//		System.out.println("The answer is "+ "' "+answer[0]+" "+answer[1]+" "+answer[2]+" "+answer[3]+" '"); // for checking
		
		Loop1 : do{
			
			++count;
			
			startMessage = JOptionPane.showInputDialog("put 4 numbers of your guess!!");
			
			int input = 0;
			input=Integer.parseInt(startMessage);
			
			System.out.println("==========Round"+count+"========");

		
		
			if(999>=input||input>=10000){
				System.out.println("You must put 4 numbers. Please try again");
				continue Loop1;
			}
		
		int[] guess=new int[4];
		for (int i = guess.length; i > 0; i--) { // put 4 each numbers into array guess
			guess[i-1]=input%10;
			input/=10;
			
		}
		
//		if (input!=0) { // check number count. must me 4numbers.
//			System.out.println("You put more than 4 numbers. Please put 4 numbers");
//			continue Loop1;
//		}
		
		for (int i = 0; i < guess.length-1; i++) { // check repetition of numbers
			for (int j = 0; j < guess.length-1-i; j++) {
							
				if(guess[i]==guess[i+1] ){
					System.out.println(" You must put 4 different numbers to each other");
					continue Loop1;
			}
			}
		}
		
//		System.out.println(guess[0]+" "+guess[1]+" "+guess[2]+" "+guess[3]); //check for guess
		bullCount=0;
		cowCount=0;
		
		for (int i = 0; i < guess.length; i++) { // get bull count
			if (guess[i]==answer[i]) {
				++bullCount;
				
			}
		}
		
		for (int i = 0; i < guess.length; i++) { // get cow count
			for (int j = 0; j < guess.length; j++) {
				if (guess[i]==answer[j] && guess[i]!=answer[i]) {
					++cowCount;
				}
			}
		}
		
				System.out.println("bullcount : "+bullCount);
		System.out.println("cowcount : "+cowCount);

		if(bullCount==4) {
			System.out.println("=-=-================-=-=");
			System.out.println("The answer is "+ "' "+answer[0]+" "+answer[1]+" "+answer[2]+" "+answer[3]+" '");
			System.out.println("you got the right answer!! ( "+count+" round )");
			break;
		}
		
		
		
	} while (true);

}
}