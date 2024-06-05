
package kk.pe.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
    public static final String DB_NAME = "ExpenditureDB";
    public static final String USERNAME = "KK";
    public static final String PASSWORD = "123456";
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        return getConnection(DB_NAME, USERNAME, PASSWORD);
    }
    
    public static Connection getConnection(String dbName, String username, String password) throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
        String dbURL = "jdbc:sqlserver://MSI;databaseName=ExpenditureDB"
                +";encreypt=true;trustServerCertificate=true;";
        
        Connection conn = DriverManager.getConnection(String.format(dbURL, dbName), username, password);
        
        return conn;
    }
}
