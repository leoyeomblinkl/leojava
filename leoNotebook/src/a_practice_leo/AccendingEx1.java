package a_practice_leo;

public class AccendingEx1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] item = new int[25];
		
		for (int i = 0; i < item.length; i++) {
			
		System.out.print(item[i]= (int)(Math.random()*10)
		);
						
		}
		
		for (int i = 0; i < item.length; i++) {
			boolean changed=false;
			
			for (int j = 0; j < item.length-1-i; j++) {
				if (item[j]>item[j+1]) {
					
					int temp = item[j];
					item[j]=item[j+1];
					item[j+1]=temp;
					
					changed=true;
				}
				
			}
			
			if (!changed) break;
			for (int j = 0; j < item.length; j++) {
				System.out.print(item[j]);

			}
			System.out.println();
		}
		
		

	}

}
