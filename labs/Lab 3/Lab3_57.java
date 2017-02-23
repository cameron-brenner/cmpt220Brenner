import java.util.*;

public class Lab3_57 {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    double tuition = 10000.0;
    double rate = 0.05;
    double fourYear = 0.0; 
    for (int year = 1; year <= 14 ; year++){
      tuition += (rate * tuition);
      if (year == 10)
        System.out.printf("The tuition after ten years is: $ %.2f", tuition);
      if (year>10)
        fourYear += tuition;
    }
    System.out.printf("\n The tuition for four years after ten years will be: $ %.2f", fourYear);

  }
}