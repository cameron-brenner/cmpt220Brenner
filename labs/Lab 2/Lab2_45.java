import java.util.*;

public class Lab2_45 {
  public static void main(String[] args){
    Scanner input = new Scanner (System.in);
      System.out.print("Please enter the number of sides: ");
        double sides = input.nextDouble();
      System.out.print("Please enter the length of a side: ");
        double sideLength = input.nextDouble();
      double area = ((sides * Math.pow(sideLength, 2)) / (4 * Math.tan((double)(Math.PI/ sides))));
      System.out.print("The area of the pentagon is " + area);
  }
}          

