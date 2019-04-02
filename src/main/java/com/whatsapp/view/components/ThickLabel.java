package com.whatsapp.view.components;

import javax.swing.*;
import java.awt.*;

public class ThickLabel extends JLabel {

    public ThickLabel() {
        Font f = this.getFont();
        this.setFont(f.deriveFont(f.getStyle() & ~Font.BOLD));
    }

    public ThickLabel(String text) {
        this();
        this.setText(text);
    }
}
