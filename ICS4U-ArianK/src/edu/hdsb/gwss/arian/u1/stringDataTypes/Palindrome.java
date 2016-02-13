/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u1.stringDataTypes;

import java.util.Scanner;

/**
 *
 * @author ARIAN
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String userWordChoice;

        Scanner input = new Scanner(System.in);

        System.out.println("This program will determine if a word chosen by a user is a palindrome");

        System.out.println("Enter a word:");
        userWordChoice = input.nextLine();

        String conversion = userWordChoice;

        String allToLowerCase = conversion.toLowerCase();

        int length = allToLowerCase.length();

        int math = allToLowerCase.length() / 2;

        int check = 0;

        for (int i = 0; i <= math; i++) {

            if (allToLowerCase.substring(i, i + 1).equals(allToLowerCase.substring(length - 1 - i, length - i))) {

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
