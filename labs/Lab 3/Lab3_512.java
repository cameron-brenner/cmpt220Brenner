import java.util.*;

public class Lab3_512 {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    double n = 0.0;
    while(Math.pow(n,2) < 12000){
      n++;
    }
    System.out.println( n+ " is the smallest integer such that n^2 is greater than 12,000.");
  }
}