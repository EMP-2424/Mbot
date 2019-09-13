package com.Atlantheamc.mbot;

import java.time.LocalDate;
import java.util.Scanner;

public class Something {
    static void Something(){
        int Month;
        int Year;
        int Day;
        String[] MonthsName = {"","January","February","March","April","May","June","July","August","September","October","November","December"};
        LocalDate now = LocalDate.now();
        System.out.println("[Mbot] Welcome to simple clac of how many days since your bday " + now );
        Scanner Iscaner = new Scanner(System.in);
        System.out.println("First type your month in numbers like 9 or 12");
        Month = Iscaner.nextInt();
        do {
            System.out.println("Wrong usage Month number can't be less than 0 or higher than 12");
            Month = Iscaner.nextInt();
        }while (Month < 0 && Month > 12);
        System.out.println("now type your Year");
        Year = Iscaner.nextInt();
        do {
            System.out.println("Wrong usage year number can't be set higher than " + now.getYear());
            Year = Iscaner.nextInt();
        }while (Year > now.getYear());
        // still under building.




    }
}
