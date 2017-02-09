import java.util.*;

public class Lab2_315 {
  public static void main(String[] args){
    Scanner input = new Scanner (System.in);
       int origLottery = (int)(Math.random() * 999) + 1;
        int lotto1 = (int)(origLottery % 10);
        int newLottery = (int)(origLottery / 10);
        int lotto2 = (int)(newLottery % 10);
        int lotto3 = (int)(newLottery / 10);
      System.out.print("Please enter a three digit lottery guess: ");
        int origGuess = input.nextInt();
          int guess1 = (int)(origGuess % 10); 
          int newGuess = (int)(origGuess / 10);
          int guess2 = (int)(newGuess % 10); 
          int guess3 = (int)(newGuess / 10);
      
      int prize = 0;
      if ( lotto1 == guess1 && lotto2 == guess2 && lotto3 == guess3) prize = 1;
      
      else if ( lotto1 == guess1 && lotto2 == guess3 && lotto3 == guess2) prize = 2;
      else if ( lotto1 == guess2 && lotto2 == guess3 && lotto3 == guess1) prize = 2;
      else if ( lotto1 == guess2 && lotto2 == guess1 && lotto3 == guess3) prize = 2;
      else if ( lotto1 == guess3 && lotto2 == guess1 && lotto3 == guess2) prize = 2;
      else if ( lotto1 == guess3 && lotto2 == guess2 && lotto3 == guess1) prize = 2;

      else if ( lotto1 == guess1 || lotto1 == guess2 || lotto1 == guess3) prize = 3;
      else if ( lotto2 == guess1 || lotto2 == guess2 || lotto2 == guess3) prize = 3;
      else if ( lotto3 == guess1 || lotto3 == guess2 || lotto3 == guess3) prize = 3;

      else prize = 4;

      System.out.println("The lottery number is " + lotto1 + " " + lotto2 + " " + lotto3);
    
      switch(prize){
      case 1: System.out.print("Congratulations, you matched the numbers and won $10,000!");
      break;
      case 2: System.out.print("You matched the numbers,but not it order, and won $3,000!");
      break;
      case 3: System.out.print("You matched one number and won $1,000!");
      break;
      case 4: System.out.print("You did not match any numbers and did not win anything :(");
      break;
      }

        
  }
}          

