package ex06;

class Ex00602 {

	String color;
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

class Ex00602Test {
	public static void main(String[] args) {
		Ex00602 test1= new Ex00602();
		Ex00602 test2= new Ex00602();
		
		System.out.println("channel of test1 is "+test1.channel+" now.");
		System.out.println("channel of test2 is "+test2.channel+" now.");
		
		test1.channel=7;
		System.out.println("channel of test1 is "+test1.channel+" now.");
		
		
		
		
		
		
	}
}
