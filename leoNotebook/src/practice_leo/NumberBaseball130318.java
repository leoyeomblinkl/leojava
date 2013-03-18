package practice_leo;

import java.util.Scanner;

public class NumberBaseball130318 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] number=new int[9]; // ���� ����. number �迭, ��Ʈ����ũ ī��Ʈ, �� ī��Ʈ, ���۸޽���, �õ� Ƚ��ī��Ʈ.
		int strikeCount=0;
		int ballCount=0;
//		String startMessage="";  
		int count=0;
		
		for (int i = 0; i < 9; i++) { // 1~9������ number�迭�� ����.
			number[i]=i+1;
		}
		
		for (int i = 0; i < 20; i++) { // number �迭 ����
			int temp;
			int j=(int)(Math.random()*9);
			
			temp=number[j];
			number[j]=number[0];
			number[0]=temp;
		}
		
		
		int[] answer=new int[4]; // ��ǻ���� ������ �迭(answer) ����
		System.arraycopy(number, 0, answer, 0, 4); // number �迭���� ó�� ���� answer�迭�� ����.
		
		Scanner scan = new Scanner(System.in);
		String inputNumber;
		
//		System.out.println("������  "+ "' "+answer[0]+" "+answer[1]+" "+answer[2]+" "+answer[3]+" '"); // ���� �����ִ� ġƮŰ��
		System.out.print("�´ٰ� �����Ͻô� �ߺ����� �ʴ� 1~9������ ���� �� ���� �����ּ���!: ");
		
		Loop1 : do{
			
			++count;
			
			String inputNumberTemp="";
			inputNumberTemp=scan.nextLine();
			
			
			int input=0;
			inputNumber=inputNumberTemp.replaceAll(" ", "");
//			System.out.println(inputNumber); // spacebar ���� Ȯ�ο� 
			
			for (int i = 0; i < inputNumber.length(); i++) { //string �� int�� ��ȯ
				if ('1'<=inputNumber.charAt(i)&&inputNumber.charAt(i)<='9') {
					int temp=inputNumber.charAt(i)-'0';
					for (int j = 0; j < inputNumber.length()-i-1; j++) {
						temp*=10;	
					}
					input+=temp;
					
//					System.out.println(input); // Ȯ�ο� ����
					
				} else {
					System.out.println("1~9�� �ش��ϴ� ���ڰ� �ƴմϴ�! �ٽ� �Է����ּ��� ^^");
					continue Loop1;
				}
			}
			
			
			
			System.out.println("==========�õ�Ƚ��:"+count+"========");

		
		
			if(999>=input||input>=10000){
				System.out.println("�̷�... ��, �� ���� ���ڸ� �����ּž� �մϴ�. �ٽ� �غ�����?");
				continue Loop1;
			}
		
		int[] guess=new int[4];
		for (int i = guess.length; i > 0; i--) { // �Է°��� �迭�� ��ȯ
			guess[i-1]=input%10;
			input/=10;
			
		}
		

		
		for (int i = 0; i < guess.length-1; i++) { // �ߺ��Ǵ� ���ڰ� �ִ��� ����
			for (int j = 0; j < guess.length-1-i; j++) {
							
				if(guess[i]==guess[i+1] ){
					System.out.println(" �ߺ��� ���ڰ� �ֽ��ϴ�. ���� �ߺ��� ���ڰ� ������!");
					continue Loop1;
			}
			}
		}
		
		System.out.println(guess[0]+" "+guess[1]+" "+guess[2]+" "+guess[3]); // guess �� �����ִ� ��
		
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
		
				System.out.println("��Ʈ����ũ : "+strikeCount);
		System.out.println("  ��   : "+ballCount);

		if(strikeCount==4) {
			System.out.println("=-=-================-=-=");
			System.out.println("���� "+ "' "+answer[0]+" "+answer[1]+" "+answer[2]+" "+answer[3]+" '�� ���߼̽��ϴ�!");
			System.out.println("�����մϴ�!! 4��Ʈ����ũ ¦��¦ ^^ ( "+count+"��° �������� ���� )");
			break;
		}
		
		
		
	} while (true);

}
}

// added by jake yum
