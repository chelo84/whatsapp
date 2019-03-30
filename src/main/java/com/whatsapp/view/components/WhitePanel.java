package com.whatsapp.view.components;

import javax.swing.*;
import java.awt.*;

public class WhitePanel extends JPanel {

    public WhitePanel() {
        this.setBackground(Color.WHITE);
    }

    public WhitePanel(LayoutManager layout) {
        this();

        this.setLayout(layout);
    }
}
