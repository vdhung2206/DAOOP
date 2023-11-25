/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.nhanTraXe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.the;

/**
 *
 * @author Admin
 */
public class nhanTraXeController {

    public static ArrayList<nhanTraXe> layDanhSachNhan() {
        ArrayList<nhanTraXe> list = new ArrayList<nhanTraXe>();
        String sql = "select * from danhSachNhanTraXe where loai=0";
        try {
            Connection conn = ketNoi.taoKetNoi();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                nhanTraXe ntx = new nhanTraXe();
                ntx.setMaThe(rs.getString("maThe"));
                ntx.setLoaiThe(rs.getString("loaiThe"));
                ntx.setLoaiXe(rs.getString("loaiXe"));
                ntx.setBienSoXe(rs.getString("bienSoXe"));
                ntx.setMaKhu(rs.getString("maKhu"));
                ntx.setMaViTri(rs.getString("maViTri"));
                ntx.setNgayNhan(rs.getString("ngayNhan"));
                ntx.setGioNhan(rs.getString("gioNhan"));
                list.add(ntx);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static ArrayList<nhanTraXe> timKiemTheoMaThe(String maThe) {
        ArrayList<nhanTraXe> list = new ArrayList<nhanTraXe>();
        String sql = "select * from danhSachNhanTraXe where loai=0 and maThe like '%" + maThe + "%'";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                nhanTraXe ntx = new nhanTraXe();
                ntx.setMaThe(maThe);
                ntx.setLoaiThe(rs.getString("loaiThe"));
                ntx.setLoaiXe(rs.getString("loaiXe"));
                ntx.setBienSoXe(rs.getString("bienSoXe"));
                ntx.setMaKhu(rs.getString("maKhu"));
                ntx.setMaViTri(rs.getString("maViTri"));
                ntx.setNgayNhan(rs.getString("ngayNhan"));
                ntx.setGioNhan(rs.getString("gioNhan"));
                list.add(ntx);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public static ArrayList<nhanTraXe> timKiemTheoBienSoXe(String bienSoXe) {
        ArrayList<nhanTraXe> list = new ArrayList<nhanTraXe>();
        String sql = "select * from danhSachNhanTraXe where loai=0 and bienSoXe like '%" + bienSoXe + "%'";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                nhanTraXe ntx = new nhanTraXe();
                ntx.setMaThe(rs.getString("maThe"));
                ntx.setLoaiThe(rs.getString("loaiThe"));
                ntx.setLoaiXe(rs.getString("loaiXe"));
                ntx.setBienSoXe(rs.getString("bienSoXe"));
                ntx.setMaKhu(rs.getString("maKhu"));
                ntx.setMaViTri(rs.getString("maViTri"));
                ntx.setNgayNhan(rs.getString("ngayNhan"));
                ntx.setGioNhan(rs.getString("gioNhan"));
                list.add(ntx);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public static boolean nhanXe(nhanTraXe ntx) {
        String sql = "insert into danhSachNhanTraXe values('" + ntx.getMaThe() + "','" + ntx.getLoaiThe() + "','" + ntx.getLoaiXe() + "','" + ntx
                .getBienSoXe() + "','" + ntx
                        .getMaKhu() + "','" + ntx
                        .getMaViTri() + "','" + ntx.getNgayNhan() + "','" + ntx.getGioNhan() + "',null,null,null,0)";
        System.out.println(sql);
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            return pstmt.executeUpdate() > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public static boolean traXeVeNgay(nhanTraXe ntx, long tongTien) {
        String sql = "update danhSachNhanTraXe set ngayTra ='" + ntx.getNgayTra() + "',gioTra = '" + ntx.getGioTra() + "', loai =1, phiGui =" + tongTien + " where maThe='" + ntx
                .getMaThe() + "' and loai=0";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            return pstmt.executeUpdate() > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public static boolean traXeVeThangVaVip(nhanTraXe ntx) {
        String sql = "update danhSachNhanTraXe set phiGui = 0, ngayTra ='" + ntx.getNgayTra() + "',gioTra = '" + ntx.getGioTra() + "', loai =1 where maThe='" + ntx
                .getMaThe() + "' and loai=0";
        try ( Connection conn = ketNoi.taoKetNoi()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            System.out.println(sql);
            return pstmt.executeUpdate() > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public static Date formmat(String ngay, String gio) {
        String[] words1 = ngay.split("-");
        String[] words2 = gio.split(":");

        Date date = new Date();
        date.setYear(Integer.parseInt(words1[0]) - 1900);
        date.setMonth(Integer.parseInt(words1[1])-1);
        date.setDate(Integer.parseInt(words1[2]));
        date.setHours(Integer.parseInt(words2[0]));
        date.setMinutes(Integer.parseInt(words2[1]));
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss ");
        //System.out.println(sdf.format(date));
        return date;
    }

    public static long[] tinhGio(Date date1, Date date2) {
        long a[] = new long[3];
        long l1 = date1.getTime();
        long l2 = date2.getTime();
        a[0] = ((l2 - l1) / 1000) / 86400;
        a[1] = (((l2 - l1) / 1000) % 86400) / 3600;
        a[2] = ((((l2 - l1) / 1000) % 86400) % 3600) / 60;
        return a;
    }

    public static long tinhTien(Date ngayGioNhan, Date ngayGioTra, String maQuyDinh1, String maQuyDinh2) {
        long tongTien = 0;
        long[] tinhGio = nhanTraXeController.tinhGio(ngayGioNhan, ngayGioTra);
        if (ngayGioNhan.getHours() >= 6 && ngayGioNhan.getHours() < 18) {
            Date temp = new Date();
            temp.setYear(ngayGioNhan.getYear());
            temp.setMonth(ngayGioNhan.getMonth());
            temp.setDate(ngayGioNhan.getDate());
            temp.setHours(18);
            temp.setMinutes(0);
            long l = (temp.getTime() - ngayGioNhan.getTime()) / 1000; // moc
            long l1 = tinhGio[0] * (24 * 60 * 60) + tinhGio[1] * 3600 + tinhGio[2] * 60;
            if (tinhGio[0] > 0) {
                tongTien = quyDinhController.layGiaTien(maQuyDinh1) + quyDinhController.layGiaTien(maQuyDinh2);
                long l2 = (l1 - l) / (12 * 3600);
                for (int i = 0; i < l2; i++) {
                    if (i % 2 == 0) {
                        tongTien += quyDinhController.layGiaTien(maQuyDinh1);
                    } else {
                        tongTien += quyDinhController.layGiaTien(maQuyDinh2);
                    }
                }
            }
            if (tinhGio[0] == 0 && l > l1) {
                tongTien += quyDinhController.layGiaTien(maQuyDinh1);
            }
            if (tinhGio[0] == 0 && l < l1 && ((l1 - l) / (12 * 3600)) < 1) {
                tongTien += quyDinhController.layGiaTien(maQuyDinh1);
                tongTien += quyDinhController.layGiaTien(maQuyDinh2);
            }
            if (tinhGio[0] == 0 && l < l1 && ((l1 - l) / (12 * 3600)) == 1) {
                tongTien += quyDinhController.layGiaTien(maQuyDinh1);
                tongTien += quyDinhController.layGiaTien(maQuyDinh1);
                tongTien += quyDinhController.layGiaTien(maQuyDinh2);
            }
        }
        if (ngayGioNhan.getHours() >= 18) {
            Date temp = new Date();
            temp.setYear(ngayGioNhan.getYear());
            temp.setMonth(ngayGioNhan.getMonth());
            temp.setDate(ngayGioNhan.getDate() + 1);
            temp.setHours(6);
            temp.setMinutes(0);
            long l = (temp.getTime() - ngayGioNhan.getTime()) / 1000; // moc
            long l1 = tinhGio[0] * (24 * 60 * 60) + tinhGio[1] * 3600 + tinhGio[2] * 60;
            if (tinhGio[0] > 0) {
                tongTien = quyDinhController.layGiaTien(maQuyDinh2) + quyDinhController.layGiaTien(maQuyDinh1);
                long l2 = (l1 - l) / (12 * 3600);
                for (int i = 0; i < l2; i++) {
                    if (i % 2 == 0) {
                        tongTien += quyDinhController.layGiaTien(maQuyDinh2);
                    } else {
                        tongTien += quyDinhController.layGiaTien(maQuyDinh1);
                    }
                }
            }
            if (tinhGio[0] == 0 && l > l1) {
                tongTien += quyDinhController.layGiaTien(maQuyDinh2);
            }
            if (tinhGio[0] == 0 && l < l1 && ((l1 - l) / (12 * 3600)) < 1) {
                tongTien += quyDinhController.layGiaTien(maQuyDinh2);
                tongTien += quyDinhController.layGiaTien(maQuyDinh1);
            }
            if (tinhGio[0] == 0 && l < l1 && ((l1 - l) / (12 * 3600)) == 1) {
                tongTien += quyDinhController.layGiaTien(maQuyDinh2);
                tongTien += quyDinhController.layGiaTien(maQuyDinh2);
                tongTien += quyDinhController.layGiaTien(maQuyDinh1);
            }
        }
        return tongTien;
    }

    public static long tinhTienOto(Date ngayGioNhan, Date ngayGioTra, String maQuyDinh1, String maQuyDinh2) {
        long tongTien = 0;
        long[] tinhGio = nhanTraXeController.tinhGio(ngayGioNhan, ngayGioTra);
        System.out.println(tinhGio[0]);
        System.out.println(tinhGio[1]);
        System.out.println(tinhGio[2]);
        if (ngayGioNhan.getHours() >= 6 && ngayGioNhan.getHours() < 18) {
            Date temp = new Date();
            temp.setYear(ngayGioNhan.getYear());
            temp.setMonth(ngayGioNhan.getMonth());
            temp.setDate(ngayGioNhan.getDate());
            temp.setHours(18);
            temp.setMinutes(0);
            long l = (temp.getTime() - ngayGioNhan.getTime()) / 1000; // moc
            long l1 = tinhGio[0] * (24 * 60 * 60) + tinhGio[1] * 3600 + tinhGio[2] * 60;// tong thoi gian da gui
            if (l1 < l) {
                tongTien += quyDinhController.layGiaTien(maQuyDinh1) * (tinhGio[1] + 1);
            }
            if (l1 > l) {
                long l2 = (l1 - l) / (12 * 3600);
                if (l2 == 0) {
                    tongTien += (1 + (l / 3600)) * quyDinhController.layGiaTien(maQuyDinh1) + quyDinhController.layGiaTien(maQuyDinh2);
                }
                if (l2 == 1) {
                    tongTien += (1 + (l / 3600)) * quyDinhController.layGiaTien(maQuyDinh1) + quyDinhController.layGiaTien(maQuyDinh2);
                    tongTien += (1 + (((l1 - l) / 3600) - 12)) * quyDinhController.layGiaTien(maQuyDinh1);
                }
                if (l2 > 1) {
                    tongTien += (1 + (l / 3600)) * quyDinhController.layGiaTien(maQuyDinh1);
                    for (int i = 0; i < l2; i++) {
                        if (i % 2 == 0) {
                            tongTien += quyDinhController.layGiaTien(maQuyDinh2);
                        } else {
                            tongTien += 12 * quyDinhController.layGiaTien(maQuyDinh1);
                        }

                    }
                    if (l2 % 2 == 0) {
                        tongTien += quyDinhController.layGiaTien(maQuyDinh2);
                    } else {
                        tongTien += (1 + (((l1 - l) / 3600) - 12 * l2)) * quyDinhController.layGiaTien(maQuyDinh1);
                    }

                }
            }
        }
        if (ngayGioNhan.getHours() >= 18) {
            Date temp = new Date();
            temp.setYear(ngayGioNhan.getYear());
            temp.setMonth(ngayGioNhan.getMonth());
            temp.setDate(ngayGioNhan.getDate() + 1);
            temp.setHours(6);
            temp.setMinutes(0);
            long l = (temp.getTime() - ngayGioNhan.getTime()) / 1000; // moc
            long l1 = tinhGio[0] * (24 * 60 * 60) + tinhGio[1] * 3600 + tinhGio[2] * 60;// tong thoi gian da gui
            if (l1 < l) {
                tongTien += quyDinhController.layGiaTien(maQuyDinh2);
            }
            if (l1 > l) {
                long l2 = (l1 - l) / (12 * 3600);
                if (l2 == 0) {
                    tongTien += quyDinhController.layGiaTien(maQuyDinh2);
                    tongTien += (1 + ((l1 - l) / 3600)) * quyDinhController.layGiaTien(maQuyDinh1);
                }
                if (l2 == 1) {
                    tongTien += quyDinhController.layGiaTien(maQuyDinh2);
                    tongTien += quyDinhController.layGiaTien(maQuyDinh1) * 12;
                    tongTien += quyDinhController.layGiaTien(maQuyDinh2);
                }
                if (l2 > 1) {
                    tongTien += quyDinhController.layGiaTien(maQuyDinh2);
                    for (int i = 0; i < l2; i++) {
                        if (i % 2 == 0) {
                            tongTien += 12 * quyDinhController.layGiaTien(maQuyDinh1);
                        } else {
                            tongTien += quyDinhController.layGiaTien(maQuyDinh2);
                        }

                    }
                    if (l2 % 2 == 0) {
                        tongTien += (1 + (((l1 - l) / 3600) - 12 * l2)) * quyDinhController.layGiaTien(maQuyDinh1);
                    } else {
                        tongTien += quyDinhController.layGiaTien(maQuyDinh2);
                    }

                }
            }
        }
        return tongTien;
    }

    public static ArrayList<nhanTraXe> locXeGuiQuaHan(int i) {
        ArrayList<nhanTraXe> list = new ArrayList<>();
        String sql = "select * from danhSachNhanTraXe where loai=0";
        try {
            Connection conn = ketNoi.taoKetNoi();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                nhanTraXe ntx = new nhanTraXe();
                ntx.setMaThe(rs.getString("maThe"));
                ntx.setLoaiThe(rs.getString("loaiThe"));
                ntx.setLoaiXe(rs.getString("loaiXe"));
                ntx.setBienSoXe(rs.getString("bienSoXe"));
                ntx.setMaKhu(rs.getString("maKhu"));
                ntx.setMaViTri(rs.getString("maViTri"));
                ntx.setNgayNhan(rs.getString("ngayNhan"));
                ntx.setGioNhan(rs.getString("gioNhan"));
                SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
                Date now = new Date();
                Date date = formmat(ntx.getNgayNhan(), ntx.getGioNhan());
                long soNgay = ((now.getTime()- date.getTime())/1000)/86400;
                ntx.setSoNgayGui(soNgay);
                if(soNgay > i){
                list.add(ntx);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
