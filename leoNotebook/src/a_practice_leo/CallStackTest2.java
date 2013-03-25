package a_practice_leo;

public class CallStackTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		callFirstMethod();
		System.out.println("main ended");
		
	}
		
		static void callFirstMethod(){
			System.out.println("first method started");
			callSecondMethod();
			System.out.println("first method ended");
		}

		static void callSecondMethod()	{
			System.out.println("second method started");
			System.out.println("second method ended");
		}
		
		
		
	}

