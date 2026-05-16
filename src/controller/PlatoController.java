package controller;

import model.Conexion;
import model.Plato;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PlatoController {

    Conexion conexion = new Conexion();

    public void agregar(Plato plato) {

        try {

            Connection con = conexion.getConnection();

            if(con == null) {
                System.out.println("No conecta");
                return;
            }

            String sql = "INSERT INTO platos(nombre, precio) VALUES (?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, plato.getNombre());
            ps.setDouble(2, plato.getPrecio());

            int resultado = ps.executeUpdate();

            System.out.println("Filas insertadas: " + resultado);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}