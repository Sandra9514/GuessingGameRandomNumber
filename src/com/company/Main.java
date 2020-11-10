package com.company;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();   // creating a new Random () class object ( instance od Random() class)
        int mysteriousRandomNumber;  // creating a new int type variable
        mysteriousRandomNumber = random.nextInt(10) + 1; // value assignment (storing random number in mysteriousRandomNumber)

        Scanner number = new Scanner(System.in);
        int guessNumber;
        int numberOfShots = 0;  // number of attempts

        do {
            System.out.println("Enter a number of your choice between 0 - 10:");
            guessNumber = number.nextInt();

            numberOfShots++;


            if (guessNumber > mysteriousRandomNumber) {

                System.out.println("Incorrect! Your guess is higher than mine. Try again!");
            }
            else if (guessNumber < mysteriousRandomNumber) {

                System.out.println("Incorrect! Your guess is lower than mine. Try again!");
            }
            else {

                System.out.println("Correct!! You guessed my number ;)");
            }

        }
        while (guessNumber != mysteriousRandomNumber);


        System.out.println("You win this GuessingGameRandomNumber!!!");
        System.out.println("You tried to guess: " + numberOfShots + " times.");

    }
}