package Ex04;

public class Ex00419 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long startTime =System.currentTimeMillis();
		for (int i = 0; i < 1000000000; i++) {
			;
			
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("시작시간 : "+startTime);
		System.out.println("죵료시간 : "+endTime);
		System.out.println("경과시간 : "+ (endTime-startTime));
		
		
	}

}
