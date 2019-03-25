package com.whatsapp.view;

import com.whatsapp.view.components.UserPanel;

import javax.swing.*;
import java.awt.*;


public class Whatsapp extends JFrame {

    public Whatsapp() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.paintComponents(this.getContentPane());

        this.pack();
        this.setVisible(true);
    }

    public void paintComponents(Container container) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JPanel userList = new JPanel();
        userList.setLayout(new BoxLayout(userList, BoxLayout.Y_AXIS));

        JPanel userPanel = new UserPanel();
        userPanel.setLayout(new BorderLayout());
        userPanel.setAvatar()
        userPanel.add()
        userList.add()
    }
}
