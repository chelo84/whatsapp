package com.whatsapp.view.components;

import lombok.AccessLevel;
import lombok.Getter;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

@Getter
public class ChatUserInfoPanel extends WhitePanel {

    @Getter(AccessLevel.NONE)
    private JPanel avatarPanel;
    @Getter(AccessLevel.NONE)
    private JPanel buttonPanel;

    private Image avatar;
    private String nickname;

    public ChatUserInfoPanel() {
        this.setLayout(new BorderLayout());
        this.avatarPanel = new WhitePanel(new FlowLayout());
        this.buttonPanel = new WhitePanel();
        this.add(this.avatarPanel, BorderLayout.WEST);
        this.add(this.buttonPanel, BorderLayout.CENTER);
        this.add(new JPanel(), BorderLayout.SOUTH);
    }

    public void setAvatarAndNickname(BufferedImage avatar, String nickname) {
        this.avatarPanel.add(new JLabel(new ImageIcon(avatar)));
        this.avatarPanel.add(new JLabel(nickname));

        this.avatar = avatar;
        this.nickname = nickname;
    }
}

