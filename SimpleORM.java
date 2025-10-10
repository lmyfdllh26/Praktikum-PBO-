package crudatlet;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SimpleORM {
    private static final String URL = "jdbc:mysql://localhost:3306/db_olahraga";
    private static final String USER = "root";
    private static final String PASS = "";

    public static void simpan(Object obj) {
        try {
            Class<?> cls = obj.getClass();
            String tableName = cls.getSimpleName().toLowerCase();

            Field[] fields = cls.getDeclaredFields();
            StringBuilder columns = new StringBuilder();
            StringBuilder values = new StringBuilder();

            for (Field field : fields) {
                field.setAccessible(true);
                columns.append(field.getName()).append(",");
                values.append("'").append(field.get(obj)).append("',");
            }

            columns.setLength(columns.length() - 1);
            values.setLength(values.length() - 1);

            String sql = "INSERT INTO " + tableName + " (" + columns + ") VALUES (" + values + ")";
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();

            ps.close();
            conn.close();

            System.out.println("✅ Data berhasil disimpan ke tabel " + tableName);
        } catch (SQLException e) {
            System.out.println("Kesalahan SQL: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Gagal menyimpan data: " + e.getMessage());
        }
    }
}
