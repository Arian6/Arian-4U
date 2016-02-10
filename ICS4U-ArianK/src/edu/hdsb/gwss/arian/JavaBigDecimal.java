/* Name: JavaBigDecimal
 * Version: v2
 * Date: February 09 2016
 * Author: Arian Krasniqi
 */
package edu.hdsb.gwss.arian;

import java.math.BigDecimal;
import java.util.Scanner;

public class JavaBigDecimal {

    public static void main(String[] args) {

        //declaring amount of total numbers that will be used
        int amountOfNumbers;

        //scanner
        Scanner input = new Scanner(System.in);

        //Introduction to code
        System.out.println("This program will take any real numbers, negatives, decimals, no restrictions at all, an will orer them in descending orer!");
        System.out.println("");

        //user inputs how many numbers will be in the array
        System.out.println("How many numbers will you be testing?");
        amountOfNumbers = input.nextInt();

        //Error Checks - Invalid User Inputs
        if (amountOfNumbers < 0) {
            System.err.println("Invalid amount of numbers!");
        }

        if (amountOfNumbers == 0 || amountOfNumbers == 1) {
            System.err.println("Thats not enough!");
        }

        //If user enters acceptable value, continue code
        if (amountOfNumbers > 1) {

            //initializing empty array of BigDecimals
            BigDecimal numbers[] = new BigDecimal[amountOfNumbers];

            //Setting user chosen variables into positions within the array
            for (int userInputNumber = 0; userInputNumber < amountOfNumbers; userInputNumber++) {

                System.out.println("Enter number " + (userInputNumber + 1) + ":");
                numbers[userInputNumber] = input.nextBigDecimal();
            }

            //space line
            System.out.println("");

            //sorting from greatest to least
            for (int j = 0; j < numbers.length; j++) {

                for (int i = 0; i < numbers.length; i++) {
                    //initializing default storage number
                    BigDecimal tempStorage = new BigDecimal("1");

                    //compare one number in array with another
                    int smallerOrBigger = numbers[j].compareTo(numbers[i]);

                    //if smaller, switch positions with greater number
                    if (smallerOrBigger == 1) {
                        tempStorage = numbers[j];
                        numbers[j] = numbers[i];
                        numbers[i] = tempStorage;

                    }

                }

            }
            //print out array
            System.out.println("Your numbers in descending order are:");

            for (int printEachNumber = 0; printEachNumber < numbers.length; printEachNumber++) {
                System.out.println(numbers[printEachNumber]);
            }
        }
    }
}
