import java.util.Scanner;

public class Lab1_21 {
  public static void main(String[] args) {
  Scanner input = new Scanner (System.in);
    System.out.print("Enter the degrees in Celsius: ");
    double celsius = input.nextDouble();
    double farenheit = ((9.0 / 5) * celsius + 32) ;
    System.out.println(celsius + " degrees celsius are " + farenheit + " degrees farenheit");
  }
}