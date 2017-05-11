/*
Cameron Brenner
Lab5_731.java
Software Dev 1 
Lab 5 Problem 7.31
3/30.17
*/

import java.util.*;
 
public class Lab5_731 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Length of the first array: ");
    int lenA = input.nextInt();
    double[] arrA = new double[lenA];
    
    System.out.println("Length of the second array: ");
    int lenB = input.nextInt();
    double[] arrB = new double[lenB];

    System.out.println("First array values: ");
    for (int n = 0; n < lenA; n++){
        arrA[n] = input.nextDouble();
    }

    System.out.println("Second array values: ");
    for (int q = 0; q < lenB; q++){
        arrB[q] = input.nextDouble();
    }
    
    double[] sortArrA = selSort(arrA);
    double[] sortArrB = selSort(arrB);

    double[] mergeArr = arrMerge(sortArrA, sortArrB);
    
    double[] sortMergeArr = selSort(mergeArr);

    System.out.println("The merged and sorted array is: ");
    for(int j = 0; j < sortMergeArr.length; j++){
      System.out.print(sortMergeArr[j] + " ");
    }
    
    

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
  static double[] arrMerge(double[] array1, double[] array2){
    double[] mergeArr = new double[];
    double temp = 0;
    for(int i = 0; i < array1.length; i++){
      mergeArr[i] = array1[i];
      if (mergeArr[i] = array1[array1.length]){
        for(int x = 0; x < array2.length; x++){
          mergeArr[x] = array2.length[i];
        }
      }
    }
    return mergeArr;
  }
}