/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.test_L08.JDBC_Connection;

import java.sql.DriverManager;
import com.sun.jdi.connect.spi.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phuon
 */
public class ConnectionMySQL {

    public String getURL() {
        String url = "String url = \"jdbc:mysql://localhost:3306/qlnv";
        return url;
    }

    public Connection getConnection() throws ClassNotFoundException {
              Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/qlnv";
		String username = "root";
		String password = "Hoanganh2112";

		Connection con = null;
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
		

        return con;
    }

    public static void main(String[] args) {
        ConnectionMySQL cnn = new ConnectionMySQL();
        try {
            System.out.println(cnn.getConnection());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
