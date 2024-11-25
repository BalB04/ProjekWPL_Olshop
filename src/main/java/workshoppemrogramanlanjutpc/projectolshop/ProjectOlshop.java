/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package workshoppemrogramanlanjutpc.projectolshop;

/**
 *
 * @author BalbalPC
 */

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProjectOlshop {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Connection conn = dbconf.connect(); // Panggil koneksi database
        if (conn != null) {
            try {
                String query = "SELECT * FROM produk"; // Ganti dengan nama tabel Anda
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                // Loop melalui hasil query
                while (rs.next()) {
                    // Contoh: Ambil data dari kolom
                    int id = rs.getInt("prod_id"); // Ganti "id" dengan nama kolom Anda
                    String name = rs.getString("nama"); // Ganti "name" dengan nama kolom Anda
                    String harga = rs.getString("harga");
                    String kategori = rs.getString("kategori");
                    String deskripsi = rs.getString("deskripsi");
                    System.out.println("ID: " + id + ", Name: " + name + "harga: "+harga);
                }

                // Tutup koneksi
                rs.close();
                stmt.close();
                conn.close();
            } catch (Exception e) {
                System.out.println("Error saat query data: " + e.getMessage());
            }
        }
    }
}
//Token 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