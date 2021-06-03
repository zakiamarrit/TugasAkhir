package com.zakia;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArtikelPage extends JFrame{
    private JPanel panel1;
    private JTextArea textArea1;
    private JButton keluarButton;

    public ArtikelPage(){
        textArea1.setText(pg1()+pg2()+pg3()+pg4()+pg5());
        this.setTitle("Artikel Page");
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
        return  " Indeks Massa Tubuh (IMT) merupakan salah satu cara untuk mengetahui\n" +
                " rentang berat badan ideal Anda dan memprediksi seberapa besar\n" +
                " risiko gangguan kesehatan Anda. Metode ini digunakan untuk menen-\n" +
                " tukan berat badan yang sehat berdasarkan berat dan tinggi badan.\n\n\n";
    }

    public String pg2() {
        return  " Angka indeks massa tubuh atau dalam bahasa Inggris Body Mass Index\n" +
                " (BMI) digunakan untuk menunjukkan kategori berat badan seseorang\n" +
                " apakah sudah proporsional atau belum. Melalui IMT, seseorang akan\n" +
                " tahu apakah berat badannya termasuk kategori normal atau ideal,\n" +
                " kelebihan atau justru kekurangan.Pemeriksaan BMI juga dapat menentukan \n" +
                " status gizi anak dan menilai apakah anak menderita obesitas atau tidak.\n\n\n";
    }
    public String pg3() {
        return  " Indeks massa tubuh didapat dengan membagi berat badan seseorang da-\n" +
                " lam satuan kilogram dengan tinggi mereka dalam meter kuadrat. Bagi \n" +
                " sebagian orang, nilai indeks massa tubuh kemungkinan tidak akurat. \n" +
                " Mereka yang sedang hamil, binaragawan, atau atlet dengan tingkat \n" +
                " aktivitas tinggi adalah golongan dengan nilai IMT yang tidak \n" +
                " mencerminkan kesehatan saat itu. Artinya, meski nilai IMT mereka \n" +
                " di atas normal, bukan berarti mereka memiliki lemak berlebihan.\n\n\n";
    }

    public String pg4() {
        return  " IMT memang bisa dijadikan patokan agar seseorang waspada terhadap\n" +
                " berat badan yang tidak normal. Namun, bergantung secara berlebihan\n" +
                " pada angka tsb juga tidaklah bijaksana. Salah satu kelemahan \n" +
                " perhitungan IMT adalah hasil IMT bersifat umum karena tidak \n" +
                " memperhitungkan faktor-faktor lain, seperti tipe bentuk tubuh, usia, \n" +
                " dan tingkat aktivitas seseorang.\n\n\n";
    }

    public String pg5() {
        return  " Terlepas dari segala kekurangannya, perhitungan IMT baik diketahui \n" +
                " terutama sebagai pengingat untuk menjaga berat badan. Jika Anda memi- \n" +
                " liki berat badan kurang, Anda bisa menggunakan suplemen vitamin pengge- \n" +
                " badan dan memperbaiki pola makan guna menggemukkan badan. Sebaliknya,\n" +
                " muk jika tubuh Anda kegemukan, Anda bisa mencoba diet sehat dan \n" +
                " lebih sering olahraga. Dengan memiliki berat badan yang normal, \n" +
                " tubuh akan senantiasa lebih sehat.\n\n";
    }
}
