package practice_leo;
import javax.swing.*;

public class Calendar0316 {
 
 /**
  * @param args
  */
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  
  int input =20;
  String temp = "" ;
  
  
  temp =JOptionPane.showInputDialog ("원하는 달을 1~12의 숫자 중 하나로 입력해 주세요!" + "끝내려면 -1을 입력하세요.");
  input = Integer.parseInt(temp);
  
  
  
  
  
  String[] monthTitle = { "January", "February", "March", "April", "May",
    "June", "July", "August", "September", "October", "November",
    "December" };
  int monthInput = input;
  --monthInput;
  String[] dayOfTheWeek = { " Sun", " Mon", " Tue", " Wed", " Thu",
    " Fri", " Sat" };
  String[] dateOfTheMonth = { "   1", "   2", "   3", "   4", "   5",
    "   6", "   7", "   8", "   9", "  10", "  11", "  12", "  13",
    "  14", "  15", "  16", "  17", "  18", "  19", "  20", "  21",
    "  22", "  23", "  24", "  25", "  26", "  27", "  28", "  29",
    "  30", "  31"
 
  };
   String[] daysOfMonth = new String[39];
  
  for (int i = 0; i < daysOfMonth.length; i++) {
   daysOfMonth[i]="    ";
  }
  if (monthInput == 0) {
   System.arraycopy(dateOfTheMonth, 0, daysOfMonth, 2, 31);
  } else if (monthInput == 1) {
   System.arraycopy(dateOfTheMonth, 0, daysOfMonth, 5, 28);
  } else if (monthInput == 2) {
   System.arraycopy(dateOfTheMonth, 0, daysOfMonth, 5, 31);
  } else if (monthInput == 3) {
   System.arraycopy(dateOfTheMonth, 0, daysOfMonth, 1, 30);
  } else if (monthInput == 4) {
   System.arraycopy(dateOfTheMonth, 0, daysOfMonth, 3, 31);
  } else if (monthInput == 5) { 
   System.arraycopy(dateOfTheMonth, 0, daysOfMonth, 6, 30);
  } else if (monthInput == 6) {
   System.arraycopy(dateOfTheMonth, 0, daysOfMonth, 1, 31);
  } else if (monthInput == 7) {
   System.arraycopy(dateOfTheMonth, 0, daysOfMonth, 4, 31);
  } else if (monthInput == 8) {
   System.arraycopy(dateOfTheMonth, 0, daysOfMonth, 0, 30);
  } else if (monthInput == 9) {
   System.arraycopy(dateOfTheMonth, 0, daysOfMonth, 2, 31);
  } else if (monthInput == 10) {
   System.arraycopy(dateOfTheMonth, 0, daysOfMonth, 5, 30);
  } else if (monthInput == 11){
   System.arraycopy(dateOfTheMonth, 0, daysOfMonth, 0, 31);
  } else { System.out.println(" 달력을 출력할 수 없습니다."); }
  
  ;
  if (1<=input && input<=12) {
   
  
  
  
  System.out.println();
  System.out.println("2013          " + monthTitle[monthInput]);
  System.out.println();
  for (int i = 0; i <= 6; i++) {
   System.out.print(dayOfTheWeek[i] + "  ");
  }
  ;
  System.out.println();
  for (int j = 0; j <= 36; j++) {
   
   System.out.print(daysOfMonth[j] + "  ");
   switch(j){
   case 6: case 13: case 20: case 27: case 34: 
    System.out.println();
   }
  }
  ;
  } else {
   
   System.out.println("1~12사이의 숫자를 입력해주세요 ^^");
   
  }

 }
}
