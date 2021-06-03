package com.zakia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WHR extends JFrame {
    private JPanel panel;
    private JTextField lingkarpg;
    private JTextField lingkarpl;
    private JButton clearr;
    private JButton lihatHasilButton;
    private JButton closeButton;
    private JButton oke;
    private JLabel hasilnya;
    static float hasil;


    public WHR () {
        lihatHasilButton.setVisible(false);
        oke.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //grab the text
                hasil = (float) (Double.parseDouble(lingkarpg.getText())) / ((float) (Double.parseDouble(lingkarpl.getText())));

                if (hasil <= 0.8) {
                    hasilnya.setText("WHR anda adalah " + hasil);
                    lihatHasilButton.setVisible(true);
                } else if (hasil <= 0.89) {
                    hasilnya.setText("WHR anda adalah " + hasil);
                    lihatHasilButton.setVisible(true);
                } else {
                    hasilnya.setText("WHR anda adalah " + hasil);
                    lihatHasilButton.setVisible(true);
                }
            }
        });
        clearr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lingkarpl.setText("");
                lingkarpg.setText("");
            }
        });
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel);
        this.pack();
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        lihatHasilButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hasil2Page hasil2Page = new Hasil2Page(hasil);
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                hasil2Page.setSize(500,500);
                hasil2Page.setLocation(dim.width/2-hasil2Page.getSize().width/2, dim.height/2-hasil2Page.getSize().height/2);
                hasil2Page.setVisible(true);
            }
        });
    }
}
