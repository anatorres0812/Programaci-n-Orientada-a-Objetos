package view;

import controller.PedidoController;
import model.Pedido;

import javax.swing.*;

public class PedidoView extends JFrame {

    public PedidoView() {

        setTitle("CRUD Pedidos");
        setSize(350, 300);
        setLayout(null);

        JLabel lblCliente = new JLabel("Cliente:");
        lblCliente.setBounds(30, 30, 100, 30);
        add(lblCliente);

        JTextField txtCliente = new JTextField();
        txtCliente.setBounds(140, 30, 150, 30);
        add(txtCliente);

        JLabel lblPlato = new JLabel("ID Plato:");
        lblPlato.setBounds(30, 80, 100, 30);
        add(lblPlato);

        JTextField txtPlato = new JTextField();
        txtPlato.setBounds(140, 80, 150, 30);
        add(txtPlato);

        JLabel lblCantidad = new JLabel("Cantidad:");
        lblCantidad.setBounds(30, 130, 100, 30);
        add(lblCantidad);

        JTextField txtCantidad = new JTextField();
        txtCantidad.setBounds(140, 130, 150, 30);
        add(txtCantidad);

        JButton guardar = new JButton("Guardar");
        guardar.setBounds(110, 200, 100, 30);
        add(guardar);

        guardar.addActionListener(e -> {

            Pedido pedido = new Pedido(
                    txtCliente.getText(),
                    Integer.parseInt(txtPlato.getText()),
                    Integer.parseInt(txtCantidad.getText())
            );

            new PedidoController().agregar(pedido);

            JOptionPane.showMessageDialog(null, "Pedido registrado");
        });

        setVisible(true);
    }
}