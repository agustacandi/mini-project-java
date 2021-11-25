package miniproject1;

import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author tohsaka
 */
public class Config {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_NAME = "rentalkeun";
    private static final String USER = "rentalkeun";
    private static final String PASSWORD = "Bismillah5758";
    private static final String URL = "jdbc:mysql://db4free.net c:3306/" + DB_NAME;
    
    public static Connection configDB() throws SQLException {
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        return connection;
    }
    
    public static boolean isConnected() {
        try {
            Config.configDB();
            System.out.println("Database Terkoneksi");
            return true;
        } catch (Exception e) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Koneksi Gagal");
            return false;
        }
    }
    
    public static void main(String[] args) {
        isConnected();
    }
}
