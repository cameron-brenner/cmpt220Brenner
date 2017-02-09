import java.util.*;

public class Lab2_311 {
  public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    System.out.print("Please enter a month in the numerical form: ");
       int month = input.nextInt(); 
    System.out.print("Please enter a year in numerical form: ");
       int year = input.nextInt();
    switch (month){
      case 1: System.out.print("January had 31 days in " + year);
      break;
      case 2: 
        if (year%4 == 0) System.out.print("February had 29 days in " + year);
        
        else System.out.print("February had 28 days in " + year);
    
      break;
      case 3: System.out.print("March had 31 days in " + year);
      break;
      case 4: System.out.print("April had 30 days in " + year);
      break;
      case 5: System.out.print("May had 31 days in " + year);
      break;
      case 6: System.out.print("June had 30 days in " + year);
      break;
      case 7: System.out.print("July had 31 days in " + year);
      break;
      case 8: System.out.print("August had 31 days in " + year);
      break;
      case 9: System.out.print("September had 30 days in " + year);
      break;
      case 10: System.out.print("October had 31 days in " + year);
      break;
      case 11: System.out.print("November had 30 days in " + year);
      break;
      case 12: System.out.print("December had 31 days in " + year);
      break;
    }
  }
}          

