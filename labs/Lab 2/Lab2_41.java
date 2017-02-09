import java.util.*;

public class Lab2_41 {
  public static void main(String[] args){
    Scanner input = new Scanner (System.in);
      System.out.print("Please enter the length from the center of the pentagon to a vertex: ");
        double radius = input.nextDouble();
      double sideLength = (2 * radius * Math.sin((double) (Math.PI / 5)));
      double area = ((5 * Math.pow(sideLength, 2)) / (4 * Math.tan((double)(Math.PI/5))));
      System.out.printf("The area of the pentagon is %.2f", area);
  }
}          

