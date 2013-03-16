package Ex04;

public class Ex0410 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345678;
		int sum=0;
		
		int count=0;
		int temp = num;
		
		while(temp>9){
			temp/=10;
			++count;
			
		}
//		System.out.println(count);
		
		
		for (int i = 0; i <= count; i++) {
			sum += num%10;
			num %=10;
			
		}
		
		System.out.println(sum);
	}

}
