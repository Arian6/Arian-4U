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
public class Palindrome3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String userWordChoice;

        Scanner input = new Scanner(System.in);

        System.out.println("This program will determine if a word chosen by a user is a palindrome");

        System.out.println("Enter a word:");
        userWordChoice = input.nextLine();

        System.out.println("");

        String conversion = userWordChoice;

        String allToLowerCase = conversion.toLowerCase();

        StringTokenizer ayye = new StringTokenizer(allToLowerCase, " ");
        String word = ("");

        while (ayye.hasMoreTokens()) {

            word = word + ayye.nextToken();

        }

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
            System.out.println(userWordChoice + " is a palindrome");
        } else if (check == 0) {
            System.out.println(userWordChoice + " is NOT a palindrome");

        }

    }
}
