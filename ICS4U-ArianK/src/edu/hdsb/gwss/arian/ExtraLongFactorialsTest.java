/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author ARIAN
 */
public class ExtraLongFactorialsTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BigInteger a = new BigInteger("9223372036854775807");
        
        Scanner input = new Scanner(System.in);
        
        int number = 78;
        int[] ayye = new int[78];
        int factorial = 1;

        for (int i = 0; i < number; i++) {

            ayye[i] = number - i;
            factorial = factorial * ayye[i];

        }

        System.out.println(factorial);
    }
}
