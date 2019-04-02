package com.whatsapp.view.components;

import lombok.AccessLevel;
import lombok.Getter;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.nio.Buffer;

@Getter
public class UserPanel extends WhitePanel {

    @Getter(AccessLevel.NONE)
    private JPanel avatarPanel;
    @Getter(AccessLevel.NONE)
    private JPanel infoPanel;
    @Getter(AccessLevel.NONE)
    private JPanel timePanel;

    private Image avatar;
    private String nickname;
    private String lastMessage;
    private String messageTime;

    public UserPanel() {
        this.setLayout(new BorderLayout());
        this.avatarPanel = new WhitePanel();
        this.infoPanel = new WhitePanel();
        this.timePanel = new WhitePanel();

        infoPanel.setBorder(new EmptyBorder(10,0,0,0));
        BoxLayout bl = new BoxLayout(infoPanel, BoxLayout.Y_AXIS);
        infoPanel.setLayout(bl);
        this.add(avatarPanel, BorderLayout.WEST);
        this.add(infoPanel, BorderLayout.CENTER);
        this.add(timePanel, BorderLayout.EAST);
        this.add(new JPanel(), BorderLayout.SOUTH);
    }

    public void setAvatar(BufferedImage avatar) {
        this.avatarPanel.add(new JLabel(new ImageIcon(avatar)));
        this.avatar = avatar;
    }

    public void setNickname(String nickname) {
        this.infoPanel.add(new JLabel(nickname));
        this.nickname = nickname;
    }

    public void setLastMessage(String message) {
        this.infoPanel.add(new ThickLabel(message));
        this.lastMessage = message;
    }

    public void setMessageTime(String messageTime) {
        JLabel label = new JLabel(messageTime);
        label.setFont(new Font("Serif", Font.PLAIN, 11));
        this.timePanel.add(label);
        this.messageTime = messageTime;
    }

}
