import java.util.Scanner;

/**
 * Uses remainder to check what the user should say in a game of FizzBuzz
 * @author Cole G.
 */
public class Main {
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);

    //ask the user for a number
    System.out.println("Please enter a number to play FizzBuzz");
    //Get the number from the user
    int userNumber = input.nextInt();

    //Checks if the userNumber has a remainder when divided by 3
    int fizz = userNumber % 3;

    //Checks if the userNumber has a remainder when divided by 5
    int buzz = userNumber % 5;

    //checks if the user should say FizzBuzz
    if(fizz == 0 && buzz == 0){
      //prompts the user to say FizzBuzz
      System.out.println("you should say FizzBuzz");
      //checks if the user should say Buzz
    }else if(buzz == 0){
      //prompts the user to say Buzz
      System.out.println("you should say Buzz");
      //checks if the user should say Fizz
    }else if(fizz == 0){
      //prompts the user to say Fizz
      System.out.println("you should say Fizz");
      //Checks if the user should say the number they input
    }else if(fizz >= 1 && buzz >= 1){
      //prompts the user to say the number they input
      System.out.println("you should say " + userNumber);
    }
  }
}
