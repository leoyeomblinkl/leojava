package a_practice_leo;

import java.util.Scanner;

public class NumberBaseball130318 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] number=new int[9]; // 변수 선언. number 배열, 스트라이크 카운트, 볼 카운트, 시작메시지, 시도 횟수카운트.
		int strikeCount=0;
		int ballCount=0;
//		String startMessage="";  
		int count=0;
		
		for (int i = 0; i < 9; i++) { // 1~9까지를 number배열에 배정.
			number[i]=i+1;
		}
		
		for (int i = 0; i < 20; i++) { // number 배열 섞기
			int temp;
			int j=(int)(Math.random()*9);
			
			temp=number[j];
			number[j]=number[0];
			number[0]=temp;
		}
		
		
		int[] answer=new int[4]; // 컴퓨터의 문제답 배열(answer) 선언
		System.arraycopy(number, 0, answer, 0, 4); // number 배열에서 처음 넷을 answer배열에 복사.
		
		Scanner scan = new Scanner(System.in);
		String inputNumber;
		
//		System.out.println("정답은  "+ "' "+answer[0]+" "+answer[1]+" "+answer[2]+" "+answer[3]+" '"); // 답을 보여주는 치트키열
		System.out.print("맞다고 생각하시는 중복되지 않는 1~9사이의 숫자 네 개를 적어주세요!: ");
		
		Loop1 : do{
			
			++count;
			
			String inputNumberTemp="";
			inputNumberTemp=scan.nextLine();
			
			
			int input=0;
			inputNumber=inputNumberTemp.replaceAll(" ", "");
//			System.out.println(inputNumber); // spacebar 공백 확인용 
			
			for (int i = 0; i < inputNumber.length(); i++) { //string 을 int로 변환
				if ('1'<=inputNumber.charAt(i)&&inputNumber.charAt(i)<='9') {
					int temp=inputNumber.charAt(i)-'0';
					for (int j = 0; j < inputNumber.length()-i-1; j++) {
						temp*=10;	
					}
					input+=temp;
					
//					System.out.println(input); // 확인용 출력
					
				} else {
					System.out.println("1~9에 해당하는 숫자가 아닙니다! 다시 입력해주세요 ^^");
					continue Loop1;
				}
			}
			
			
			
			System.out.println("==========시도횟수:"+count+"========");

		
		
			if(999>=input||input>=10000){
				System.out.println("이런... 꼭, 네 개의 숫자를 적어주셔야 합니다. 다시 해볼까요?");
				continue Loop1;
			}
		
		int[] guess=new int[4];
		for (int i = guess.length; i > 0; i--) { // 입력값을 배열로 전환
			guess[i-1]=input%10;
			input/=10;
			
		}
		

		
		for (int i = 0; i < guess.length-1; i++) { // 중복되는 숫자가 있는지 검출
			for (int j = 0; j < guess.length-1-i; j++) {
							
				if(guess[i]==guess[i+1] ){
					System.out.println(" 중복된 숫자가 있습니다. 답은 중복된 숫자가 없어요!");
					continue Loop1;
			}
			}
		}
		
		System.out.println(guess[0]+" "+guess[1]+" "+guess[2]+" "+guess[3]); // guess 를 보여주는 열
		
		strikeCount=0;
		ballCount=0;
		
		for (int i = 0; i < guess.length; i++) { // strike count
			if (guess[i]==answer[i]) {
				++strikeCount;
				
			}
		}
		
		for (int i = 0; i < guess.length; i++) { // ball count
			for (int j = 0; j < guess.length; j++) {
				if (guess[i]==answer[j] && guess[i]!=answer[i]) {
					++ballCount;
				}
			}
		}
		
				System.out.println("스트라이크 : "+strikeCount);
		System.out.println("  볼   : "+ballCount);

		if(strikeCount==4) {
			System.out.println("=-=-================-=-=");
			System.out.println("정답 "+ "' "+answer[0]+" "+answer[1]+" "+answer[2]+" "+answer[3]+" '을 맞추셨습니다!");
			System.out.println("축하합니다!! 4스트라이크 짝작짝 ^^ ( "+count+"번째 도전에서 성공 )");
			break;
		}
		
		
		
	} while (true);

}
}