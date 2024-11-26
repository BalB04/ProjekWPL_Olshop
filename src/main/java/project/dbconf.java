/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author W I N D O W S
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconf {
     public static Connection connect() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://127.0.0.1:3306/projekwpl";; // Ganti dengan nama database Anda
            String user = "root"; // Ganti dengan username Anda
            String password = ""; // Ganti dengan password Anda (kosongkan jika tidak ada password)
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Koneksi berhasil!");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
        return conn;
    }
}
