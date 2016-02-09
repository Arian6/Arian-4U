/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian;

/**
 *
 * @author ARIAN
 */
public class EasterComes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int year = 2015;
        double temp = (double) year / 19;
        int temp2 =  year / 19;
        double a = temp - temp2;
        
        double b = (double) year / 100;
        int b2 = year/100;
        double c = b - b2;
        
        double d = (double) b / 4;
        int d2 = (int) b / 4;
        double e = (double) d - d2;
        
        double f = (double) (b+8) / 25;
        double g = (double) (b-f + 1) / 3;
        
        double h1 = (double) (19 * a + b - d - g + 15) / 30;
        int h2 = (int) (19 * a + b - d - g + 15) / 30;
        double h = (double) h1 - h2;
        
        double i = (double) c / 4;
        int i2 = (int) c / 4;
        double k = (double) i - i2;
        
        double j1 = (double) (32 + 2*e + 2*i - h - k) / 7;
        int j2 = (int) (32 + 2*e + 2*i - h - k) / 7;
        double j = (double) j1-j2;
        
        double m = (double) (a + 11*h + 22*j) / 451;
        
        double month = (double) (h + j - 7*m + 114) /31;
        int month2 = (int) (h + j - 7*m + 114) /31;
        double p = (double) month - month2;
        
        int day = (int) p + 1;
        
        
        System.out.println(month + "  " + p);

    }

}
