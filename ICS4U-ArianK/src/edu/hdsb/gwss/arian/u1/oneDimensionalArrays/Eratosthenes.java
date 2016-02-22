/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u1.oneDimensionalArrays;

/**
 *
 * @author 1krasniqiari
 */
public class Eratosthenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        boolean numbers[] = new boolean[1000];
        int count = 0;

        for (int k = 2; k < numbers.length - 1; k++) {
            numbers[k] = true;
        }

        for (int i = 2; i < 1000; i++) {

            if (numbers[i] == true) {
                for (int j = 2; j <= 1000; j++) {
                    int math = i * j;

                    if (math < 999) {
                        numbers[math] = false;
                    } else {
                        break;
                    }

                }
            }

        }

        System.out.print("The prime numbers from 1 - 1000 are:");
        System.out.println("");

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == true) {

                if (count < 10) {
                    System.out.print(i + " ,");
                    count++;
                } else {
                    System.out.println(i);
                    count = 0;
                }

            }

        }

    }
}
