import java.util.Scanner;

public class Lab5_731 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the length of list 1: ");
    int[] list1 = new int[input.nextInt()];
    
    System.out.print("Enter list 1: ");
    for (int i = 0; i < list1.length; i++) {
      list1[i] = input.nextInt();
    }

    System.out.print("Enter the length of list 2: ");
    int[] list2 = new int[input.nextInt()];

    System.out.print("Enter list 2: ");
    for (int i = 0; i < list2.length; i++) {
      list2[i] = input.nextInt();
    }


    int[] mergeList = merge(list1, list2);

    System.out.print("The merged list is");
    for (int e: mergeList) {
      System.out.print(" " + e);
    }
    System.out.println();
  }


  public static int[] merge(int[] list1, int[] list2)  {
    int[] merList = new int[list1.length + list2.length];
  
    for (int i = 0; i < list1.length; i++)
      merList[i] = list1[i];

    for (int i = 0, j = list1.length; i < list2.length; i++, j++) {
      merList[j] = list2[i];	
    }

    sort(merList);

    return merList;
  }


  public static void sort(int[] list) {
    for (int i = 0; i < list.length - 1; i++) {
      int min = list[i];
      int minIndex = i;

      for (int j = i + 1; j < list.length; j++) {
        if (list[j] < min) {
          min = list[j];
          minIndex = j; 
        }					
      }

      if (minIndex != i) {
        list[minIndex] = list[i];
        list[i] = min;
      }
    }
  }
}