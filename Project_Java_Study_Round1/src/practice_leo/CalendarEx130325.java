package practice_leo;

import javax.swing.*;

public class CalendarEx130325 {

	/**
	 * @param args
	 */
   	public static void main(String[] args) {
  	// TODO Auto-generated method stub
 
		String temp ="";
		
		int input=20;
		temp=JOptionPane.showInputDialog("Put the number of the month you want to be shown (1~12), " + "if you do not want to see any of calendar, press -1");
		input = Integer.parseInt(temp);
		
		String[] monthName = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November","December" };
		
	
		String[] numberOfMonth={"   1", "   2","   3","   4", "   5","   6","   7","   8","   9","  10", "  11","  12","  13","  14","  15","  16","  17","  18","  19","  20","  21","  22","  23","  24","  25","  26","  27", "  28","  29","  30","  31"	
			
			};
				
		String[] numberOfTheMonth= new String[39];
		for (int i = 0; i < numberOfTheMonth.length; i++) {
			numberOfTheMonth[i]="    ";
		}
		
		
		if (input==1) {
			System.arraycopy(numberOfMonth, 0, numberOfTheMonth, 2, 31);
		} else if (input==2) {
			System.arraycopy(numberOfMonth, 0, numberOfTheMonth, 5, 28);
		} else if (input==3) {
			System.arraycopy(numberOfMonth, 0, numberOfTheMonth, 5, 31);
		} else if (input==4) {
			System.arraycopy(numberOfMonth, 0, numberOfTheMonth, 1, 30);
		} else if (input==5) {
			System.arraycopy(numberOfMonth, 0, numberOfTheMonth, 3, 31);
		} else if (input==6) {
			System.arraycopy(numberOfMonth, 0, numberOfTheMonth, 6, 30);
		} else if (input==7) {
			System.arraycopy(numberOfMonth, 0, numberOfTheMonth, 1, 31);
		} else if (input==8) {
			System.arraycopy(numberOfMonth, 0, numberOfTheMonth, 4, 31);
		} else if (input==9) {
			System.arraycopy(numberOfMonth, 0, numberOfTheMonth, 0, 30);
		} else if (input==10) {
			System.arraycopy(numberOfMonth, 0, numberOfTheMonth, 2, 31);
		} else if (input==11) {
			System.arraycopy(numberOfMonth, 0, numberOfTheMonth, 5, 30);
		} else if (input==12) {
			System.arraycopy(numberOfMonth, 0, numberOfTheMonth, 0, 31);
		} else {

		}
			
		if (1<=input && input<=12) {
			
		
		
		System.out.println();
		System.out.println("2013          "+monthName[--input]);
		System.out.println();
		
		System.out.println(" Mon Tue Wed Thu Fri Sat Sun");
		for (int i = 0; i < numberOfTheMonth.length; i++) {
			System.out.print(numberOfTheMonth[i]);
			switch (i) {
			case 6: case 13: case 20: case 27: case 34:
				System.out.println();
		
			} 
		} 
		}
		else {
				System.out.println("Plz put numbers between 1 and 12 :)");
			}
			}
				
		
				
				
				
				
				
				
				
				
				
   	}
   	
   	
   	
   	
   	
	
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


