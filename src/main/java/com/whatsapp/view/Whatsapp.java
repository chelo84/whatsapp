package com.whatsapp.view;

import com.whatsapp.util.IconUtil;
import com.whatsapp.view.components.*;
import jiconfont.IconFont;
import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;


public class Whatsapp extends JFrame {
    Dimension userListSize = new Dimension(180, 75);
    public Whatsapp() throws Exception {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(850, 850));
        this.paintComponents(this.getContentPane());
        this.setIconImage(ImageIO.read(new File("imagem.jpeg")));

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void paintComponents(Container container) throws Exception {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JPanel userList = new JPanel();
        userList.setPreferredSize(userListSize);
        userList.setLayout(new BoxLayout(userList, BoxLayout.Y_AXIS));
        BufferedImage avatarImage = ImageIO.read(new File("default-user.png"));

        JPanel userInfoPanel = new WhitePanel(new BorderLayout());
        userInfoPanel.setPreferredSize(userListSize);
        userInfoPanel.add(new JLabel(new ImageIcon(avatarImage)), BorderLayout.WEST);

        JLabel nameLabel = new JLabel("Meu usuário");
        nameLabel.setBorder(new EmptyBorder(0,5,0,0));
        userInfoPanel.add(nameLabel, BorderLayout.CENTER);

        JTextField searchField = new JTextField();
        IconFontSwing.register(FontAwesome.getIconFont());
        Icon icon = IconUtil.getIcon(FontAwesome.SEARCH, 15, Color.GRAY);
        searchField.add(new JLabel(icon), BorderLayout.WEST);
        userInfoPanel.add(searchField, BorderLayout.SOUTH);
        userList.add(userInfoPanel);

        for(int i = 0; i < 10; i++) {
            UserPanel userPanel = new UserPanel();
            userPanel.setAvatar(avatarImage);
            userPanel.setNickname(String.format("Usuário %d", i));
            userPanel.setLastMessage(String.format("mensagem %s", i));
            userPanel.setMessageTime("15:50");
            userList.add(userPanel);
        }
        panel.add(userList, BorderLayout.WEST);

        JPanel mainPanel = new WhitePanel(new BorderLayout());

//        topPanel.add(userInfoPanel, BorderLayout.WEST);

        ChatUserInfoPanel chatUserInfoPanel = new ChatUserInfoPanel();
        chatUserInfoPanel.setAvatarAndNickname(avatarImage, "Usuário 0");
        mainPanel.add(chatUserInfoPanel, BorderLayout.NORTH);

        ChatSendMessagePanel chatSendMessagePanel = new ChatSendMessagePanel();
        mainPanel.add(chatSendMessagePanel, BorderLayout.SOUTH);

        ChatPanel chatPanel = new ChatPanel();
        mainPanel.add(chatPanel, BorderLayout.CENTER);

        panel.add(mainPanel, BorderLayout.CENTER);

        container.add(panel);
    }
}
