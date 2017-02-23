import java.util.*;

public class Lab2_415 {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.print("Please enter a letter: ");
      String let = input.next();
    
   
    if (let.equals("a") || let.equals("b") || let.equals("c"))
      System.out.print("The corresponding is 2");

    else if(let.equals("d") || let.equals("e") || let.equals("f"))
      System.out.print("The corresponding is 3");
    
    else if(let.equals("g") || let.equals("h") || let.equals("i"))
      System.out.print("The corresponding is 4");

    else if(let.equals("j") || let.equals("k") || let.equals("l"))
      System.out.print("The corresponding is 5");

    else if(let.equals("m") || let.equals("n") || let.equals("o"))
      System.out.print("The corresponding is 6");

    else if(let.equals("p") || let.equals("q") || let.equals("r") || let.equals("s"))
      System.out.print("The corresponding is 7");

    else if(let.equals("t") || let.equals("u") || let.equals("v"))
      System.out.print("The corresponding is 8");

    else if(let.equals("w") || let.equals("x") || let.equals("y") || let.equals("z"))
      System.out.print("The corresponding is 9");
  }
}