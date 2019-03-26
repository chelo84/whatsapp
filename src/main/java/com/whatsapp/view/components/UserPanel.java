package com.whatsapp.view.components;

import lombok.Getter;

import javax.swing.*;
import java.awt.*;

@Getter
public class UserPanel extends JPanel {

    private Image avatar;
    private String phoneNumber;
    private String nickname;

    public UserPanel() {
        this.setLayout(new BorderLayout());
    }

    public void setAvatar(Image avatar) {
//        this.add(new Image(avatar));
        this.avatar = avatar;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.add(new JLabel(phoneNumber), BorderLayout.NORTH);
        this.phoneNumber = phoneNumber;
    }

    public void setNickname(String nickname) {
        this.add(new JLabel(nickname), BorderLayout.SOUTH);
        this.nickname = nickname;
    }

}
