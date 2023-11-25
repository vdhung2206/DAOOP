/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.viTri;
/**
 *
 * @author Admin
 */
public class viTriController {

    public static boolean themViTri(String maKhu, int soLuong) {
        int i = 1;
        try ( Connection conn = ketNoi.taoKetNoi()) {
            for (i = 1; i <= soLuong; i++) {
                if (i < 10) {
                    String sql = "insert into danhSachViTri values ('" + maKhu + "0" + String.valueOf(i) + "','" + maKhu + "'," + "0)";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.executeUpdate();
                } else {
                    String sql = "insert into danhSachViTri values ('" + maKhu + String.valueOf(i) + "','" + maKhu + "'," + "0)";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.executeUpdate();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static ArrayList<viTri> layDanhSachViTri(String maKhu){
        String sql = "select * from danhSachViTri where coXe = 0 and maKhu ='" + maKhu+"'";
        ArrayList<viTri> list = new ArrayList<viTri>();
        try(Connection conn = ketNoi.taoKetNoi()){
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                viTri vt = new viTri();
                vt.setMaViTri(rs.getString("maViTri"));
                list.add(vt);
            }
            return list;
        } catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public static boolean coXe(String maViTri){
        String sql = "update danhSachViTri set coXe = 1 where maViTri ='" +maViTri+"'";
        try(Connection conn = ketNoi.taoKetNoi()){
            PreparedStatement pstmt = conn.prepareStatement(sql);
            return pstmt.executeUpdate()>0;
        } catch(Exception ex){
            ex.printStackTrace( );
        }
        return false;
    }
}
