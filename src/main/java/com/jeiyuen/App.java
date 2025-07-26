package com.jeiyuen;

import javax.swing.JFrame;

public class App {
    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("My First 2D Game");

        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
