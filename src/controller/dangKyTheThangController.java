/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.dangKyTheThang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class dangKyTheThangController {

    /**
     *
     * @return
     */
    public static boolean taoTheThang(String maThe, String maLoaiThe, String bienSoXe, String tenKhachHang, String CCCD, String soDienThoai, String ngayDangKy, int tien, String tenNhanVien) {
        String sql = "insert into danhSachDangKyTheThang values('" + maThe + "','" + maLoaiThe + "','"
                + bienSoXe + "','" + tenKhachHang + "','" + CCCD + "','" + soDienThoai + "','" + ngayDangKy + "'," + tien + ",'" + tenNhanVien + "',1)";
        String sql1 = "insert into danhSachThe values ('" + maThe + "','" + maLoaiThe + "','" + bienSoXe + "','','','1','0')";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            PreparedStatement pstmt1 = conn.prepareStatement(sql1);
            pstmt1.executeUpdate();
            return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static ArrayList<dangKyTheThang> layDanhSachTheThang() {
        ArrayList<dangKyTheThang> list = new ArrayList<dangKyTheThang>();
        String sql = "select * from danhSachDangKyTheThang";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                dangKyTheThang tt = new dangKyTheThang();
                tt.setMaThe(rs.getString("maThe"));
                tt.setBienSoXe(rs.getString("bienSoXe"));
                tt.setMaLoaiThe(rs.getString("maLoaiThe"));
                tt.setTenKH(rs.getString("tenKH"));
                tt.setCCCD(rs.getString("CCCD"));
                tt.setSoDienThoai(rs.getString("soDienThoai"));
                tt.setNgayDangky(rs.getString("ngayDangKy"));
                tt.setTien(rs.getInt("tien"));
                tt.setTenNhanVien(rs.getString("tenNhanVien"));
                if (rs.getInt("dongTien") == 0) {
                    tt.setDongTien("Chưa đóng tiền");
                } else {
                    tt.setDongTien("Đã đóng tiền");
                }
                list.add(tt);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public static boolean setChuaDongTien() {
        String sql = "update danhSachDangKyTheThang set dongTIen = 0";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();
            return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static ArrayList<dangKyTheThang> timTheThangTheoMaThe(String maThe) {
        ArrayList<dangKyTheThang> list = new ArrayList<dangKyTheThang>();
        String sql = "select * from danhSachDangKyTheThang where maThe like '%" + maThe + "%'";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                dangKyTheThang tt = new dangKyTheThang();
                tt.setMaThe(rs.getString("maThe"));
                tt.setBienSoXe(rs.getString("bienSoXe"));
                tt.setMaLoaiThe(rs.getString("maLoaiThe"));
                tt.setTenKH(rs.getString("tenKH"));
                tt.setCCCD(rs.getString("CCCD"));
                tt.setSoDienThoai(rs.getString("soDienThoai"));
                tt.setNgayDangky(rs.getString("ngayDangKy"));
                tt.setTien(rs.getInt("tien"));
                if (rs.getInt("dongTien") == 0) {
                    tt.setDongTien("Chưa dóng tiền");
                } else {
                    tt.setDongTien("Đã đóng tiền");
                }
                list.add(tt);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public static ArrayList<dangKyTheThang> timTheThangTheoBienSo(String bienSo) {
        ArrayList<dangKyTheThang> list = new ArrayList<dangKyTheThang>();
        String sql = "select * from danhSachDangKyTheThang where bienSoXe like '%" + bienSo + "%'";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                dangKyTheThang tt = new dangKyTheThang();
                tt.setMaThe(rs.getString("maThe"));
                tt.setBienSoXe(rs.getString("bienSoXe"));
                tt.setMaLoaiThe(rs.getString("maLoaiThe"));
                tt.setTenKH(rs.getString("tenKH"));
                tt.setCCCD(rs.getString("CCCD"));
                tt.setSoDienThoai(rs.getString("soDienThoai"));
                tt.setNgayDangky(rs.getString("ngayDangKy"));
                tt.setTien(rs.getInt("tien"));
                if (rs.getInt("dongTien") == 0) {
                    tt.setDongTien("Chưa dóng tiền");
                } else {
                    tt.setDongTien("Đã đóng tiền");
                }
                list.add(tt);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        return list;
    }

    public static boolean capNhatTheThang(String maThe, String loaiXe, String bienSoXe, String tenKhachHang, String CCCD, String soDienThoai, String ngayDangKy, int tien, int tinhTrang) {
        String sql = "update danhSachDangKyTheThang set dongTien =" + tinhTrang + ",tenKH= '" + tenKhachHang + "',CCCD='" + CCCD + "',soDienThoai='" + soDienThoai + "'where maThe ='" + maThe + "'";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean xoaTheThang(String maThe) {
        String sql = "delete from danhSachDangKyTheThang where maThe ='" + maThe + "'";
        String sql1 = "delete from danhSachThe where maThe ='" + maThe + "'";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            PreparedStatement pstmt1 = conn.prepareStatement(sql1);
            pstmt1.executeUpdate();
            return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
