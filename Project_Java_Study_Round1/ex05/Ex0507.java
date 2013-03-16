package ex05;

public class Ex0507 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		if(args.length!=1){
			System.out.println("USAGE: java Exercises5_7 3120");
			System.exit(0);
		}
		
		int money = Integer.parseInt(args[0]);
		
*/		
		int money = 2400;
		
		System.out.println("money= " +money);
		
		int[] coinUnit = {500,100,50,10};
		int[] coin = {5,5,5,5};
		
		for (int i = 0; i < coinUnit.length; i++) {
			int coinNum=0;
			
			int tmp=money;
			coinNum=tmp/coinUnit[i];
			
			if (0<=coinNum && coinNum<=coin[i]) {
				money-=coinUnit[i]*coinNum;
				coin[i]=coin[i]-coinNum;
				
			} else if(coinNum>coin[i]) {
				money-=coinUnit[i]*coin[i];
				coin[i]=coin[i];
				
			}

//			System.out.println(coinCount[i]+"   "+money);
			System.out.println(coinUnit[i]+" won: " +coinNum);		
		}
		if (money>0) {
			System.out.println("not enough money to pay");
			System.exit(0);
		}
		System.out.println("=coin(s) left=");
		for (int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i]+ " won: "+coin[i]);
		}
		
		
	}

}
