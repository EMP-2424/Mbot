package com.xrambad.mbot;

import java.util.Random;
import java.util.Scanner;

public class oldMbot {

    public static void oldMbot() {
        long x;
        Scanner Iscaner = new Scanner(System.in);
        System.out.println("[mbot]ofc nova will die hah");
        System.out.println("[mbot]okay.");
        System.out.println("[mbot]What's you name? in mc ofc"); //1
        String McName = Iscaner.nextLine();
        System.out.println("[mbot]What is fav minecraft item?");//2
        String Mcitem = Iscaner.nextLine();
        System.out.println("[mbot] Your name is " + McName);//3
        System.out.println("[mbot] your fav item is " + Mcitem);//4
        System.out.println("[mbot] Great. YOUR PC HAS BEEN HACKED bruh jk lol");//5
        System.out.println("[Mbot] should i spam your pc? say true or if you dont want to say false // Warning this might lag the pc");
        String tnt = Iscaner.nextLine();
        System.out.println(tnt);
        Random rand = new Random();
        while(!tnt.equals("true")) {
            if (tnt.equals("false")){
                //System.exit(0);
                break;
            }
            System.out.println("[mbot] Nope thats not a boolean! try again. ps: use false or true");
            tnt = Iscaner.nextLine();

        }
        while(tnt.equals("true")){//
            x = rand.nextInt(394889898);
            System.out.println(x);


        }
    }
}
