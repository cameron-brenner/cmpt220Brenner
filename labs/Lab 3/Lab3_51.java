import java.util.*;

public class Lab3_51 {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.print("Enter an integer, the input ends if it is 0: ");
    int pos = 0;
    int neg = 0;
    int vector;
    double sum = 0.0;
    do{
      vector = input.nextInt();
      if (vector > 0)
        pos ++;
      if (vector < 0)
        neg ++;
      sum = sum + vector;
    } while(vector != 0);
    
    double avg = sum / (pos + neg);

    System.out.print("The amount of positive integers are: " + pos
                    +"\nThe amount of negative integers are: " + neg 
                    +"\nThe total is: " + sum
                    +"\nThe average is: " + avg);

  }
}