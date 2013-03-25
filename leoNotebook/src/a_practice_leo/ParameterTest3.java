package a_practice_leo;

public class ParameterTest3 {

	/**
	 * @param args
	 */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x={10};
		System.out.println("main() : x="+x[0]);
		
	
		change(x);
		System.out.println("Af ter change(x)");
		System.out.println("main() : ="+ x[0]);
		
	}
	
	static void change(int[] x){
		x[0]=1000;
		System.out.println("change() : x= "+x[0]);
	}

}
