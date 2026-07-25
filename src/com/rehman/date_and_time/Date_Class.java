package com.rehman.date_and_time;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Date_Class {

    public static void main(String[] args) {

//        1
//        Date

        LocalDate date = LocalDate.now();

        System.out.println("Today is = " + date);

//        2
//        Custom Date

        LocalDate birthday = LocalDate.of(2002, Month.SEPTEMBER, 30);

        System.out.println("My birthday is on = "+birthday);

//        3
//        Formatted date

        DateTimeFormatter customDateFormat = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        String formattedDate = date.format(customDateFormat);
        System.out.println("Formatted Today date in dd-MM-yyyy = " + formattedDate);




    }
}
