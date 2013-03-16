package ex05;

public class Ex00506 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = new int[10];
		
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i]=(int)(Math.random()*10));
		}
		System.out.println();
		
		for (int i = 0; i < number.length; i++) {
			boolean changed=false;
			
			for (int j = 0; j < number.length-1-i; j++) {
				if (number[j]>number[j+1]) {
					int temp = number[j+1];
					number[j+1]=number[j];
					number[j]=temp;
					changed=true;
				}
				
			}
			
			if(!changed) break;
			
			for (int j = 0; j < number.length; j++) {
				System.out.print(number[j]);
			}
			System.out.println();

		}
	}

}
