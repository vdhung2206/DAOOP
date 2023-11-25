/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.khu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class khuController {

    public static boolean themKhu(khu k) {
        String sql = "insert into danhSachKhu values ('" + k.getMaKhu() + "','" + k.getLoaiKhu() + "','" + k.getLoaiXe() + "'," + k.getSucChua() + "," + k.getSucChua() + ")";
        try ( Connection conn = ketNoi.taoKetNoi();) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            System.out.println(sql);
            return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static ArrayList<khu> layDanhSachKhu() {
        ArrayList<khu> list = new ArrayList<khu>();
        String sql = "select * from danhSachKhu";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                khu k = new khu();
                k.setMaKhu(rs.getString("maKhu"));
                k.setLoaiKhu(rs.getString("loaiKhu"));
                k.setSucChua(rs.getInt("sucChua"));
                k.setLoaiXe(rs.getString("loaiXe"));
                list.add(k);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public static ArrayList<khu> layDanhSachKhuThuong(String loaiXe) {
        ArrayList<khu> list = new ArrayList<khu>();
        String sql = "select * from danhSachKhu where loaiKhu = 'Thuong' and loaiXe ='" + loaiXe + "'";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                khu k = new khu();
                k.setMaKhu(rs.getString("maKhu"));
                k.setLoaiKhu(rs.getString("loaiKhu"));
                k.setSucChua(rs.getInt("sucChua"));
                list.add(k);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public static ArrayList<khu> layDanhSachKhuVip(String loaiXe) {
        ArrayList<khu> list = new ArrayList<khu>();
        String sql = "select * from danhSachKhu where loaiKhu = 'Vip' and loaiXe ='" + loaiXe + "'";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                khu k = new khu();
                k.setMaKhu(rs.getString("maKhu"));
                k.setLoaiKhu(rs.getString("loaiKhu"));
                k.setSucChua(rs.getInt("sucChua"));
                list.add(k);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public static khu layThongTinKhu(String maKhu) {
        String sql = "select *from danhSachKhu where maKhu ='" + maKhu + "'";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            khu k = new khu();
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            k.setMaKhu(rs.getString("maKhu"));
            k.setLoaiKhu(rs.getString("loaiKhu"));
            k.setLoaiXe(rs.getString("loaiXe"));
            k.setSucChua(Integer.parseInt(rs.getString("sucChua")));
            k.setConLai(Integer.parseInt(rs.getString("conLai")));
            return k;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static boolean capNhatKhu(String maKhu, String sucChua) {
        String sql = "update danhSachKhu set conLai = " + sucChua + "-sucChua + conLai , sucChua = " + sucChua + " where maKhu ='" + maKhu + "'";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            return pstmt.executeUpdate() > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public static boolean nhanXe(String maKhu) {
        String sql = "update danhSachKhu set conLai = conLai -1 where maKhu ='" + maKhu + "'";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            return pstmt.executeUpdate() > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public static boolean traXe(String maKhu) {
        String sql = "update danhSachKhu set conLai = conLai +1 where maKhu ='" + maKhu + "'";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            return pstmt.executeUpdate() > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
