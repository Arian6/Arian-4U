/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u1.stringDataTypes;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SimpleEncryption {

    static String userChosenPhrase = "";
    static String encryption = "";
    static int userChosenRotation;

    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<String> alphabet = new ArrayList<String>();
        alphabet.add("a");
        alphabet.add("b");
        alphabet.add("c");
        alphabet.add("d");
        alphabet.add("e");
        alphabet.add("f");
        alphabet.add("g");
        alphabet.add("h");
        alphabet.add("i");
        alphabet.add("j");
        alphabet.add("k");
        alphabet.add("l");
        alphabet.add("m");
        alphabet.add("n");
        alphabet.add("o");
        alphabet.add("p");
        alphabet.add("q");
        alphabet.add("r");
        alphabet.add("s");
        alphabet.add("t");
        alphabet.add("u");
        alphabet.add("v");
        alphabet.add("w");
        alphabet.add("y");
        alphabet.add("x");
        alphabet.add("z");

        System.out.println("Encrypt / Decrypt a message!");
        System.out.println("");

        System.out.println("This program will allow the user to encrypt a message by rotation letters through the alphabet");
        System.out.println("a certain nnumber of times chosen by the user");
        System.out.println("E.g = If the user chooses 2, every A in the sentance becomes a C etc...");
        System.out.println("");

        userRotationNumber();
        userMessageToEncrypt();

        String conversion = userChosenPhrase;

        String allToLowerCase = conversion.toLowerCase();

        StringTokenizer ayye = new StringTokenizer(allToLowerCase, " ");

        while (ayye.hasMoreTokens()) {

            String word = ayye.nextToken();

            for (int i = 0; i < word.length(); i++) {

                int previousIndex = alphabet.indexOf(word.substring(i, i + 1));
                int newIndexForEncryption = previousIndex + userChosenRotation;

                if (newIndexForEncryption >= 26) {
                    newIndexForEncryption = (newIndexForEncryption - previousIndex) - (25 - previousIndex);
                }

                encryption = encryption + alphabet.get(newIndexForEncryption);
            }
            encryption = encryption + " ";
        }

        System.out.println("Your Encrypted message is: " + encryption);

    }

    public static int userRotationNumber() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your rotation choice:");
        userChosenRotation = input.nextInt();

        return userChosenRotation;
    }

    public static String userMessageToEncrypt() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the message you want to encrypt:");
        userChosenPhrase = input.nextLine();

        return userChosenPhrase;
    }
}
