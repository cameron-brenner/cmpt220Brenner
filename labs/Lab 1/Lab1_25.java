import java.util.Scanner;

public class Lab1_25 {
  public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.print("Please enter the subtotal: ");
	double subtotal = input.nextDouble();
	System.out.print("Please enter a gratuity rate: ");
	double gratuityrate = input.nextDouble();
	double gratuitypercent = (gratuityrate * .01) ;//sets gratuity to percent
	double gratuity = (gratuitypercent * subtotal) ;
	double total = (gratuity + subtotal) ;
	System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
   
  }
}