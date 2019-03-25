package com.whatsapp.view.components;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;

@Setter
@Getter
@Builder
public class UserPanel extends JPanel {

    private Image avatar;
    private String phoneNumber;
    private String nickname;

    public UserPanel() {

    }
}
