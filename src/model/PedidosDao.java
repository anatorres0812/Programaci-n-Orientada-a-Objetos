package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PedidosDao {

    private Connection con;

    public PedidosDao(Connection con) {
        this.con = con;
    }

    // Registrar pedido
    public boolean registrarPedido(model.Pedido pedido) {

        String sql = "INSERT INTO pedidos(cliente, plato_id, cantidad) VALUES (?, ?, ?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, pedido.getCliente());
            ps.setInt(2, pedido.getPlatoId());
            ps.setInt(3, pedido.getCantidad());

            ps.executeUpdate();

            return true;

        } catch (SQLException e) {

            System.out.println("Error al registrar pedido: " + e.getMessage());

            return false;
        }
    }
}