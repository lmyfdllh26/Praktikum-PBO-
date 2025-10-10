
package CRUDAtlet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class TampilData {
    private static final String URL = "http://localhost/phpmyadmin/index.php?route=/database/structure&db=db_atlet";
    private static final String USER = "root";
    private static final String PASS = "";

    public static void tampilkanData() {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM atlet"; // sesuaikan nama tabel
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("=== DAFTAR ATLET ===");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Nama: " + rs.getString("nama"));
                System.out.println("Cabang: " + rs.getString("cabang_olahraga"));
                System.out.println("-----------------------------");
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        tampilkanData();
    }
}



