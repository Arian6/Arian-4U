/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u1.stringDataTypes;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author ARIAN
 */
public class Palinrome2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String userWordChoice;
        int palindromeCounter = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("This program will determine if a word chosen by a user is a palindrome");

        System.out.println("Enter a word:");
        userWordChoice = input.nextLine();

        String conversion = userWordChoice;

        String allToLowerCase = conversion.toLowerCase();

        StringTokenizer ayye = new StringTokenizer(allToLowerCase, " ");

        while (ayye.hasMoreTokens()) {

            String word = ayye.nextToken();

            int length = word.length();
            int math = word.length() / 2;

            int check = 0;

            for (int i = 0; i <= math; i++) {

                if (word.substring(i, i + 1).equals(word.substring(length - 1 - i, length - i))) {

                    check = 1;
                } else {

                    check = 0;
                    break;

                }

            }

            if (check == 1) {
                palindromeCounter = palindromeCounter + 1;
            }

        }

        System.out.println("There are " + palindromeCounter + " palindromes in the sentance " + userWordChoice);

    }

}
