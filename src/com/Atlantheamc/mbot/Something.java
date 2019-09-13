package com.Atlantheamc.mbot;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Something {
    static void Something(){
        LocalDate Total;
        int x = 0;
        int Month;
        int Year;
        int Day;
        String[] MonthsName = {"nothing here lol","January","February","March","April","May","June","July","August","September","October","November","December"};
        LocalDate now = LocalDate.now();
        //-----------------------------\\
        System.out.println("[Mbot] Welcome to simple clac of how many days since your bday " + now );
        Scanner Iscaner = new Scanner(System.in);
        System.out.println("First type your month in numbers like 9 or 12");
        Month = Iscaner.nextInt();
        //-----------------------------\\
        while (Month < 0 || Month > 12){
            System.out.println("Wrong usage Month number can't be less than 0 or higher than 12");
            Month = Iscaner.nextInt();
        }
        //-----------------------------\\
        System.out.println("now type your Year");
        Year = Iscaner.nextInt();
        while (Year > now.getYear()) {
            System.out.println("Wrong usage year number can't be set higher than " + now.getYear());
            Year = Iscaner.nextInt();
        }
        //-----------------------------\\
        System.out.println("now type your Day aka 31 12 something like but it depends on month");
        Day = Iscaner.nextInt();
        while (x < 1) {
            try {
                Total = LocalDate.of(Year, Month, Day);
                System.out.println("You where born on " + Total + " so You are " + ChronoUnit.YEARS.between(Total, now) + " years old or " + ChronoUnit.MONTHS.between(Total, now) + "month old OR "  + ChronoUnit.DAYS.between(Total, now));
                x = x + 1;
            } catch (Exception e) {
                System.out.println("Type right day just think Your month is " + MonthsName[Month]);
                Day = Iscaner.nextInt();
                Total = LocalDate.of(Year, Month, Day);
                System.out.println("You where born on " + Total + " so You are " + ChronoUnit.YEARS.between(Total, now) + " years old or " + ChronoUnit.MONTHS.between(Total, now) + "month old OR "  + ChronoUnit.DAYS.between(Total, now));
                x = x + 1;
            }

        }

    }
}
