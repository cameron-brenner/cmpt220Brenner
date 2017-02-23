import java.util.*;

public class Lab2_48 {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.print("Please enter an ASCII code that will be \n converted to its corresponding character: ");
      int ascii = input.nextInt();
    char convChar = (char)(ascii);
    System.out.print("The ASCII value " + ascii + " will return the character " + convChar + " .");
    
  }
}