package com.zakia;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Artikel2Page extends JFrame {
    private JButton keluarButton;
    private JTextArea textArea1;
    private JPanel panel1;

    public Artikel2Page(){
        textArea1.setText(pg1()+pg2()+pg3()+pg4());
        this.setTitle("Artikel 2 Page");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();

        keluarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

    public String pg1() {
        return  " WAIST - TO - HIP -  RATIO\n" +
                " Pinggang seseorang bisa menjadi tempat dimana banyak lemak tertimbun.\n" +
                " Lemak inilah yang bisa menyebabkab berbagai penyakit, \n" +
                " walaupun tinggi dan badan seseorang sudah profesional.\n" +
                " Penelitian menunjukkan bahwa orang yang mempunyai lemak\n" +
                " di bagian pinggang akan lebih rentan untuk mengidap penyakit\n" +
                " kardiovaskular (penyakit jantung, stroke, dll) juga diabetes.\n\n";
    }

    public String pg2() {
        return  " Semakin besar waist to hip ratio atau perbandingan antara lingkar\n" +
                " pinggang dan pinggul seseorang, maka semakin besar juga kemungkinan\n" +
                " resiko datangnya penyakit. Karena itulah, WHR bisa dijadikan\n" +
                " salah satu indikator kesehatan juga\n\n\n";
    }

    public String pg3() {
        return  " CARA MENGHITUNG WHR\n" +
                " Kamu bisa menggunakan pita uku runtuk menghitung angka WHR\n" +
                " 1. Ukur lingkar pinggang di bagian yang terkecil\n" +
                " (biasanya terletak di atas pusar)\n" +
                " 2. Dibagi dengan ukuran lingkar pinggul di bagian terbesar\n" +
                " Untuk lebih jelasnya kamu bisa menghitung menggunakan kalkulator\n" +
                " WHR pada menu utama.\n\n\n";
    }

    public String pg4() {
        return  " APAKAH WHR AKURAT?\n" +
                " Dibandingkan dengan IMT/BMI, angka WHR bisa lebih akurat\n" +
                " dalam memprediksi resiko kesehatan, seperti serangan jantung.\n" +
                " Namun, perlu diingat bahwa WHR tetap tidak bisa dijadikan\n" +
                " pengukur akurat untuk presentasi lemak dalam tubuh seseorang\n\n\n";
    }
}
