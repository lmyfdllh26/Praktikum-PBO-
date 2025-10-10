package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "http://localhost/phpmyadmin/index.php?route=/database/structure&db=db_atlet";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("✅ Koneksi ke database berhasil!");
            } catch (ClassNotFoundException e) {
                System.out.println("❌ Driver JDBC tidak ditemukan: " + e.getMessage());
            } catch (SQLException e) {
                System.out.println("❌ Koneksi gagal: " + e.getMessage());
            }
        }
        return connection;
    }
}
