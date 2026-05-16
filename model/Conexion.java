package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    public Connection getConnection() {

        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/Restaurante_Sprint07",
                    "root",
                    "123456"
            );

            System.out.println("Conexión exitosa");

            return con;

        } catch (Exception e) {

            System.out.println("Error conexión: " + e.getMessage());

            return null;
        }
    }
}