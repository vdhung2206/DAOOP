/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class phienDangNhap {
    private String tenDangNhap, ngayBatDau, gioBatDau, ngayKetThuc, gioketThuc;
    private int soLuotNhan, soLuotTra, tongTien;

    public phienDangNhap() {
    }

    public phienDangNhap(String tenDangNhap, String ngayBatDau, String gioBatDau, String ngayKetThuc, String gioketThuc, int soLuotNhan, int soLuotTra, int tongTien) {
        this.tenDangNhap = tenDangNhap;
        this.ngayBatDau = ngayBatDau;
        this.gioBatDau = gioBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.gioketThuc = gioketThuc;
        this.soLuotNhan = soLuotNhan;
        this.soLuotTra = soLuotTra;
        this.tongTien = tongTien;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getGioBatDau() {
        return gioBatDau;
    }

    public void setGioBatDau(String gioBatDau) {
        this.gioBatDau = gioBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getGioketThuc() {
        return gioketThuc;
    }

    public void setGioketThuc(String gioketThuc) {
        this.gioketThuc = gioketThuc;
    }

    public int getSoLuotNhan() {
        return soLuotNhan;
    }

    public void setSoLuotNhan(int soLuotNhan) {
        this.soLuotNhan = soLuotNhan;
    }

    public int getSoLuotTra() {
        return soLuotTra;
    }

    public void setSoLuotTra(int soLuotTra) {
        this.soLuotTra = soLuotTra;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }
    
}
