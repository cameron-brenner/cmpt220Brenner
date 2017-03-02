/*
Lab4_620.java
Cameron Brenner
Software Dev 1
Lab 4
March 2, 2017
Lab 4 problem 6.20
*/

import java.util.*;

public class Lab4_620{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter a string: ");
    String strings = input.nextLine();
    int numOfStrings = CountLetters(strings);
    System.out.println("The amount of letters in the string is: " + numOfStrings);
    
  }

  public static int CountLetters(String s){
    int counter = 0; 
    for(int n = 0; n < s.length(); n++){
      if(Character.isLetter(s.charAt(n)))
        counter++;
    }
    return counter;
  }
}

