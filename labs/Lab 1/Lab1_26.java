import java.util.Scanner;

public class Lab1_26 {
  public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
    System.out.print("Please enter a three digit number: ");
	int ognumber = input.nextInt();
	int number1 = (ognumber % 10);
	int newnumber = (ognumber / 10); 
	int number2 = (newnumber % 10);
	int number3 = (newnumber / 10); // this gives the third number, no use using modulus operator again or renaming the original
	int total = (number1 + number2 + number3);
	System.out.println("The sum of the digits is " + total); 
  }
}