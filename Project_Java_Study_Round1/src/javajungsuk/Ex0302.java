package javajungsuk;

public class Ex0302 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numberOfApple = 120;
		int numberOfBucket;
		int temp = numberOfApple/10;
		if(numberOfApple%10==0){
			numberOfBucket=temp;
		} else {
			numberOfBucket=temp+1;
		}
		
		System.out.println("The number of bucket needed is "+numberOfBucket);
		
		
		
	}

}
