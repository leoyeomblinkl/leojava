package ex05;

public class Ex0510 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] abcCode=
			{'`', '~','!','@','#','$','%','^','&','*','(',')','-','_','+','+','|','[',']','{','}',';',':',',','.','/'
	};
		char[] numCode=
			{
			'q','w','e','r','t','y','u','i','o','p'
		};
		
		String src="abc123";
		String result="";
		
		
		for (int i = 0; i < src.length(); i++) {
			char temp='	';
			temp=src.charAt(i);
			if ('a'<=temp&&temp<='z') {
				result+=abcCode[temp-'a'];
			} else if('0'<=temp&&temp<='9'){
				result+=numCode[temp-'0'];
			} else {
			result+=' ';
			}
		}
		System.out.println("src= "+src);
		System.out.println("Code= "+result);
		
}
}
