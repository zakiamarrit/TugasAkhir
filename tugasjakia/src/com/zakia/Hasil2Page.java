package com.zakia;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hasil2Page extends JFrame {
    private JTextArea txtHasil;
    private JButton tutupButton;
    private JPanel panel;

    public Hasil2Page(float hasil){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel);
        this.pack();
        this.setTitle("Halaman Hasil WHR");
        if (hasil <= 0.8 ) {
            txtHasil.setText(" dari hasil yang didapat yaitu "+ String.valueOf(hasil) + " , ini menandakan bahwa\n" +
                    " resiko untuk terkena radiovaskular adalah rendah.\n");
        } else if (hasil <= 0.88) {
            txtHasil.setText(" dari hasil yang didapat yaitu "+ String.valueOf(hasil) + " ini menandakan bahwa\n" +
                    " resiko untuk terkena radiovaskular adalah sedang.\n");
        } else {
            txtHasil.setText("dari hasil yang didapat yaitu "+ String.valueOf(hasil) + " .ini menandakan bahwa\n" +
                    " resiko untuk terkena radiovaskuar adalah tinggi.");
        }

        tutupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
