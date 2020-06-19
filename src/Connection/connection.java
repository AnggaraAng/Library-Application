package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class connection {

    static Connection con;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Database_perpustakaan","root","");
            
        } catch (Exception e) {
            System.out.println("koneksi gagal " + e.getMessage()); //perintah menampilkan error pada koneksi
        }
        return con;
    }
}

