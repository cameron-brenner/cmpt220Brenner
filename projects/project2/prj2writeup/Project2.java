/*
Cameron  Brenner
Software Dev 1
Project 2
*/
import java.util.*;

public class Project2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Welcome to the Bible Trivia Game for Children!\n");
    System.out.print("Would you like to play?(Y/N): ");
    String game = input.nextLine();
    int questionOT;
    int score = 0;
    while (game.equals("Y")){
      System.out.print("Would you like Old Testament trivia or New\n "+
                       "Testament trivia?(OT/NT): ");
      String section = input.nextLine();
      String answer = "";
     
      while (section.equals("OT") || section.equals("ot")){
        questionOT = (int)(Math.random() * 7);
        if (questionOT == 0){
          System.out.println("How many days did it take for God to create everything?");
          System.out.println("A. 3");
          System.out.println("B. 6");
          System.out.println("C. 1");
          System.out.println("D. 100");
          System.out.print("What is your answer?: ");
          answer = input.nextLine();
          if (answer.equals("B") || answer.equals("b")){
            System.out.println("That is correct!");
            score++;
          }
          else{
            System.out.println("Sorry, that is incorrect");
          }
          System.out.println("Would you like another question?(Y/N): ");
          game = input.nextLine();
          if (game.equals("Y") == false)
            game = "N"; 
          else;
            break;
        }
        if (questionOT == 1){
          System.out.println("What kind of animal tempted Adam and Eve?");
          System.out.println("A. Snake");
          System.out.println("B. Panda Bear");
          System.out.println("C. Mongoose");
          System.out.println("D. Dog");
          System.out.print("What is your answer?: ");
          answer = input.nextLine();
          if (answer.equals("A") || answer.equals("a")){
            System.out.println("That is correct!");
            score++;
          }
          else{
            System.out.println("Sorry, that is incorrect");
          }
          System.out.println("Would you like another question?(Y/N): ");
          game = input.nextLine();
          if (game.equals("Y") == false)
            game = "N"; 
          else;
            break;
          
        }
        if (questionOT == 2){
          System.out.println("What did God ask Abraham to do to Isaac?");
          System.out.println("A. Play baseball with him");
          System.out.println("B. Go on a nice hike");
          System.out.println("C. Sacrifice him");
          System.out.println("D. Play some football:)");
          System.out.print("What is your answer?: ");
          answer = input.nextLine();
          if (answer.equals("C") || answer.equals("c")){
            System.out.println("That is correct!");
            score++;
          }
          else{
            System.out.println("Sorry, that is incorrect");
          }
          System.out.println("Would you like another question?(Y/N): ");
          game = input.nextLine();
          if (game.equals("Y") == false)
            game = "N"; 
          else;
            break;
          
        }
        if (questionOT == 3){
          System.out.println("How many pieces of silver was Joseph sold for?");
          System.out.println("A. 42");
          System.out.println("B. 27");
          System.out.println("C. 14");
          System.out.println("D. 20");
          System.out.print("What is your answer?: ");
          answer = input.nextLine();
          if (answer.equals("D") || answer.equals("d")){
            System.out.println("That is correct!");
            score++;
          }
          else{
            System.out.println("Sorry, that is incorrect");
          }
          System.out.println("Would you like another question?(Y/N): ");
          game = input.nextLine();
          if (game.equals("Y") == false)
            game = "N"; 
          else;
            break;
          
        }
        if (questionOT == 4){
          System.out.println("How did God tell Moses who he was?");
          System.out.println("A. I am who am");
          System.out.println("B. Hey, it's your buddy God!");
          System.out.println("C. What's poppin' Jimbo");
          System.out.println("D. I am God");
          System.out.print("What is your answer?: ");
          answer = input.nextLine();
          if (answer.equals("A") || answer.equals("a")){
            System.out.println("That is correct!");
            score++;
          }
          else{
            System.out.println("Sorry, that is incorrect");
          }
          System.out.println("Would you like another question?(Y/N): ");
          game = input.nextLine();
          if (game.equals("Y") == false)
            game = "N"; 
          else;
            break;
          
        }
        if (questionOT == 5){
          System.out.println("How many plagues did God send upon Egypt?");
          System.out.println("A. 3");
          System.out.println("B. 7");
          System.out.println("C. 5");
          System.out.println("D. 14");
          System.out.print("What is your answer?: ");
          answer = input.nextLine();
          if (answer.equals("B") || answer.equals("b")){
            System.out.println("That is correct!");
            score++;
          }
          else{
            System.out.println("Sorry, that is incorrect.");
          }
          System.out.println("Would you like another question?(Y/N): ");
          game = input.nextLine();
          if (game.equals("Y") == false)
            game = "N"; 
          else;
            break;
          
        }
        if (questionOT == 6){
          System.out.println("How many days did the Hebrews spend wandering the desert?");
          System.out.println("A. 40");
          System.out.println("B. 12");
          System.out.println("C. 33");
          System.out.println("D. 9");
          System.out.print("What is your answer?: ");
          answer = input.nextLine();
          if (answer.equals("A") || answer.equals("a")){
            System.out.println("That is correct!");
            score++;
          }
          else{
            System.out.println("Sorry, that is incorrect");
          }
          System.out.println("Would you like another question?(Y/N): ");
          game = input.nextLine();
          if (game.equals("Y") == false)
            game = "N"; 
          else;
            break;
          
        }
        if (questionOT == 7){
          System.out.println("Who was the first king of Israel?");
          System.out.println("A. Benjimen");
          System.out.println("B. Joseph");
          System.out.println("C. Saul");
          System.out.println("D. Elijah");
          System.out.print("What is your answer?: ");
          answer = input.nextLine();
          if (answer.equals("B") || answer.equals("b")){
            System.out.println("That is correct!");
            score++;
          }
          else{
            System.out.println("Sorry, that is incorrect");
          }
          System.out.println("Would you like another question?(Y/N): ");
          game = input.nextLine();
          if (game.equals("N"))
            game = "N"; 
          else;
            break;
          
        }
      }
      while (section.equals("NT") || section.equals("nt")){
        
        int questionNT = (int)(Math.random() * 7);
        if (questionNT == 0){
          System.out.println("How many Magi visited Jesus at his birth?");
          System.out.println("A. 3");
          System.out.println("B. 2");
          System.out.println("C. 1");
          System.out.println("D. 5");
          System.out.print("What is your answer?: ");
          answer = input.nextLine();
          if (answer.equals("A") || answer.equals("a")){
            System.out.println("That is correct!");
            score++;
          }
          else{
            System.out.println("Sorry, that is incorrect");
          }
          System.out.println("Would you like another question?(Y/N): ");
          game = input.nextLine();
          if (game.equals("Y") == false)
            game = "N"; 
          else;
            break;
          
        }
        if (questionNT == 1){
          System.out.println("At what age did Jesus get lost at the Temple?");
          System.out.println("A. 14");
          System.out.println("B. 12");
          System.out.println("C. 23");
          System.out.println("D. 7");
          System.out.print("What is your answer?: ");
          answer = input.nextLine();
          if (answer.equals("B") || answer.equals("b")){
            System.out.println("That is correct!");
            score++;
          }
          else{
            System.out.println("Sorry, that is incorrect");
          }
          System.out.println("Would you like another question?(Y/N): ");
          game = input.nextLine();
          if (game.equals("Y") == false)
            game = "N"; 
          else;
            break;
          
        }
        if (questionNT == 2){
          System.out.println("How many days did Jesus spend in the desert?");
          System.out.println("A. 40");
          System.out.println("B. 13");
          System.out.println("C. 33");
          System.out.println("D. 9");
          System.out.print("What is your answer?: ");
          answer = input.nextLine();
          if (answer.equals("A") || answer.equals("a")){
            System.out.println("That is correct!");
            score++;
          }
          else{
            System.out.println("Sorry, that is incorrect");
          }
          System.out.println("Would you like another question?(Y/N): ");
          game = input.nextLine();
          if (game.equals("Y") == false)
            game = "N";
          else;
            break; 
          
        }
        if (questionNT == 3){
          System.out.println("How many times did the devil tempt Jesus?");
          System.out.println("A. 2");
          System.out.println("B. 7");
          System.out.println("C. 4");
          System.out.println("D. 3");
          System.out.print("What is your answer?: ");
          answer = input.nextLine();
          if (answer.equals("D") || answer.equals("d")){
            System.out.println("That is correct!");
            score++;
          }
          else{
            System.out.println("Sorry, that is incorrect");
          }
          System.out.println("Would you like another question?(Y/N): ");
          game = input.nextLine();
          if (game.equals("Y") == false)
            game = "N"; 
          else;
            break;
          
        }
        if (questionNT == 4){
          System.out.println("Who baptized Jesus?");
          System.out.println("A. Moses");
          System.out.println("B. John the Baptist");
          System.out.println("C. Peter");
          System.out.println("D. Thomas");
          System.out.print("What is your answer?: ");
          answer = input.nextLine();
          if (answer.equals("B") || answer.equals("b")){
            System.out.println("That is correct!");
            score++;
          }
          else{
            System.out.println("Sorry, that is incorrect");
          }
          System.out.println("Would you like another question?(Y/N): ");
          game = input.nextLine();
          if (game.equals("Y") == false)
            game = "N"; 
          else;
            break;
          
        }
        if (questionNT == 5){
          System.out.println("How many Apostles did Jesus have?");
          System.out.println("A. 3");
          System.out.println("B. 7");
          System.out.println("C. 5");
          System.out.println("D. 12");
          System.out.print("What is your answer?: ");
          answer = input.nextLine();
          if (answer.equals("D") || answer.equals("d")){
            System.out.println("That is correct!");
            score++;
          }
          else{
            System.out.println("Sorry, that is incorrect.");
          }
          System.out.println("Would you like another question?(Y/N): ");
          game = input.nextLine();
          if (game.equals("Y") == false)
            game = "N"; 
          else;
            break;
          
        }
        if (questionNT == 6){
          System.out.println("How many days was Jesus resurrected for?");
          System.out.println("A. 40");
          System.out.println("B. 12");
          System.out.println("C. 33");
          System.out.println("D. 9");
          System.out.print("What is your answer?: ");
          answer = input.nextLine();
          if (answer.equals("A") || answer.equals("a")){
            System.out.println("That is correct!");
            score++;
          }
          else{
            System.out.println("Sorry, that is incorrect");
          }
          System.out.println("Would you like another question?(Y/N): ");
          game = input.nextLine();
          if (game.equals("Y") == false)
            game = "N"; 
          else;
            break;
          
        }
        if (questionNT == 7){
          System.out.println("Who persecuted early Christians then converted after\n" +
                             "a vision of Jesus?");
          System.out.println("A. Benjimen");
          System.out.println("B. Joseph");
          System.out.println("C. Saul");
          System.out.println("D. Elijah");
          System.out.print("What is your answer?: ");
          answer = input.nextLine();
          if (answer.equals("B") || answer.equals("b")){
            System.out.println("That is correct!");
            score++;
          }
          else{
            System.out.println("Sorry, that is incorrect");
          }
          System.out.println("Would you like another question?(Y/N): ");
          game = input.nextLine();
          if (game.equals("Y") == false)
            game = "N"; 
          else;
            break;
          
        }
      }
    }
    
    if (game.equals("N")){
      System.out.print("Thank you for playing! Your score was "+score+"!");
    }

    
  }
}