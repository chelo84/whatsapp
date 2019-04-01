package com.whatsapp;

import com.whatsapp.view.Whatsapp;
import java.awt.AWTException;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application {

    public static void main(String[] args) {
        try {
            Whatsapp whatsapp = new Whatsapp();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
            if (SystemTray.isSupported()) {
                SystemTray tray = SystemTray.getSystemTray();
                Image image = Toolkit.getDefaultToolkit().getImage("imagem.jpeg");
                
                PopupMenu popup = new PopupMenu();
                

    
    //ação de executar
    ActionListener actionListener = new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    }
    };
    //ação de sair
     ActionListener sairListener = new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    System.exit(0);
    }
    };     
    //Opção executar
     MenuItem executarItem = new MenuItem("Abrir");
     executarItem.addActionListener(actionListener);
     popup.add(executarItem);
     
    //Opção sair
     MenuItem sairItem = new MenuItem("Sair");
     sairItem.addActionListener(sairListener);
     popup.add(sairItem);               

     TrayIcon trayIcon = new TrayIcon(image, "Whats App", popup);
     trayIcon.setImageAutoSize(true);      
                try {
                    tray.add(trayIcon);
                } catch (AWTException e) {
                    System.err.println("Não pode adicionar a tray");
                }
            } else {
                System.err.println("Tray indisponível");
            }
        };

    }

