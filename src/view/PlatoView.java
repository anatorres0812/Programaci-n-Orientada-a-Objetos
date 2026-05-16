package view;

import controller.PlatoController;
import model.Plato;

import javax.swing.*;

public class PlatoView extends JFrame {

    public PlatoView() {

        setTitle("CRUD Platos");
        setSize(300, 250);
        setLayout(null);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(30, 30, 100, 30);
        add(lblNombre);

        JTextField txtNombre = new JTextField();
        txtNombre.setBounds(120, 30, 120, 30);
        add(txtNombre);

        JLabel lblPrecio = new JLabel("Precio:");
        lblPrecio.setBounds(30, 80, 100, 30);
        add(lblPrecio);

        JTextField txtPrecio = new JTextField();
        txtPrecio.setBounds(120, 80, 120, 30);
        add(txtPrecio);

        JButton guardar = new JButton("Guardar");
        guardar.setBounds(90, 150, 100, 30);
        add(guardar);

        guardar.addActionListener(e -> {

            if(txtNombre.getText().isEmpty() || txtPrecio.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Complete los campos");
                return;
            }

            Plato plato = new Plato(
                    txtNombre.getText(),
                    Double.parseDouble(txtPrecio.getText())
            );

            new PlatoController().agregar(plato);

            JOptionPane.showMessageDialog(null, "Plato registrado");
        });

        setVisible(true);
    }
}