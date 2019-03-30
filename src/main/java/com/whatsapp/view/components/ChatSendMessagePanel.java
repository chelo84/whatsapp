package com.whatsapp.view.components;

import com.whatsapp.util.IconUtil;
import jiconfont.icons.font_awesome.FontAwesome;
import lombok.Getter;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

@Getter
public class ChatSendMessagePanel extends WhitePanel {

    private JPanel emoji;
    private JTextField sendMessage;
    private JPanel voice;

    public ChatSendMessagePanel() {
        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(0, 40));

        this.emoji = new WhitePanel();
        this.emoji.setBorder(new EmptyBorder(0,5,0,5));
        this.sendMessage = new JTextField();
        this.voice = new WhitePanel();
        this.voice.setBorder(new EmptyBorder(0,5,0,5));

        this.emoji.add(new JLabel(IconUtil.getIcon(FontAwesome.SMILE_O, 22, Color.GRAY)));
        this.voice.add(new JLabel(IconUtil.getIcon(FontAwesome.MICROPHONE, 22, Color.GRAY)));

        this.add(emoji, BorderLayout.WEST);
        this.add(sendMessage, BorderLayout.CENTER);
        this.add(voice, BorderLayout.EAST);
    }
}
