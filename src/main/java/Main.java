import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        // Prompts a user to guess a mystery number within some range.
        // After every guess the program should display some variation of "too large", "too small", "correct guess", respectively.
        // Upon termination, the program should display the number of guesses before successfully guessing correctly.
        // A number that is input consecutively, should register as a single guess.

        System.out.println("Let's play a game!");
        Scanner scanner = new Scanner(System.in);

        int magicNumber = generateRandomNumber();
        int howManyGuesses = 1;

        while(true) {

            System.out.println("Enter a number: ");
            int userGuess = scanner.nextInt();

            if(userGuess == magicNumber){
                System.out.println("Correct guess!");
                System.out.println("It took "+howManyGuesses+" to guess correctly!");
                break;
            }else if(userGuess < magicNumber){
                System.out.println("too small");
                howManyGuesses++;
            }else {
                System.out.println("too big");
                howManyGuesses++;
            }

        }

    }

    public static int generateRandomNumber(){
        int number = (int)(Math.random() * 100);
        return number;
    }
}
