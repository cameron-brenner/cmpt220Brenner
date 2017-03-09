/*
Lab4_79.java
Cameron Brenner
Software Dev 1
Lab 4
March 9, 2017
Lab 4 problem 7.9
*/

import java.util.*;

public class Lab4_79{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    double[] array = new double[10];
    
    System.out.println("Please enter ten numbers: ");
    for(int n = 0; n < 9; n++)
      array[n] = input.nextDouble();

    double minimum = smallest(array);
    System.out.println("The smallest number in the array is: " + minimum);
    
  }
  
  public static double smallest(double[] array){
    double small = array[0];
    for(int k = 0; k < 9; k ++){
      if(small > array[k])
        small = array[k];
    }
    return small;
  }
}          

