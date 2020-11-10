package com.company;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
 // Task 1
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
 // Task 2
        // Array of positive numbers
        int[] arrayPositive = {6, 5, 10, 30, 2, 15, 9, 11};
        int k = 3;

        System.out.println("Length od arrayPositive: " + arrayPositive.length + "\narrayPositive numbers: " + Arrays.toString(arrayPositive));

        int maxSum = 0;

        for (int firstIndex = 0; firstIndex <= arrayPositive.length - k; firstIndex++) {
            int sum = 0;
            for (int value = firstIndex; value < firstIndex + k; value++) {
                sum = sum + arrayPositive[value];
            }
            maxSum = Math.max(sum, maxSum);
        }
        int result = maxSum;
        System.out.println("MaxSum of 3 elements is: " + result);
    }

    }
