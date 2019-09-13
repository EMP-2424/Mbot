package com.xrambad;

import javax.swing.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class WindowModeTest{
    public static void main(String[] args){
        JFrame Window = new JFrame();
        //----------------------------------------------\\\\window stuff
        Window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Window.setVisible(true);
        Window.setLayout(null);
        Window.setResizable(false);
        Window.setSize(700, 610);
        Window.setLocationRelativeTo(null);
        Window.setTitle("MBOT 1.0.2");

    }
}
