/* Name: Palindrome
 * Version: v3
 * Date: Feb 14 2015
 * Author: Arian Krasniqi
 */
package edu.hdsb.gwss.arian.u1.stringDataTypes;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        //initializing Variables
        String userWordChoice = "";
        String conversion = userWordChoice;
        String allToLowerCase = conversion.toLowerCase();
        int length = allToLowerCase.length();
        int math = allToLowerCase.length() / 2;
        int check = 0;

        //Scanner
        Scanner input = new Scanner(System.in);

        //User info
        System.out.println("This program will determine if a word chosen by a user is a palindrome");

        //user choice
        System.out.println("Enter a word:");
        userWordChoice = input.nextLine();

        //for loop determinging matching letters
        for (int i = 0; i <= math; i++) {

            if (allToLowerCase.substring(i, i + 1).equals(allToLowerCase.substring(length - 1 - i, length - i))) {
                //check if letters match
                check = 1;
            } else {
                //if letters ont match, stop checkign as is not palindrome
                check = 0;
                break;

            }

        }

        //Final out-puts telling user if palindrome or not
        if (check == 1) {
            System.out.println(userWordChoice + " is a palindrome");

        } else if (check == 0) {
            System.out.println(userWordChoice + " is NOT a palindrome");
        }

    }

}
