package com.rehman.date_and_time;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Time_Class {

    public static void main(String[] args) {

//        1
//        Time

        LocalTime time = LocalTime.now();

        System.out.println("Time is = " + time);

//        2
//        With Timezone

        LocalTime timezone = LocalTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println("Time in Tokyo = " + timezone);


//        3
//        Both Date And Time

        LocalDateTime date_time = LocalDateTime.now();

        System.out.println("Both Date And Time = " + date_time);


//        Custom Time Format
//        HH --> time in 24 hours
//        hh --> time in 12 hours

        DateTimeFormatter customTimeFormat = DateTimeFormatter.ofPattern("hh : mm : ss : ms a");
        String formattedTime = time.format(customTimeFormat);

        System.out.println("Custom time format = " + formattedTime);


//        All timezones
//        for (String s : ZoneId.getAvailableZoneIds()) {
//            System.out.println(s);
//        }


    }
}
