package ex06;

public class Ex00605 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex00605 r=new Ex00605();
		
		int result= r.add(3,5);
		System.out.println(result);
		
		int[] result2= {0};
		r.add(3,5,result2);
		System.out.println(result2[0]);
		
		
	}
		int add(int a, int b){
			return a+b;
			
			}
		void add(int a, int b, int[] result) {
			result[0]= a+b;
		}
}

