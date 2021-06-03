package com.zakia;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HasilPage extends JFrame{
    private JTextArea txtHasil;
    private JPanel panel1;
    private JButton tutupButton;

    public HasilPage(float hasil){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();
        this.setTitle("Halaman Hasil BMI");
        if (hasil <= 17) {
            txtHasil.setText("dari hasil yang didapat yaitu "+ String.valueOf(hasil) + " kamu harus lebih memperhatikan pola\n" +
                    "makan dan asupan gizi. Agar dapat menaikkan berat badan menuju normal");
        } else if (hasil <= 23) {
            txtHasil.setText("dari hasil yang didapat yaitu "+ String.valueOf(hasil) + " berat badan anda sudah ideal.\n" +
                    "Cukup jaga pola makan anda secara rutin\n" +
                    "dan jangan lupa untuk berolahraga agar tubuh senantiasa sehat");
        } else if (hasil <= 25) {
            txtHasil.setText("dari hasil yang didapat yaitu "+ String.valueOf(hasil) + " .Menurut indeks BMI, anda termasuk dalam\n" +
                    "golongan kelebihan berat badan.\n" +
                    "Maka dari itu, kurangi asupan makanan anda tiap harinya. \n" +
                    "Salah satu cara adalah dengan memperhatikan kalori pada setiap makanan yang kita makan. \n" +
                    "Dan jangan lupa senantiasa berolahraga untuk mengimbanginya.");
        } else {
            txtHasil.setText("dari hasil yang didapat yaitu "+ String.valueOf(hasil) + " .Berat badan ini termasuk dalam kategori obesitas. \n" +
                    "Disarankan bagi anda untuk melakukan diet sehat.\n" +
                    "Atau opsi lain, jika anda berkenan, datanglah ke dokter gizi\n" +
                    "untuk membantu memelihara pola asupan makana yang baik bagi anda.");
        }

        tutupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
