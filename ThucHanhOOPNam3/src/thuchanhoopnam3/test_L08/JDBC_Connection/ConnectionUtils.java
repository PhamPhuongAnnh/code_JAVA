/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.test_L08.JDBC_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phuon
 */
public class ConnectionUtils {

    private static final String PROTOCAL = "jdbc:mysql://";
    private static final String SERVER = "localhost";
    private static final int PORT = 3306;
    private static final String DBName = "qlnv";
    private static final String USERNAME = "root";
    private static final String PASS = "Hoanganh2112";
    private static final String SSL = "?autoReconnect=true&useSSL=false";

    public static String getURL() {
        String url = PROTOCAL + SERVER + ":" + PORT + "/" + DBName + SSL;
        return url;
    }

    public static Connection getMySQLConnection() throws SQLException,
            ClassNotFoundException {
        String hostName = "localhost";
        String userName = "root";
        String dbName = "QuanLyNhanVien";
        String pass = "Hoanganh2112";
        return getMySQLConnection(hostName, dbName, userName, pass);
    }

    public static Connection getMySQLConnection(String hostName, String dbName,
            String userName, String password) throws SQLException,
            ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(getURL(), userName, password);
        return conn;
    }

    public static void main(String[] args) {
        try {
            System.out.println(getMySQLConnection());
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionUtils.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
