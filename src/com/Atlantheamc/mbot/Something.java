package com.Atlantheamc.mbot;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Something {
    static void Something(){
        LocalDate Total;
        int x = 0;
        int Month;
        int Year;
        int Day;
        int YearDays = 365;
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
                Period Differnt = Period.between(Total, now);
                System.out.println("You where born on " + Total + " so You are " + Differnt.getYears() + " Years Old Or " + Differnt.getMonths() + " Months old Or " + Differnt.getDays() + "Days Old");
                x = x + 1;
                System.out.println(Differnt);
            } catch (Exception e) {
                System.out.println("Type right day just think Your month is " + MonthsName[Month]);
                Day = Iscaner.nextInt();
                Total = LocalDate.of(Year, Month, Day);
                Period Differnt = Period.between(Total, now);
                System.out.println("You where born on " + Total + " so You are " + Differnt.getYears() + " years old " + Differnt.getMonths() "month"  + Differnt.getDays());
                x = x + 1;
                System.out.println(Differnt);
            }

        }

    }
}
