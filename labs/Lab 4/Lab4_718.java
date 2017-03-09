/*
Lab4_718.java
Cameron Brenner
Software Dev 1
Lab 4
March 9, 2017
Lab 4 problem 7.18
*/

import java.util.*;

public class Lab4_718 { 
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[] array = new double[10];
    
    System.out.println("Please input ten numbers: ");
    for(int i = 0; i <= 9; i++)
      array[i] = input.nextDouble();

    
    double[] newArray = bubSort(array);
    System.out.println("The numbers in bubble sorted order are: ");
    printArr(newArray);
  }
  public static void swap(double[] arr, int idx1, int idx2){
    double tmp = arr[idx1];
    arr[idx1] = arr[idx2];
    arr[idx2] = tmp;
    
      
  } 

  static void printArr(double[] arr){
    for (int k = 0; k < arr.length; k++)
      System.out.print(arr[k]+ " ");
   }

  public static double[] bubSort(double[] bubArray){
    for (int l = 0; l < bubArray.length; l++){
        for (int k = 0; k < bubArray.length -1 ; k++){
          if(bubArray[k] > bubArray[k+1])
            swap(bubArray, k, k+1);
         }
    }
    return bubArray;
  }
}