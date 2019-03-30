package com.whatsapp;

import com.whatsapp.view.Whatsapp;

public class Application {

    public static void main(String[] args) {
        try {
            Whatsapp whatsapp = new Whatsapp();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
