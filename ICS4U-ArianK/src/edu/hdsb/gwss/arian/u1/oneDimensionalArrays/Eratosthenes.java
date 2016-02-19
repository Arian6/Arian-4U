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
        String outcome = "";
        int count = 0;
        int x = 0;

        for (int k = 0; k < numbers.length - 1; k++) {
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

        for (int l = 0; l < numbers.length - 1; l++) {
            if (numbers[l] == true) {
                System.out.println(l);
            }

        }

    }
}
