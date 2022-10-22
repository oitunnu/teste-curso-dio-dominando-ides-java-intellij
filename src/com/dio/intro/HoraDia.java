package com.dio.intro;
//import needed function
import java.time.LocalTime;

public class HoraDia {
    public static void main(String[] args) {
        //get the local time
        LocalTime now = LocalTime.now();

        //create time period to compare
        LocalTime timeD = LocalTime.parse("05:00");
        LocalTime timeT = LocalTime.parse("12:00");
        LocalTime timeN = LocalTime.parse("18:00");

        //compare local time to see if it is day, afternoon or night and print greeting
        if (now.isAfter(timeD) && now.isBefore(timeT)) {
            System.out.println("Bom dia!");
        } else if (now.isAfter(timeT) && now.isBefore(timeN)) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }

    }
}
