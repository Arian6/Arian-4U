/* Name: SimpleEncryption
 * Version: v3
 * Date: Feb 14 2015
 * Author: Arian Krasniqi
 */
package edu.hdsb.gwss.arian.u1.stringDataTypes;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SimpleEncryption {

    static String userChosenPhrase = "";
    static String encryption = "";
    static String decryption = "";
    static int userChosenRotation;
    static ArrayList<String> alphabet;

    public static void main(String[] args) {

        alphabet.add("A");
        alphabet.add("B");
        alphabet.add("C");
        alphabet.add("D");
        alphabet.add("E");
        alphabet.add("F");
        alphabet.add("G");
        alphabet.add("H");
        alphabet.add("I");
        alphabet.add("J");
        alphabet.add("K");
        alphabet.add("L");
        alphabet.add("M");
        alphabet.add("N");
        alphabet.add("O");
        alphabet.add("P");
        alphabet.add("Q");
        alphabet.add("R");
        alphabet.add("S");
        alphabet.add("T");
        alphabet.add("U");
        alphabet.add("V");
        alphabet.add("W");
        alphabet.add("X");
        alphabet.add("Y");
        alphabet.add("Z");

        int decryptOrEncrypt;
        Scanner input = new Scanner(System.in);

        System.out.println("Encrypt / Decrypt a message!");
        System.out.println("");

        System.out.println("This program will allow the user to encrypt a message by rotation letters through the alphabet");
        System.out.println("a certain nnumber of times (BETWEEN 1 - 25) chosen by the user");
        System.out.println("E.g = If the user chooses 2, every A in the sentance becomes a C etc...");
        System.out.println("This program will also allow you to ecrypt a message, by knowing the rotation an decyphering it");
        System.out.println("");
        System.out.println("Press 1 tp ENCRYPT a message, Press 2 to DECRYPT a message");
        decryptOrEncrypt = input.nextInt();

        if (decryptOrEncrypt == 1) {
            userRotationNumber();
            if (userChosenRotation < 1 || userChosenRotation > 25) {

                System.err.println("Invalid Rotation amount!");
            } else if (userChosenRotation == 0) {
                System.err.println("The letters wont change if rotated 0 times!");
            } else {
                userMessageToDecypherOrEncrypt();
                encryptingAMessage();
            }

        } else if (decryptOrEncrypt == 2) {
            userRotationNumber();

            if (userChosenRotation < 1 || userChosenRotation > 25) {

                System.err.println("Invalid Rotation amount!");
            } else if (userChosenRotation == 0) {
                System.err.println("The letters wont change if rotated 0 times!");
            } else {

                userMessageToDecypherOrEncrypt();
                decryptingAMessage();
            }

        } else {
            System.err.println("Not an Option!");
        }
    }

    public static int userRotationNumber() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your rotation choice:");
        userChosenRotation = input.nextInt();

        return userChosenRotation;
    }

    public static String userMessageToDecypherOrEncrypt() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the message you want to decrypt:");
        userChosenPhrase = input.nextLine();

        return userChosenPhrase;

    }

    public static void encryptingAMessage() {

        String conversion = userChosenPhrase;

        String allToUpperCase = conversion.toUpperCase();

        StringTokenizer ayye = new StringTokenizer(allToUpperCase, " ");

        while (ayye.hasMoreTokens()) {

            String word = ayye.nextToken();

            for (int i = 0; i < word.length(); i++) {

                int previousIndex = alphabet.indexOf(word.substring(i, i + 1));
                int newIndexForEncryption = previousIndex + userChosenRotation;

                if (newIndexForEncryption >= 26) {
                    newIndexForEncryption = (newIndexForEncryption - previousIndex) - (26 - previousIndex);
                }

                encryption = encryption + alphabet.get(newIndexForEncryption);
            }
            encryption = encryption + " ";
        }

        System.out.println("The original message was: " + userChosenPhrase);
        System.out.println("Your Encrypted message is: " + encryption);

    }

    public static void decryptingAMessage() {

        String conversion = userChosenPhrase;

        String allToUpperCase = conversion.toUpperCase();

        StringTokenizer ayye = new StringTokenizer(allToUpperCase, " ");

        while (ayye.hasMoreTokens()) {

            String word = ayye.nextToken();

            for (int i = 0; i < word.length(); i++) {

                int previousIndex = alphabet.indexOf(word.substring(i, i + 1));
                int newIndexForEncryption = previousIndex - userChosenRotation;

                if (newIndexForEncryption < 0) {
                    newIndexForEncryption = 26 + newIndexForEncryption;
                }

                decryption = decryption + alphabet.get(newIndexForEncryption);
            }
            decryption = decryption + " ";
        }

        System.out.println("The encrypted message was: " + userChosenPhrase);
        System.out.println("The True message is: " + decryption);

    }
}
