/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.suCo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class suCoController {

    public static boolean ghiNhanSuCo(suCo sc) {
        String sql = "insert into suCo values ('" + sc.getMaSuCo() + "','" + sc.getBienSoXe() + "','" + sc.getTenKH() + "','" + sc.getSDT() + "','" + sc.getNgayGhiNhan() + "','" + sc.getGioGhiNhan() + "','" + sc.getTenNV() + "'," + sc.getChiPhi() + ",'" +sc.getLoai()+"','"+ sc.getMoTa() + "')";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            System.out.println(sql);
            return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static ArrayList<suCo> layDanhSachSuCo() {
        ArrayList<suCo> list = new ArrayList<suCo>();
        String sql = "select * from suCo";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                suCo sc = new suCo();
                sc.setMaSuCo(rs.getString("maSuCo"));
                sc.setTenKH(rs.getString("tenKH"));
                sc.setSDT(rs.getString("SDT"));
                sc.setBienSoXe(rs.getString("bienSoXe"));
                sc.setTenNV(rs.getString("tenNV"));
                sc.setNgayGhiNhan(rs.getString("ngayGhiNhan"));
                sc.setGioGhiNhan(rs.getString("gioGhiNhan"));
                sc.setMoTa(rs.getString("moTa"));
                sc.setChiPhi(rs.getInt("chiPhi"));
                sc.setLoai(rs.getInt("loai"));
                list.add(sc);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static String sinhMaSuCo(){
        String sql = "select count (maSuCo) as[count] from suCo";
        try{
            Connection conn = ketNoi.taoKetNoi();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            int i = rs.getInt("count");
            if(i <9){
                return "SC0"+(i+1);
            }
            else return "SC"+i;
        } catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
