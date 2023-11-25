/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.taiKhoan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import model.phienDangNhap;

/**
 *
 * @author Admin
 */
public class taiKhoanController {

    public taiKhoan checkLogin(String tenDangNhap, String matKhau) throws Exception {
        String sql = "select tenDangNhap, matKhau, loaiTaiKhoan from danhSachTK where tenDangNhap='" + tenDangNhap + "' and matKhau='" + matKhau + "'";
        try (
                 Connection conn = ketNoi.taoKetNoi();  PreparedStatement pstmt = conn.prepareStatement(sql);) {
            try ( ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    taiKhoan tk = new taiKhoan();
                    tk.setTenDangNhap(tenDangNhap);
                    tk.setLoaiTaiKhoan(rs.getString("loaiTaiKhoan"));
                    tk.setMatKhau(rs.getString("matKhau"));
                    return tk;
                }
            }
        }
        return null;
    }

    public static boolean doiMatKhau(String taiKhoan, String matKhau) {
        String sql = "update danhSachTK set matKhau = '"+ matKhau+"' where tenDangNhap='"+taiKhoan+"'";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            return pstmt.executeUpdate() > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public static boolean themTaiKhoan(taiKhoan tk) {
        String sql = "insert into danhSachTK values ('" + tk.getTenDangNhap() + "','" + tk.getMatKhau() + "','" + tk.getTenNguoiDung() + "','nhanVien'" + ",'" + tk.getSoDienThoai() + "','" + tk.getCCCD() + "')";
        try ( Connection conn = ketNoi.taoKetNoi();) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<taiKhoan> layDanhSachTK() {
        ArrayList<taiKhoan> list = new ArrayList<taiKhoan>();
        String sql = "select * from danhSachTK";
        try {
            Connection conn = ketNoi.taoKetNoi();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                taiKhoan tk = new taiKhoan();
                tk.setTenDangNhap(rs.getString("tenDangNhap"));
                tk.setMatKhau(rs.getString("matKhau"));
                tk.setLoaiTaiKhoan(rs.getString("loaiTaiKhoan"));
                tk.setTenNguoiDung(rs.getString("tenNguoiDung"));
                tk.setSoDienThoai(rs.getString("soDienThoai"));
                tk.setCCCD(rs.getString("CCCD"));
                list.add(tk);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static boolean xoaTaiKhoan(String tenDangNhap) {
        String sql = "delete from danhSachTK where tenDangNhap ='" + tenDangNhap + "'";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static ArrayList<taiKhoan> timKiemTaiKhoan(String txt) {
        ArrayList<taiKhoan> list = new ArrayList<taiKhoan>();
        String sql = "select * from danhSachTk where tenDangNhap like '%" + txt + "%'";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                taiKhoan tk = new taiKhoan();
                tk.setTenDangNhap(rs.getString("tenDangNhap"));
                tk.setMatKhau(rs.getString("matKhau"));
                tk.setLoaiTaiKhoan(rs.getString("loaiTaiKhoan"));
                tk.setTenNguoiDung(rs.getString("tenNguoiDung"));
                tk.setSoDienThoai(rs.getString("soDienThoai"));
                tk.setCCCD(rs.getString("CCCD"));
                list.add(tk);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public static boolean capNhatTaiKhoan(taiKhoan tk) {
        String sql = "update danhSachTK set matKhau ='" + tk.getMatKhau() + "', tenNguoiDung ='" + tk.getTenNguoiDung() + "', soDienThoai ='" + tk.getSoDienThoai() + "',CCCD ='" + tk.getCCCD() + "'where tenDangNhap='" + tk.getTenDangNhap() + "'";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            return pstmt.executeUpdate() > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public static boolean taoPhienDangNhap(taiKhoan tk, String ngayBatDau, String gioBatDau) {
        String sql = "insert into phienDangNhap values ('" + tk.getTenDangNhap() + "','" + ngayBatDau + "','" + gioBatDau + "',null,null,0,0,0)";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            System.out.println(sql);
            return pstmt.executeUpdate() > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        return false;
    }

    public static boolean ketThucPhien(taiKhoan tk, String ngayKetThuc, String gioKetThuc) {
        String sql = "update phienDangNhap set ngayKetThuc ='" + ngayKetThuc + "', gioKetThuc ='" + gioKetThuc + "' where ngayKetThuc is null and tenDangNhap ='" + tk.getTenDangNhap() + "'";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            System.out.println(sql);
            return pstmt.executeUpdate() > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        return false;
    }

    public static boolean nhanXe(taiKhoan tk) {
        String sql = "update phienDangNhap set soLuotNhan = soLuotNhan + 1 where ngayKetThuc is null and tenDangNhap = '" + tk.getTenDangNhap() + "'";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            System.out.println(sql);
            return pstmt.executeUpdate() > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        return false;
    }

    public static boolean traXe(taiKhoan tk, long tien) {
        String sql = "update phienDangNhap set soLuotTra = soLuotTra + 1, tongTien= tongTien +" + tien + " where ngayKetThuc is null and tenDangNhap = '" + tk.getTenDangNhap() + "'";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            System.out.println(sql);
            return pstmt.executeUpdate() > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        return false;
    }

    public static phienDangNhap layThongTinPhien(taiKhoan tk) {
        String sql = "select * from phienDangNhap where ngayKetThuc is null and tenDangNhap ='" + tk.getTenDangNhap() + "'";
        phienDangNhap phien = new phienDangNhap();
        try ( Connection conn = ketNoi.taoKetNoi()) {

            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
            while (rs.next()) {
                phien.setTenDangNhap(rs.getString("tenDangNhap"));
                phien.setSoLuotNhan(rs.getInt("soLuotNhan"));
                phien.setSoLuotTra(rs.getInt("soLuotTra"));
                phien.setTongTien(rs.getInt("tongTien"));
                phien.setNgayBatDau(sdf.format(rs.getDate("ngayBatDau")));
                phien.setGioBatDau(sdf1.format(rs.getTime("gioBatDau")));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        return phien;
    }
}
