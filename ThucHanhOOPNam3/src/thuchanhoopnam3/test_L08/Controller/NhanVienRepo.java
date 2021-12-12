/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhoopnam3.test_L08.Controller;

import com.sun.jdi.connect.spi.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import thuchanhoopnam3.test_L08.JDBC_Connection.ConnectionUtils;
import thuchanhoopnam3.test_L08.Model.NhanVien;
import thuchanhoopnam3.test_L08.repo.ISNhanVienRepo;

/**
 *
 * @author phuon
 */
public class NhanVienRepo implements ISNhanVienRepo {

    @Override
    public boolean insert(NhanVien nv) {
        String sql = "insert into values ('" + nv.getMaNV() + "', N'" + nv.getHoTen() + "', " + nv.getLuong() + ", " + nv.getThuNhap() + ")";
        ConnectionUtils connect = new ConnectionUtils();
        Connection cnn;
        try {
            cnn = (Connection) connect.getMySQLConnection();
            PreparedStatement pst = cnn.prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienRepo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NhanVienRepo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    @Override
    public List<NhanVien> select() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
