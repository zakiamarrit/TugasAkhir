package com.zakia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPage extends JFrame {
    private JPanel panel;
    private JButton IMTButton;
    private JButton artikelButton;
    private JButton logoutButton;
    private JButton artikel2Button;
    private JButton WHRButton;

    public MenuPage() {
        IMTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BMI bmiPage = new BMI();
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                bmiPage.setSize(500,500);
                bmiPage.setLocation(dim.width/2-bmiPage.getSize().width/2, dim.height/2-bmiPage.getSize().height/2);
                bmiPage.setVisible(true);
            }
        });

        WHRButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WHR whrPage = new WHR();
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                whrPage.setSize(500,500);
                whrPage.setLocation(dim.width/2-whrPage.getSize().width/2, dim.height/2-whrPage.getSize().height/2);
                whrPage.setVisible(true);
            }
        });

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel);
        this.pack();
        this.setTitle("Menu Page");
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();

            }
        });

        artikelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArtikelPage artikelPage = new ArtikelPage();
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                artikelPage.setSize(500,500);
                artikelPage.setLocation(dim.width/2-artikelPage.getSize().width/2, dim.height/2-artikelPage.getSize().height/2);
                artikelPage.setVisible(true);
            }
        });
        artikel2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Artikel2Page artikel2Page = new Artikel2Page();
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                artikel2Page.setSize(500,500);
                artikel2Page.setLocation(dim.width/2-artikel2Page.getSize().width/2, dim.height/2-artikel2Page.getSize().height/2);
                artikel2Page.setVisible(true);
            }
        });
    }

}
