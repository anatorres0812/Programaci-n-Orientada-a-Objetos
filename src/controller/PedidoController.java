package controller;

import model.Conexion;
import model.Pedido;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PedidoController {

    Conexion conexion = new Conexion();

    public void agregar(Pedido pedido) {

        try {

            Connection con = conexion.getConnection();

            String sql = "INSERT INTO pedidos(cliente, plato_id, cantidad) VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, pedido.getCliente());
            ps.setInt(2, pedido.getPlatoId());
            ps.setInt(3, pedido.getCantidad());

            ps.executeUpdate();

            System.out.println("Pedido agregado");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}