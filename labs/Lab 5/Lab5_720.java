/*
Cameron Brenner
Lab5_720.java
Software Dev 1 
Lab 5 Problem 7.20
3/30.17
*/

import java.util.*;
 
public class Lab5_720 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double[] arr1 = new double[10];
    System.out.println("Enter 10 values for the unsorted array: ");
    
    for(int k = 0; k<10; k++){
      arr1[k] = input.nextDouble();
    }
    
    double[] sortArr = selSort(arr1);

    System.out.println("The select sorted array is: " + Arrays.toString(sortArr));

  }

  static double[] selSort(double[] array){
    double t = 0;
    for(int x = 9; x > 0; x--){
      for(int k = 0; k < (x + 1);k++){
        if(array[k] > array[x]){
          t = array[x];
          array[x] = array[k];
          array[k] = t;
        }
      }
    }
    return array;
  }
}