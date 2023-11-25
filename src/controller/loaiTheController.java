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
public class loaiTheController {
        public static String layLoaiXe(String maLoaiThe) {
        String sql = "select loaiXe from loaiThe where maLoaiThe = '" + maLoaiThe + "'";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            return rs.getString("loaiXe");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
