import java.util.*;

public class Lab2_425 {
  public static void main(String[] args) {
    char let1 = (char)(65 +  (Math.random()* (90-65) + 1 ));
    char let2 = (char)(65 +  (Math.random()* (90-65) + 1 ));
    char let3 = (char)(65 +  (Math.random()* (90-65) + 1 ));

    int num1 = (int)(Math.random() * (9) +1);
    int num2 = (int)(Math.random() * (9) +1);
    int num3 = (int)(Math.random() * (9) +1);
    int num4 = (int)(Math.random() * (9) +1);

    System.out.println("Your randomly generated license plate is: " + let1 + "" + let2
      + "" + let3 + " " + num1 + "" + num2 + "" + num3 + "" + num4); 
  }
}