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

    static int multiplyer = 0;
    static String initial = "";
    static int count = 0;

    static double ohm = 0;

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        String colours = input.nextLine();

        StringTokenizer numbers = new StringTokenizer(colours, "-");

        while (count < 2) {
            System.out.println(initial);
            coloursToNumbers(initial, numbers, multiplyer);
            count++;

        }
//        multiplyer = 0;
//        coloursToNumbers(initial, numbers, multiplyer);
//
//        ohm = Integer.parseInt(initial) * (Math.pow(10, multiplyer));
        System.out.println(initial);
    }

    public static String coloursToNumbers(String initial, StringTokenizer numbers, int multiplyer) {

        switch (numbers.nextToken()) {
            case "BLACK":
                initial = initial + "0";
                multiplyer = 0;
                break;
            case "BROWN":
                initial = initial + "1";
                multiplyer = 1;
                break;
            case "RED":
                initial = initial + "2";
                multiplyer = 2;
                break;
            case "ORANGE":
                initial = initial + "3";
                multiplyer = 3;
                break;
            case "YELLOW":
                initial = initial + "4";
                multiplyer = 4;
                break;
            case "GREEN":
                initial = initial + "5";
                multiplyer = 5;
                break;
            case "BLUE":
                initial = initial + "6";
                multiplyer = 6;
                break;
            case "VIOLET":
                initial = initial + "7";
                multiplyer = 7;
                break;
            case "GREY":
                initial = initial + "8";
                multiplyer = 8;
                break;
            case "WHITE":
                initial = initial + "9";
                multiplyer = 9;
                break;

        }

        return initial;
    }
}
