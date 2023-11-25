/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class quyDinhController {

    public static int layGiaTien(String maQuyDinh) {
        String sql = "select giaTien from quyDinh where maQuyDinh = '" + maQuyDinh + "'";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            return rs.getInt("giaTien");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }
}
