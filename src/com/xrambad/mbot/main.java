package com.xrambad.mbot;

import java.util.Scanner;

public class main {
    static void Command(){
        String command;
        Scanner Iscaner = new Scanner(System.in);
        command = Iscaner.nextLine();
        while (!command.equals("help") && !command.equals("old") && !command.equals("stop")) {
            System.out.println("[Mbot] unknown command");
            command = Iscaner.nextLine();
        }
        if (command.equals("stop")){
            System.out.println("Exiting mbot");
            try {
                Thread.sleep(4000);
                System.exit(0);
            }catch(InterruptedException e) {
                Thread.currentThread().interrupt();

            }
        }
        if (command.equals("old")){
            oldMbot Mbot = new oldMbot();
            Mbot.oldMbot();
            System.out.println("[Mbot] Welcome back to command line.");
        }
        if (command.equals("help")){
            System.out.println("[Mbot] Commands");
            System.out.println("[Mbot] 'stop' it does stop me ");
            System.out.println("[Mbot] 'help' this menu lol");
            System.out.println("[Mbot] 'old' runs first release of mbot stupid class aka [mbot]ofc nova will die hah");

        }
    }
    public static void main(String[] args){
        int x = 0;
        System.out.println("loading mbot 1.0.1");
        try {
            Thread.sleep(8000);
        } catch(InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        while (x < 100) { //some fancy stuff to make user fell mbot is advanced bth he is advanced in the server "aka skript version of mbot"
            x = x + 1;
            System.out.println(x + "%");
            try {
                Thread.sleep(1);
            } catch(InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        int i = 1;
        System.out.println("Welcome there!");
        System.out.println("[Mbot] to Know and use my commands! type 'help' for more info");
        do{
            Command();

        }while(true);


    }
}