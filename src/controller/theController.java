/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import model.the;

/**
 *
 * @author Admin
 */
public class theController {

    public static ArrayList<the> layDanhSachTheNgay() {
        ArrayList<the> list = new ArrayList<the>();
        try ( Connection conn = ketNoi.taoKetNoi()) {
            String sql = "select * from danhSachThe where theThang=0 and theVip=0";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                the t = new the();
                t.setMaThe(rs.getString("maThe"));
                list.add(t);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public static the layThongTinThe(String maThe) {
        String sql = "select * from danhSachThe where maThe='" + maThe + "'";
        try {
            Connection conn = ketNoi.taoKetNoi();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                the t = new the();
                t.setMaThe(rs.getString("maThe"));
                t.setMaLoaiThe(rs.getString("maLoaithe"));
                t.setBienSoXe(rs.getString("bienSoXe"));
                t.setMaKhu(rs.getString("maKhu"));
                t.setMaViTri(rs.getString("maViTri"));
                return t;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static the layThongTinTheThang(String maThe) {
        String sql = "select * from danhSachThe where theThang = 1 and maThe='" + maThe + "'";
        try {
            Connection conn = ketNoi.taoKetNoi();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                the t = new the();
                t.setMaThe(rs.getString("maThe"));
                t.setMaLoaiThe(rs.getString("maLoaithe"));
                t.setBienSoXe(rs.getString("bienSoXe"));
                t.setMaKhu(rs.getString("maKhu"));
                t.setMaViTri(rs.getString("maViTri"));
                return t;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static the layThongTinTheVip(String maThe) {
        String sql = "select * from danhSachThe where theVip = 1 and maThe='" + maThe + "'";
        try {
            Connection conn = ketNoi.taoKetNoi();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                the t = new the();
                t.setMaThe(rs.getString("maThe"));
                t.setMaLoaiThe(rs.getString("maLoaithe"));
                t.setBienSoXe(rs.getString("bienSoXe"));
                t.setMaKhu(rs.getString("maKhu"));
                t.setMaViTri(rs.getString("maViTri"));
                return t;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static boolean themTheNgay(String maThe) {
        try ( Connection conn = ketNoi.taoKetNoi()) {
            String sql = "insert into danhSachThe values('" + maThe + "','','','','','0','0')";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static int demTheNgayConLai() {
        int count = 0;
        String sql = "select * from danhSachThe where theThang=0 and theVip=0 and bienSoXe=''";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                count++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public static boolean xoaTheNgay(String maThe) {
        try ( Connection conn = ketNoi.taoKetNoi()) {
            String sql = "delete from danhSachThe where maThe ='" + maThe + "'";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static the checkCoXe(String maThe) {
        String sql = "select * from danhSachThe where maThe ='" + maThe + "'and bienSoXe !=''";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            the t = new the();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                t.setBienSoXe(rs.getString("bienSoXe"));
                return t;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean checkTonTai(String maThe) {
        String sql = "select * from danhSachThe where maThe ='" + maThe + "'";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            return rs.next();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public static boolean nhanXeTheNgay(String maThe, String bienSoXe, String maKhu, String maLoaiThe) {
        String sql = "update danhSachThe set bienSoXe = '" + bienSoXe + "', maLoaiThe ='" + maLoaiThe + "', maKhu ='" + maKhu + "' where maThe ='" + maThe + "'";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            return pstmt.executeUpdate() > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public static boolean traXeTheNgay(String maThe) {
        String sql = "update danhSachThe set bienSoXe = '', maLoaiThe ='', maKhu ='' where maThe ='" + maThe + "'";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            return pstmt.executeUpdate() > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public static boolean nhanXeTheThang(String maKhu, String maThe) {
        String sql = "update danhSachThe set maKhu ='" + maKhu + "' where maThe ='" + maThe + "'";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            return pstmt.executeUpdate() > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
        public static boolean nhanXeTheVip(String maKhu, String maViTri, String maThe) {
        String sql = "update danhSachThe set maKhu ='" + maKhu + ", maViTri = "+maViTri+ "' where maThe ='" + maThe + "'";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            return pstmt.executeUpdate() > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public static boolean traXeTheThang(String maThe) {
        String sql = "update danhSachThe set maKhu ='' where maThe ='" + maThe + "'";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            return pstmt.executeUpdate() > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
