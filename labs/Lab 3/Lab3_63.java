/*
Lab3_63.java
Cameron Brenner
Software Dev 1
Lab 3
February 28 , 2017
Lab 3 problem 6.3
*/
import java.util.*;

public class Lab3_63 {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.print("Please enter an integer that will be reversed: ");
    int number = input.nextInt();
    int revInt = reverse(number);
    
    System.out.println("The integer in reversed order is: " + revInt);
    if (isPalindrome(number) == true){
      System.out.println("The integer that was entered is a palindrome. ");
    }
      
        
  }
  //return the reversal of an integer
  public static int reverse(int number){
    int rev = 0;
    int orig = number;
    while(number != 0){
      rev = (rev * 10) + (number % 10);
      number /= 10;
    }
    return rev;
  }
  //return true if number is a palindrome
  public static boolean isPalindrome(int number){
    int rev = 0;
    int orig = number;
    while(number != 0){
      rev = (rev * 10) + (number % 10);
      number /= 10;
    }
    
    boolean result;

    if (orig == rev){
      result = true;
    }
    else
      result = false;
    return result;
    

  }
}