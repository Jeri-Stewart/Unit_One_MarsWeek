import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
public class GuessingGame {
    public GuessingGame(){
        System.out.println("Hello! It's great to meet you!");
        System.out.println("What is your name?");

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();

        System.out.println(name + " I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess what the number is?");

        System.out.println(String.format("Nice to meet you %s. I'm thinking of a number between 1 and 100.", name));
        System.out.println("Can you guess the number?");

        Random rand = new Random();
        int number = rand.nextInt(100);
        int tries = 0;

        while (true) {

            int guess;
            try {
                guess = input.nextInt();
            } catch (InputMismatchException e) {
                String bad_input = input.next();
                System.out.println("That's not an integer! I said guess a NUMBER between 1 and 100. try again");
                continue;
            }

            if (guess < 1 || guess > 100) {
                System.out.println(String.format("C'mon, %d is not a valid number, try again", guess));
                continue;
            }

            tries = tries + 1;

            if (guess < number) {
                System.out.println("Your guess is too low, please try again.");
            } else if (guess > number) {
                System.out.println("Your guess is too high, please try again.");
            } else {
                System.out.println(String.format("Congratulations %s!", name));
                System.out.println(String.format("You guessed the correct number in %d tries!", tries));
                break;
            }

        }
    }
}
