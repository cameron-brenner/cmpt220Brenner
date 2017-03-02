/*
Lab3_62.java
Cameron Brenner
Software Dev 1
Lab 3
February 28, 2017
Lab 3 problem 6.2
*/

import java.util.*;

public class Lab3_62{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int integers = input.nextInt();
    int sum = digitSum(integers);
    System.out.println("The addition of " + integers + " is: " + sum + ".");
    
    
  }

  public static int digitSum(long n){
    int sum = 0; 
    long number = 0;
    while(n >0){
      number = n % 10;
      sum += number;
      n /= 10;
    } 
      return sum;
  }
}          

