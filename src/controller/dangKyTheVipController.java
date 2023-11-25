/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.dangKyTheVip;

/**
 *
 * @author Admin
 */
public class dangKyTheVipController {
        public static boolean taoTheVip(String maThe, String maLoaiThe, String bienSoXe,String maKhu, String maViTri, String tenKhachHang, String CCCD, String soDienThoai, String ngayDangKy,String ngayHetHan, int tien, String tenNhanVien) {
        String sql = "insert into danhSachDangKyTheVip values('" + maThe + "','" + maLoaiThe + "','"
                + bienSoXe + "','" +maKhu+"','"+maViTri+"','"+ tenKhachHang + "','" + CCCD + "','" + soDienThoai + "','" + ngayDangKy + "','" +ngayHetHan+"'," + tien + ",'" + tenNhanVien + "')";
        String sql1 = "insert into danhSachThe values ('" + maThe + "','" + maLoaiThe + "','" + bienSoXe + "','"+maKhu+"','"+maViTri+"','0','1')";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            PreparedStatement pstmt1 = conn.prepareStatement(sql1);
            pstmt1.executeUpdate();
            return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
                    System.out.println(sql);
                    System.out.println(sql1);
        return false;
    }
public static ArrayList<dangKyTheVip> layDanhSachTheVip() {
        ArrayList<dangKyTheVip> list = new ArrayList<dangKyTheVip>();
        String sql = "select * from danhSachDangKyTheVip";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                dangKyTheVip tt = new dangKyTheVip();
                tt.setMaThe(rs.getString("maThe"));
                tt.setBienSoXe(rs.getString("bienSoXe"));
                tt.setMaLoaiThe(rs.getString("maLoaiThe"));
                tt.setMaKhu(rs.getString("maKhu"));
                tt.setMaViTri(rs.getString("maViTri"));
                tt.setTenKH(rs.getString("tenKH"));
                tt.setCCCD(rs.getString("CCCD"));
                tt.setSoDienThoai(rs.getString("soDienThoai"));
                tt.setNgayDangky(rs.getString("ngayDangKy"));
                tt.setNgayHetHan(rs.getString("ngayHetHan"));
                tt.setTien(rs.getInt("tien"));
                tt.setTenNhanVien(rs.getString("tenNhanVien"));
                list.add(tt);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }
    public static ArrayList<dangKyTheVip> timTheVipTheoMaThe(String maThe) {
        ArrayList<dangKyTheVip> list = new ArrayList<dangKyTheVip>();
        String sql = "select * from danhSachDangKyTheVip where maThe like '%" + maThe + "%'";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                dangKyTheVip tt = new dangKyTheVip();
                tt.setMaThe(rs.getString("maThe"));
                tt.setBienSoXe(rs.getString("bienSoXe"));
                tt.setMaLoaiThe(rs.getString("maLoaiThe"));
                tt.setMaKhu(rs.getString("maKhu"));
                tt.setMaViTri(rs.getString("maViTri"));
                tt.setTenKH(rs.getString("tenKH"));
                tt.setCCCD(rs.getString("CCCD"));
                tt.setSoDienThoai(rs.getString("soDienThoai"));
                tt.setNgayDangky(rs.getString("ngayDangKy"));
                tt.setTien(rs.getInt("tien"));
                tt.setNgayHetHan(rs.getString("ngayHetHan"));
                list.add(tt);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }
    public static ArrayList<dangKyTheVip> timTheVipTheoBienSo(String bienSo) {
        ArrayList<dangKyTheVip> list = new ArrayList<dangKyTheVip>();
        String sql = "select * from danhSachDangKyTheVip where bienSoXe like '%" + bienSo + "%'";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                dangKyTheVip tt = new dangKyTheVip();
                tt.setMaThe(rs.getString("maThe"));
                tt.setBienSoXe(rs.getString("bienSoXe"));
                tt.setMaLoaiThe(rs.getString("maLoaiThe"));
                tt.setMaKhu(rs.getString("maKhu"));
                tt.setMaViTri(rs.getString("maViTri"));
                tt.setTenKH(rs.getString("tenKH"));
                tt.setCCCD(rs.getString("CCCD"));
                tt.setSoDienThoai(rs.getString("soDienThoai"));
                tt.setNgayDangky(rs.getString("ngayDangKy"));
                tt.setTien(rs.getInt("tien"));
                tt.setNgayHetHan(rs.getString("ngayHetHan"));
                list.add(tt);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }
}
