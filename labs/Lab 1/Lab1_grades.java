import java.util.Scanner;

//Homework and Labs 40%
//Projects 20%
//Midterm exam 20%
//Final exam 20%

public class Lab1_grades {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Please enter the following as percentage...");
    System.out.print("Midterm Exam: ");
      double midterm = input.nextDouble();
      double midtermpercent = (midterm * .2);
    System.out.print("Final Exam: ");
      double finalex = input.nextDouble();
      double finalexpercent = (finalex * .2);
    System.out.print("Projects: ");
      double project = input.nextDouble();
      double projectpercent = (project * .2);
    System.out.print("Homework and Labs: ");
      double hwlabs = input.nextDouble();
      double hwlabspercent = (hwlabs * .4);
    double finalgrade = (midtermpercent + finalexpercent + projectpercent + hwlabspercent);
	System.out.println("Your final grade is: " + finalgrade);
	
  }
}