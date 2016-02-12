/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian;

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
        Scanner input = new Scanner(System.in);

        String lol = "niggers";

        String conversion = lol.toLowerCase();
        boolean check = false;
        int count = 1;

        for (int lol2 = 0; lol2 < conversion.length(); lol2++) {

            if (conversion.substring(lol2, lol2 + 1).equals(conversion.substring(conversion.length() - count, conversion.length() - count + 1))) {
                System.out.println("yes");
                
            } else {
                System.out.println("no");
            }

            count++;

        }
       
    }

}
