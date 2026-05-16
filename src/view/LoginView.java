package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {

    public LoginView() {

        setTitle("Bienvenido");
        setSize(300, 200);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel titulo = new JLabel("Sistema Restaurante");
        titulo.setBounds(70, 30, 200, 30);
        add(titulo);

        JButton entrar = new JButton("Entrar");
        entrar.setBounds(90, 90, 100, 30);
        add(entrar);

        entrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new MainView();
                dispose();
            }
        });

        setVisible(true);
    }
}