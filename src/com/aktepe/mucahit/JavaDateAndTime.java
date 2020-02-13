package com.aktepe.mucahit;


import java.io.PrintStream;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class JavaDateAndTime {
    /*

     */

    public static void main(String[] args) {

       // LocalDate today = LocalDate.now(); System.out.println("Today's Local date : " + today);

      //  LocalDate today = LocalDate.now();

       // int year = today.getYear();
       // int month = today.getMonthValue();
       // int day = today.getDayOfMonth();
        //System.out.println(today.getDayOfWeek());
       // final PrintStream printf = System.out.printf("Year : 1976 Month : 06 day : 24 \t %n", year, month, day);

       // LocalDate today = LocalDate.now();                          //Today's date
        LocalDate birthday = LocalDate.of(1976, Month.JUNE, 24);  //Birth date

        //Period p = Period.between(birthday,);
//Now access the values as below
       // System.out.println(period.getDays());
       // System.out.println(period.getMonths());
      //  System.out.println(period.getYears());

        System.out.println(birthday.getDayOfWeek());

    }
}
