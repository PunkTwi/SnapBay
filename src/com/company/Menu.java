package com.company;

import javax.swing.*;
import java.awt.*;

public class Menu {

    public void Window() {

        JFrame frame = new JFrame("SnapBay");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("Welcome to SnapBay! \n The Easy to Use miniature app drawer!");
        JButton myHome = new JButton();
        JButton recents = new JButton();
        JButton Settings = new JButton();
        myHome.setText("My Home");
        recents.setText("Recently Used");
        Settings.setText("Settings");
        panel.add(label);
        panel.add(myHome);
        panel.add(recents);
        panel.add(Settings);
        frame.add(panel);
        frame.setSize(600, 700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}