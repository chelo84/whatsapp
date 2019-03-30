package com.whatsapp.util;

import jiconfont.IconCode;
import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;

import javax.swing.*;
import java.awt.*;

public class IconUtil {

    static Boolean registered = false;

    private static void register() {
        if(!registered) {
            IconFontSwing.register(FontAwesome.getIconFont());
        }
    }

    public static Icon getIcon(IconCode iconFont, Integer size, Color color) {
        register();

        return IconFontSwing.buildIcon(iconFont, size, color);
    }

    public static Icon getIcon(IconCode iconFont, Integer size) {
        register();

        return IconFontSwing.buildIcon(iconFont, size);
    }

    public static Icon getIcon(IconCode iconFont) {
        return getIcon(iconFont, 15);
    }
}
