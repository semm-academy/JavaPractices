package com.aktepe.mucahit;


import java.io.PrintStream;
import java.time.LocalDate;

public class JavaDateAndTime {
    /*

     */

    public static void main(String[] args) {

       // LocalDate today = LocalDate.now(); System.out.println("Today's Local date : " + today);

        LocalDate today = LocalDate.now();
        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        final PrintStream printf = System.out.printf("Year : 1976 Month : 10 day : 10 \t %n", year, month, day);


    }
}
