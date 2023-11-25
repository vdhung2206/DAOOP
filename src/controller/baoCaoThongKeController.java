/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.nhanTraXe;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import model.the;
import model.thongKeTheThang;

/**
 *
 * @author Admin
 */
public class baoCaoThongKeController {

    public static ArrayList<nhanTraXe> layDanhSachLuotGui() {
        ArrayList<nhanTraXe> list = new ArrayList<nhanTraXe>();
        String sql = "select * from danhSachNhanTraXe where loai=1";
        try {
            Connection conn = ketNoi.taoKetNoi();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                nhanTraXe tktt = new nhanTraXe();
                tktt.setMaThe(rs.getString("maThe"));
                tktt.setLoaiThe(rs.getString("loaiThe"));
                tktt.setLoaiXe(rs.getString("loaiXe"));
                tktt.setBienSoXe(rs.getString("bienSoXe"));
                tktt.setMaKhu(rs.getString("maKhu"));
                tktt.setMaViTri(rs.getString("maViTri"));
                tktt.setNgayNhan(rs.getString("ngayNhan"));
                tktt.setGioNhan(rs.getString("gioNhan"));
                tktt.setGioTra(rs.getString("gioTra"));
                tktt.setNgayTra(rs.getString("ngayTra"));
                tktt.setPhiGui(String.valueOf(rs.getInt("phiGui")));
                list.add(tktt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static ArrayList<nhanTraXe> thongKeTheoNgay(String tuNgay, String denNgay, String loaiXe) {
        ArrayList<nhanTraXe> list = new ArrayList<nhanTraXe>();
        String sql = "select * from danhSachNhanTraXe where loaiXe = '" + loaiXe + "'" + " and loai = 1 and ngayTra >='" + tuNgay + "'and ngayTra <='" + denNgay + "'";
        String sql1 = "select * from danhSachNhanTraXe where loai = 1 and ngayTra >='" + tuNgay + "'and ngayTra <='" + denNgay + "'";
        try {
            if (loaiXe.equals("All")) {
                Connection conn = ketNoi.taoKetNoi();
                PreparedStatement pstmt1 = conn.prepareStatement(sql1);
                ResultSet rs = pstmt1.executeQuery();
                while (rs.next()) {
                    nhanTraXe tktt = new nhanTraXe();
                    tktt.setMaThe(rs.getString("maThe"));
                    tktt.setLoaiThe(rs.getString("loaiThe"));
                    tktt.setLoaiXe(rs.getString("loaiXe"));
                    tktt.setBienSoXe(rs.getString("bienSoXe"));
                    tktt.setMaKhu(rs.getString("maKhu"));
                    tktt.setMaViTri(rs.getString("maViTri"));
                    tktt.setNgayNhan(rs.getString("ngayNhan"));
                    tktt.setGioNhan(rs.getString("gioNhan"));
                    tktt.setGioTra(rs.getString("gioTra"));
                    tktt.setNgayTra(rs.getString("ngayTra"));
                    tktt.setPhiGui(String.valueOf(rs.getInt("phiGui")));
                    list.add(tktt);
                }

            } else {
                Connection conn = ketNoi.taoKetNoi();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    nhanTraXe tktt = new nhanTraXe();
                    tktt.setMaThe(rs.getString("maThe"));
                    tktt.setLoaiThe(rs.getString("loaiThe"));
                    tktt.setLoaiXe(rs.getString("loaiXe"));
                    tktt.setBienSoXe(rs.getString("bienSoXe"));
                    tktt.setMaKhu(rs.getString("maKhu"));
                    tktt.setMaViTri(rs.getString("maViTri"));
                    tktt.setNgayNhan(rs.getString("ngayNhan"));
                    tktt.setGioNhan(rs.getString("gioNhan"));
                    tktt.setGioTra(rs.getString("gioTra"));
                    tktt.setNgayTra(rs.getString("ngayTra"));
                    tktt.setPhiGui(String.valueOf(rs.getInt("phiGui")));
                    list.add(tktt);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static boolean taoLuotThongKeTheThang(thongKeTheThang tktt) {
        String sql = "insert into thongKeVeThang values('" + tktt.getMaThe() + "','" + tktt.getLoaiXe() + "','" + tktt.getNgayDangKy() + "','" + tktt.getNgayDongTien() + "'," + tktt.getTien() + ")";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean capNhatTheThang(int tien, String maThe, String ngayDangKy) {
        String sql = "update thongKeVeThang set tien = " + tien + "where maThe = '" + maThe + "' and ngayDangKy ='" + ngayDangKy + "'";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static ArrayList<thongKeTheThang> layDanhSachThongKeTheThang() {
        ArrayList<thongKeTheThang> list = new ArrayList<thongKeTheThang>();
        String sql = "select * from thongKeVeThang ";
        try {
            Connection conn = ketNoi.taoKetNoi();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
                thongKeTheThang tktt = new thongKeTheThang();
                tktt.setMaThe(rs.getString("maThe"));
                tktt.setLoaiXe(rs.getString("loaiXe"));
                tktt.setNgayDangKy(sdf.format(rs.getDate("ngayDangKy")));
                tktt.setNgayDongTien(sdf.format(rs.getDate("ngayDongTien")));
                tktt.setTien(rs.getInt("tien"));
                list.add(tktt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static ArrayList<thongKeTheThang> thongKeDoanhThuTheThang(String tuNgay, String denNgay, String loaiXe, int loaiDangKy) {
        ArrayList<thongKeTheThang> list = new ArrayList<thongKeTheThang>();
        String sql1 = "select * from thongKeVeThang where loaiXe = '" + loaiXe + "'" + "  and ngayDongTien >='" + tuNgay + "'and ngayDongTien <='" + denNgay + "'";
        String sql2 = "select * from thongKeVeThang where ngayDongTien >='" + tuNgay + "'and ngayDongTien <='" + denNgay + "'";
        String sql4 = "select * from thongKeVeThang where ngayDangKy = ngayDongTien and ngayDangKy >='" + tuNgay + "'and ngayDangKy <='" + denNgay + "'";
        String sql3 = "select * from thongKeVeThang where ngayDangKy = ngayDongTien and loaiXe = '" + loaiXe + "'" + "  and ngayDangKy >='" + tuNgay + "'and ngayDangKy <='" + denNgay + "'";
        try {
            if (loaiDangKy == 1) {
                if (loaiXe.equals("All")) {
                    Connection conn = ketNoi.taoKetNoi();
                    PreparedStatement pstmt1 = conn.prepareStatement(sql2);
                    ResultSet rs = pstmt1.executeQuery();
                    while (rs.next()) {
                        thongKeTheThang tktt = new thongKeTheThang();
                        tktt.setMaThe(rs.getString("maThe"));
                        tktt.setLoaiXe(rs.getString("loaiXe"));
                        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
                        tktt.setNgayDangKy(sdf.format(rs.getDate("ngayDangKy")));
                        tktt.setNgayDongTien(sdf.format(rs.getDate("ngayDongTien")));
                        tktt.setTien(rs.getInt("tien"));
                        list.add(tktt);
                    }

                } else {
                    Connection conn = ketNoi.taoKetNoi();
                    PreparedStatement pstmt = conn.prepareStatement(sql1);
                    ResultSet rs = pstmt.executeQuery();
                    while (rs.next()) {
                        thongKeTheThang tktt = new thongKeTheThang();
                        tktt.setMaThe(rs.getString("maThe"));
                        tktt.setLoaiXe(rs.getString("loaiXe"));
                        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
                        tktt.setNgayDangKy(sdf.format(rs.getDate("ngayDangKy")));
                        tktt.setNgayDongTien(sdf.format(rs.getDate("ngayDongTien")));
                        tktt.setTien(rs.getInt("tien"));
                        list.add(tktt);
                    }

                }
            } else {
                if (loaiXe.equals("All")) {
                    Connection conn = ketNoi.taoKetNoi();
                    System.out.println(sql2);
                    PreparedStatement pstmt1 = conn.prepareStatement(sql4);
                    ResultSet rs = pstmt1.executeQuery();
                    while (rs.next()) {
                        thongKeTheThang tktt = new thongKeTheThang();
                        tktt.setMaThe(rs.getString("maThe"));
                        tktt.setLoaiXe(rs.getString("loaiXe"));
                        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
                        tktt.setNgayDangKy(sdf.format(rs.getDate("ngayDangKy")));
                        tktt.setNgayDongTien(sdf.format(rs.getDate("ngayDongTien")));
                        tktt.setTien(rs.getInt("tien"));
                        list.add(tktt);
                    }

                } else {
                    Connection conn = ketNoi.taoKetNoi();
                    PreparedStatement pstmt = conn.prepareStatement(sql3);
                    ResultSet rs = pstmt.executeQuery();
                    System.out.println(sql3);
                    while (rs.next()) {
                        thongKeTheThang tktt = new thongKeTheThang();
                        tktt.setMaThe(rs.getString("maThe"));
                        tktt.setLoaiXe(rs.getString("loaiXe"));
                        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
                        tktt.setNgayDangKy(sdf.format(rs.getDate("ngayDangKy")));
                        tktt.setNgayDongTien(sdf.format(rs.getDate("ngayDongTien")));
                        tktt.setTien(rs.getInt("tien"));
                        list.add(tktt);
                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
