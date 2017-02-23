import java.util.*;

public class Lab3_513 {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    double n = 0.0;
    while(Math.pow(n,3) < 12000){
      n++;
    }
    System.out.println( n+ " is the largest integer such that n^3 is less than 12,000.");
  }
}