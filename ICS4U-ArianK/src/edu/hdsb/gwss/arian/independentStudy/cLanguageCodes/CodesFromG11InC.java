/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.independentStudy.cLanguageCodes;

/**
 *
 * @author ARIAN
 */
public class CodesFromG11InC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //        IF STRUCTURES
        //        PH LEVEL
        //#include<stdio.h>
        //#include<stdlib.h>
        //
        //        int main
        //        
        //            ( )
        //{
        //    //Variable
        //    double phLevel;
        //
        //            //Provides description of program
        //            printf("Acid Rain");
        //            printf("\n");
        //            printf("\n");
        //            printf("This program determines whether the pH level of the body of water is too acidic, alkaline or just right for sea life.");
        //            printf("\n");
        //            printf("\n");
        //
        //            //User inputs data
        //            printf("Please enter the pH level:");
        //            scanf("%lf",  & phLevel);
        //
        //            //Determines water purity
        //            if (phLevel > 7.5 && phLevel < 15) {
        //                printf("TOO ALKALINE - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
        //            } else if (phLevel >= 6.5 && phLevel <= 7.5) {
        //                printf("NEUTRAL - FISH IN STREAMS, RIVERS AND LAKES WILL SURVIVE.");
        //            } else if (phLevel > -1 && phLevel < 6.5) {
        //                printf("TOO ACIDIC - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
        //            } else {
        //                printf("INVALID PH LEVEL");
        //            }
        //            return 0;
        //        }
        //        LOOPS - FIBONACCI SEQUENCE
        //#include<stdio.h>
        //#include<stdlib.h>
        //
        //        int main
        //        
        //            ()
        //{
        //    int n = 20, first = 0, second = 1, next = first + second, a = 0;
        //
        //            printf("First 20 terms of Fibonacci series are :");
        //
        //            while (a < n) {
        //
        //                printf("%d\n", first);
        //                next = first + second;
        //                first = second;
        //                second = next;
        //                a++;
        //            }
        //
        //            return 0;
        //
        //        }

        //METHODS - NUMBERS TO WORDS
        //        #include<stdio.h>
        //#include<stdlib.h>
        //#include<string.h> //GLOBAL VARIABLES
        //
        //        int number;
        //        char strNumber[];
        //        char tenString[];
        //        char oneString[];
        //
        //        int main
        //        
        //            ()
        //{
        //    //DESCRIPTION OF PROGRAM
        //    printf("Numbers To Words");
        //            printf("\n");
        //            printf("\n");
        //            printf("This program will write out any number from 10-99");
        //            printf("\n");
        //            printf("\n");
        //
        //            //USER INPUT
        //            printf("Please enter a 2 digit number: ");
        //            scanf("%d",  & number);
        //            printf("\n");
        //
        //            if (number > 9 & number < 20) {
        //                teens();
        //                printf(strNumber);
        //            } else if (number > 19 & number < 100) {
        //                printf("%s %s ", tens(), ones());
        //            } else {
        //                printf("Invalid");
        //            }
        //            return 0;
        //        }
        //
        //        ones(void)
        //        {
        //            sprintf(strNumber, "%d", number);
        //
        //            switch (strNumber[1]) {
        //                case '1':
        //                    return "One";
        //                case '2':
        //                    return "Two";
        //                case '3':
        //                    return "Three";
        //                case '4':
        //                    return "Four";
        //                case '5':
        //                    return "Five";
        //                case '6':
        //                    return "Six";
        //                case '7':
        //                    return "Seven";
        //                case '8':
        //                    return "Eight";
        //                case '9':
        //                    return "Nine";
        //            }
        //        }
        //
        //        tens(void)
        //        {
        //            sprintf(strNumber, "%d", number);
        //
        //            switch (strNumber[0]) {
        //                case '2':
        //                    return "Twenty";
        //                case '3':
        //                    return "Thirty";
        //                case '4':
        //                    return "Forty";
        //                case '5':
        //                    return "Fifty";
        //                case '6':
        //                    return "Sixty";
        //                case '7':
        //                    return "Seventy";
        //                case '8':
        //                    return "Eighty";
        //                case '9':
        //                    return "Ninety";
        //            }
        //        }
        //
        //        teens(void)
        //        {
        //            sprintf(strNumber, "%d", number);
        //
        //            switch (strNumber[1]) {
        //                case '0':
        //                    return "Ten";
        //                case '1':
        //                    strcpy(strNumber, "Eleven");
        //                    break;
        //                case '2':
        //                    strcpy(strNumber, "Twelve");
        //                    break;
        //                case '3':
        //                    strcpy(strNumber, "Thirteen");
        //                    break;
        //                case '4':
        //                    strcpy(strNumber, "Fourteen");
        //                    break;
        //                case '5':
        //                    strcpy(strNumber, "Fifteen");
        //                    break;
        //                case '6':
        //                    strcpy(strNumber, "Sixteen");
        //                    break;
        //                case '7':
        //                    strcpy(strNumber, "Seventeen");
        //                    break;
        //                case '8':
        //                    strcpy(strNumber, "Eighteen");
        //                    break;
        //                case '9':
        //                    strcpy(strNumber, "Nineteen");
        //                    break;
        //            }
        //        }

        //ARRAYS - TEMPERATURE
//
//        #include<stdio.h>
//#include<stdlib.h>
//
//        int main
//        
//            ()
//{
//    int t[
//            7];
//
//
//    printf("Enter the temperature HIGH on Monday: ");
//            scanf("%df",  & t[0]);
//            printf("Enter the temperature HIGH on Tuesday: ");
//            scanf("%df",  & t[1]);
//            printf("Enter the temperature HIGHon Wednesday: ");
//            scanf("%df",  & t[2]);
//            printf("Enter the temperature HIGH on Thursday: ");
//            scanf("%df",  & t[3]);
//            printf("Enter the temperature HIGH on Friday: ");
//            scanf("%df",  & t[4]);
//            printf("Enter the temperature HIGH on Saturday: ");
//            scanf("%df",  & t[5]);
//            printf("Enter the temperature HIGH on Sunday: ");
//            scanf("%df",  & t[6]);
//
//            printf("Monday:");
//            printf("%d\n", t[0]);
//            printf("Tuesday:");
//            printf("%d\n", t[1]);
//            printf("Wednesday:");
//            printf("%d\n", t[2]);
//            printf("Thursday:");
//            printf("%d\n", t[3]);
//            printf("Friday:");
//            printf("%d\n", t[4]);
//            printf("Saturday:");
//            printf("%d\n", t[5]);
//            printf("Sunday:");
//            printf("%d\n", t[6]);
//
//            int max = 0;
//            int c = 0;
//
//            for (c; c < 7; c++) {
//
//                if (t[c] > max) {
//                    max = t[c];
//                }
//
//            }
//
//            int min = max;
//            int i = 0;
//
//            for (i; i < 7; i++) {
//
//                if (t[i] < min) {
//                    min = t[i];
//                }
//
//            }
//
//            double average = (t[0] + t[1] + t[2] + t[3] + t[4] + t[5] + t[6]) / 7;
//
//            printf("Highest Temperature of the week: ");
//            printf("%d\n", max);
//
//            printf("Lowest Temperature of the week: ");
//            printf("%d\n", min);
//
//            printf("Average Temperature of the week: ");
//            printf(" %3.2f\n", average);
//
//        }
//
    }

}
