package view;

import javax.swing.*;

public class MainView extends JFrame {

    public MainView() {

        setTitle("Menú Principal");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton btnPlato = new JButton("CRUD Platos");
        btnPlato.setBounds(50, 100, 120, 40);
        add(btnPlato);

        JButton btnPedido = new JButton("CRUD Pedidos");
        btnPedido.setBounds(200, 100, 120, 40);
        add(btnPedido);

        btnPlato.addActionListener(e -> new PlatoView());
        btnPedido.addActionListener(e -> new PedidoView());

        setVisible(true);
    }
}