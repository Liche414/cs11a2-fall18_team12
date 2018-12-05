import java.util.Scanner;
import java.util.Random;

public class QuizMaker{
    public static void main(String[] args){
      //Variables used for this quiz, feel free to change them to suit the quiz you want
      int questions = 3;    //sets number of questions
      int minOp = 1;        //sets minimum operand
      int maxOp = 10;       //sets max operand
      int go = 0;           //handles menu entries
      String ops = "+";     //dictates what operation is performed in the quiz
      int ran1 = 0;         //first random number in the quiz, it can be any number between the min and max operands
      int ran2 = 0;         //second random number in the quiz, it can be any number between the min and max operands unless the operation is division then it can never be zero
      int ans = 0;          //answer calculated by the program this is never a decimal
      double ans2 = 0;      //answer calculated by the program specifically for division
      int useans = 0;       //answer the user gives
      double useans2 = 0;   //answer the user gives specific to the division problem
      int correct = 0;      //counts the number of correct answers the user gives
      int theruns = 0;      //counts the number of questions took to show how many of the questions were answered correctly out of the total number

      Scanner sc = new Scanner(System.in);

      Random rand = new Random(); // Declare a Random object, used for generating random numbers

      System.out.println("Hello User!");

      while(go==0){

      //Quiz Settings
      System.out.println("");
      System.out.println("Quiz Settings:");
      System.out.println("    Number of Questions: " + questions);
      System.out.println("    Minimum Operand: " + minOp);
      System.out.println("    Maximim Operand: " + maxOp);
      System.out.println("    Operator: " + ops);
      System.out.println("");

      //Menu
      System.out.println("Main Menu");
      System.out.println("1) Set Number of Questions");
      System.out.println("2) Set Minimum Operand Value");
      System.out.println("3) Set Maximum Operand Value");
      System.out.println("4) Set Operator");
      System.out.println("5) Take Quiz");
      System.out.println("6) Exit");
      System.out.println("Choose an option");

      //Errors for the menu
      do{
        while(!sc.hasNextInt()){
          sc.next();
          System.out.println("Error: Invalid command. ");
        }
        go = sc.nextInt();
        if(go<1||go>6){
          System.out.println("Error: Invalid command. ");
        }
      } while(go<1 || go>6);
      //Processes user's menu choice
      //If user chooses to set number of questions:
      if(go==1){
        System.out.println("Enter a length for the quiz.");
        if(questions>1){
          go--;
        }
        //do loop checks for input errors
            do{
                while(!sc.hasNextInt()){
                    sc.next();
                    System.out.println("Error: Number of questions " + "must be a positive integer. ");
                  }
                  questions=sc.nextInt();
                  if(questions<1){
                    System.out.println("Error: Number of questions " + "must be a positive integer. ");
                  }
                } while(questions<1);
              }
