package com.zakia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage {
    private JTextField txtUsername;
    private JTextField txtPassword;
    private JButton btn_login;
    private JButton btn_cancel;
    private JPanel myPanel;
    static JFrame frame = new JFrame("Login Area");

    public static void main(String[] args) {
        frame.setContentPane(new HomePage().myPanel);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setSize(500,500);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setVisible(true);
    }

    public HomePage() {
        btn_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtUsername.getText().equals("") || txtPassword.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Harap isi username dan password terlebih Dahulu !!!");
                }else{
                    UserService service = new UserService(txtUsername.getText(),txtPassword.getText());
                    if(service.login() == true)
                    {
                        //JOptionPane.showMessageDialog(null,"Login Berhasil :)");
                        frame.dispose();
                        MenuPage menuPage = new MenuPage();
                        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                        menuPage.setSize(500,500);
                        menuPage.setLocation(dim.width/2-menuPage.getSize().width/2, dim.height/2-menuPage.getSize().height/2);
                        menuPage.setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(null,"Login Gagal !!!");
                    }
                }
            }
        });
        btn_cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }
}
