package com.zakia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMI extends JFrame{
    private JTextField berat;
    private JTextField tinggi;
    private JButton oke;
    private JLabel hasilnya;
    private JButton clear;
    private JPanel panel;
    private JButton closeButton;
    private JButton lihatHasilButton;
    static float hasil;

    public BMI() {
        lihatHasilButton.setVisible(false);
        oke.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //grab the text
                hasil = (float) (Double.parseDouble(berat.getText())) / ((float) (Double.parseDouble(tinggi.getText())) * (float) (Double.parseDouble(tinggi.getText())));

                if (hasil <= 17) {
                    hasilnya.setText("BMI anda adalah " + hasil);
                    lihatHasilButton.setVisible(true);
                } else if (hasil <= 23) {
                    hasilnya.setText("BMI anda adalah " + hasil);
                    lihatHasilButton.setVisible(true);
                } else if (hasil <= 25) {
                    hasilnya.setText("BMI anda adalah " + hasil);
                    lihatHasilButton.setVisible(true);
                } else if (hasil <= 40){
                    hasilnya.setText("BMI anda adalah " + hasil);
                    lihatHasilButton.setVisible(true);
                } else {
                    hasilnya.setText("inputan berat atau tinggi anda salah. mohon periksa ulang.");
                }
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                berat.setText("");
                tinggi.setText("");
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
                HasilPage hasilPage = new HasilPage(hasil);
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                hasilPage.setSize(500,500);
                hasilPage.setLocation(dim.width/2-hasilPage.getSize().width/2, dim.height/2-hasilPage.getSize().height/2);
                hasilPage.setVisible(true);
            }
        });
    }
}
