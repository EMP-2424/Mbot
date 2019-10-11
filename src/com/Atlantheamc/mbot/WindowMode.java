package com.Atlantheamc.mbot;

import javax.swing.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class WindowMode {
    public static void main(){
        JFrame Window = new JFrame();
        Window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Window.setVisible(true);
        Window.setLayout(null);
        Window.setResizable(false);
        Window.setSize(700, 610);
        Window.setLocationRelativeTo(null);
        Window.setTitle("MBOT 1.0.2-beta4");
    }
}
