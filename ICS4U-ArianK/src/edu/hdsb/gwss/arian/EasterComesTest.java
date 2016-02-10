package edu.hdsb.gwss.arian;

/* Name: EasterComes
 * Version: v1
 * Date: February 10 2016
 * Author: Arian Krasniqi
 */
public class EasterComesTest {

    public static void main(String[] args) {

        int year = 2014;

        int a = year % 19;

        int b = year / 100;
        int c = year % 100;

        int d = b / 4;
        int e = b % 4;

        int f = (b + 8) / 25;

        int g = (b - f + 1) / 3;

        int h = (19 * a + b - d - g + 15) % 30;

        int i = c / 4;
        int k = c % 4;

        int j = (32 + 2 * e + 2 * i - h - k) % 7;

        int m = (a + 11 * h + 22 * j) / 451;

        int month = (h + j - 7 * m + 114) / 31;
        int p = (h + j - 7 * m + 114) % 31;

        int day = p + 1;

        if (month == 4) {
            System.out.println("April, " + day);
        }

        if (month == 3) {
            System.out.println("April, " + day);
        }
    }

}
