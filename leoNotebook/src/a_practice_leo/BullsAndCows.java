package a_practice_leo;

import java.util.Scanner;

public class BullsAndCows {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] number=new int[9]; // variables declaration
		int bullCount=0;
		int cowCount=0;
//		String startMessage="";  
		int count=0;
		
		for (int i = 0; i < 9; i++) { // put numbers into number array
			number[i]=i+1;
		}
		
		for (int i = 0; i < 20; i++) { // shuffle number array
			int temp;
			int j=(int)(Math.random()*9);
			
			temp=number[j];
			number[j]=number[0];
			number[0]=temp;
		}
		
		
		int[] answer=new int[4]; // answer array declaration
		System.arraycopy(number, 0, answer, 0, 4); // copy first four number array to answer array
		
		Scanner scan = new Scanner(System.in);
		String inputNumber;
		
//		System.out.println("Á¤´äÀº  "+ "' "+answer[0]+" "+answer[1]+" "+answer[2]+" "+answer[3]+" '"); // *cheat key* for showing answer
		System.out.print("Put four non-repetive numbers which are correct guess : ");
		
		Loop1 : do{
			
			++count;
			
			String inputNumberTemp="";
			inputNumberTemp=scan.nextLine();
			
			
			int input=0;
			inputNumber=inputNumberTemp.replaceAll(" ", "");
//			System.out.println(inputNumber); // for space bar check
			
			for (int i = 0; i < inputNumber.length(); i++) { // casting string to integer
				if ('1'<=inputNumber.charAt(i)&&inputNumber.charAt(i)<='9') {
					int temp=inputNumber.charAt(i)-'0';
					for (int j = 0; j < inputNumber.length()-i-1; j++) {
						temp*=10;	
					}
					input+=temp;
					
//					System.out.println(input); // for checking
					
				} else {
					System.out.println("Out of range! Please choose numbers from 1 to 9 :)");
					continue Loop1;
				}
			}
			
			
			
			System.out.println("==========Round: "+count+"========");

		
		
			if(999>=input||input>=10000){
				System.out.println("Please put 4 numbers. Let's try again.");
				continue Loop1;
			}
		
		int[] guess=new int[4];
		for (int i = guess.length; i > 0; i--) { // cast input to array
			guess[i-1]=input%10;
			input/=10;
			
		}
		

		
		for (int i = 0; i < guess.length-1; i++) { // check for repetitive numbers
			for (int j = 0; j < guess.length-1-i; j++) {
							
				if(guess[i]==guess[i+1] ){
					System.out.println("Please put non-repetitive numbers. Let's try again.");
					continue Loop1;
			}
			}
		}
		
		System.out.println(guess[0]+" "+guess[1]+" "+guess[2]+" "+guess[3]); // Showing guess
		
		bullCount=0;
		cowCount=0;
		
		for (int i = 0; i < guess.length; i++) { // bull count
			if (guess[i]==answer[i]) {
				++bullCount;
				
			}
		}
		
		for (int i = 0; i < guess.length; i++) { // cow count
			for (int j = 0; j < guess.length; j++) {
				if (guess[i]==answer[j] && guess[i]!=answer[i]) {
					++cowCount;
				}
			}
		}
		
				System.out.println("Bull: "+bullCount);
		System.out.println("cow: "+cowCount);

		if(bullCount==4) {
			System.out.println("=-=-================-=-=");
			System.out.println("Wow!! Bulls!!! "+ "' "+answer[0]+" "+answer[1]+" "+answer[2]+" "+answer[3]+" '!");
			System.out.println("Congraturation! you got me on "+count+" rounds");
			break;
		}
		
		
		
	} while (true);

}
}