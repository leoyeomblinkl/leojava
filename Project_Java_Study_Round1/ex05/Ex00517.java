package ex05;

import javax.swing.*;

public class Ex00517 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer =(int)(Math.random()*100)+1;
		int input=0;
		String temp ="";
		int count=0;
		
		do {
			++count;
			
			temp = JOptionPane.showInputDialog("put numbers between 1~100!!");
			
			if(temp==null||temp.equals("-1")) break;
			System.out.println("input:"+temp);
			
			input=Integer.parseInt(temp);
			
			if (input>answer) {
				System.out.println("put smaller number!");
			}
			else if (input<answer) {
				System.out.println("put bigger number!");
			}
			else {
				System.out.println("You got it!");
				System.out.println("You tried "+count+"times");
				break;
			}
			
			
		} while (true);
		
	}

}
