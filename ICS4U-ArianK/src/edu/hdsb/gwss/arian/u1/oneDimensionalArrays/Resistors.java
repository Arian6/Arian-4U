/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u1.oneDimensionalArrays;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author ARIAN
 */
public class Resistors {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int multiplyer = 0;
        String initial = "";
        int count = 0;
        int ohm = 0;

        System.out.println("This program will calculate the resistance value within a resistor");
        System.out.println("by having the user enter the three colour bands seperated by a hyphen");
        System.out.println("");
        System.out.println("E.g Red-Brown-Orange");
        System.out.println("Enter the colours on your resisitor:");

        String colours = input.nextLine();
        System.out.println("");

        StringTokenizer numbers = new StringTokenizer(colours.toUpperCase(), "-");

        while (count < 3) {

            switch (numbers.nextToken()) {
                case "BLACK":
                    initial = initial + "0";

                    break;
                case "BROWN":
                    initial = initial + "1";

                    break;
                case "RED":
                    initial = initial + "2";

                    break;
                case "ORANGE":
                    initial = initial + "3";

                    break;
                case "YELLOW":
                    initial = initial + "4";

                    break;
                case "GREEN":
                    initial = initial + "5";

                    break;
                case "BLUE":
                    initial = initial + "6";

                    break;
                case "VIOLET":
                    initial = initial + "7";

                    break;
                case "GREY":
                    initial = initial + "8";

                    break;
                case "WHITE":
                    initial = initial + "9";

                    break;

            }
            count++;

        }

        int x = Integer.parseInt(initial.substring(2));

        ohm = Integer.parseInt(initial.substring(0, 2)) * (int) (Math.pow(10, x));

        System.out.println("The resistance value is:  " + ohm + " ohms.");
    }

}
