package ex06;

class Ex00601Tv {

	/**
	 * @param args
	 */
		// Tv property
		String color;
		boolean power;
		int channel;
		
//		Tv method
		void power() { power = !power; }
		void channelUp() { ++channel; }
		void channelDown() { --channel; }

}

class TvTest {
	public static void main(String args[]) {
		Ex00601Tv t;
		t= new Ex00601Tv();
		t.channel=7;
		t.channelDown();
		System.out.println("Channel is "+t.channel+" now.");
	}
}	
	
	
	
