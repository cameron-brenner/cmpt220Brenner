import java.util.*;

public class Lab2_426 {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.print("Please enter an amount of money, for example $11.56: ");
      String amount = input.next();
    int decimal = amount.indexOf(".");
    String dollars = amount.substring(0, decimal);
    String cents = amount.substring(decimal + 1); 
    System.out.println("The amount of dollars are: " + dollars);
    System.out.println("The amount of cents are " + cents);
    int intCents = Integer.parseInt(cents);
    int quarters = (intCents / 25);
    int remainder = intCents - (quarters * 25);
    int dimes = (remainder / 10);
    int remainder1 = remainder - (dimes * 10);
    int nickels = (remainder1 / 5);
    int remainder2 = remainder1 - (nickels * 5);
    int pennies = (remainder2 / 1);
    System.out.println("The amount of quarters are: " + quarters +
                       "\nThe amount of dimes are: " + dimes +
                       "\nThe amount of nickels are: " + nickels +
                       "\nThe amount of pennies are: " + pennies); 
  }
}