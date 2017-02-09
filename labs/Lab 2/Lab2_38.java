import java.util.*;

public class Lab2_38 {
  public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    System.out.print("Please enter a number: ");
      int firstNumber = input.nextInt();
    System.out.print("Please enter a second number: ");
      int secondNumber = input.nextInt();
    System.out.print("Please enter a third number: ");
      int thirdNumber = input.nextInt();
    if (firstNumber < secondNumber && firstNumber < thirdNumber){
	  if (secondNumber < thirdNumber){
        System.out.print(firstNumber +  "," + secondNumber + ","  + thirdNumber);
      }
      else {
        System.out.print(firstNumber + "," + thirdNumber + "," + secondNumber);
      }
     }	
    if (secondNumber < thirdNumber && secondNumber < firstNumber){
      if (thirdNumber < firstNumber){
        System.out.print(secondNumber + "," + thirdNumber + "," + firstNumber);
      }
      else {
        System.out.print(secondNumber + "," + firstNumber + "," + thirdNumber);
      }
    }
    if (thirdNumber < secondNumber && thirdNumber < firstNumber){
      if (secondNumber < firstNumber){
        System.out.print(thirdNumber + "," + secondNumber + "," + firstNumber);
      }
      else {
        System.out.print(thirdNumber + "," + firstNumber + "," + secondNumber);
      }
    }	
  }
}          