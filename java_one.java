package codesoft;

import java.util.Scanner;
import java.util.Random;

public class java_one {


    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100: ");
        int userGuess = scanner.nextInt();

        int numberOfGuesses = 1;
        while (userGuess != randomNumber) {
            if (userGuess > randomNumber) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("Your guess is too low.");
            }


            numberOfGuesses++;


            System.out.println("Guess again: ");
            userGuess = scanner.nextInt();
        }

        System.out.println("Congratulations! You guessed the correct number in " + numberOfGuesses + " tries.");
    }
}


