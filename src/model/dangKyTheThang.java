/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class dangKyTheThang {

    private String maThe, maLoaiThe, bienSoXe, tenKH, CCCD, soDienThoai, ngayDangky, ngayDongTien, tenNhanVien, dongTien;
    int tien;

    public dangKyTheThang() {
    }

    public dangKyTheThang(String maThe, String maLoaiThe, String bienSoXe, String tenKH, String CCCD, String soDienThoai, String ngayDangky, String ngayDongTien, String tenNhanVien, String dongTien, int tien) {
        this.maThe = maThe;
        this.maLoaiThe = maLoaiThe;
        this.bienSoXe = bienSoXe;
        this.tenKH = tenKH;
        this.CCCD = CCCD;
        this.soDienThoai = soDienThoai;
        this.ngayDangky = ngayDangky;
        this.ngayDongTien = ngayDongTien;
        this.tenNhanVien = tenNhanVien;
        this.dongTien = dongTien;
        this.tien = tien;
    }

    public String getNgayDongTien() {
        return ngayDongTien;
    }

    public void setNgayDongTien(String ngayDongTien) {
        this.ngayDongTien = ngayDongTien;
    }

    public String getMaThe() {
        return maThe;
    }

    public void setMaThe(String maThe) {
        this.maThe = maThe;
    }

    public String getMaLoaiThe() {
        return maLoaiThe;
    }

    public void setMaLoaiThe(String maLoaiThe) {
        this.maLoaiThe = maLoaiThe;
    }

    public String getBienSoXe() {
        return bienSoXe;
    }

    public void setBienSoXe(String bienSoXe) {
        this.bienSoXe = bienSoXe;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getNgayDangky() {
        return ngayDangky;
    }

    public void setNgayDangky(String ngayDangky) {
        this.ngayDangky = ngayDangky;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public int getTien() {
        return tien;
    }

    public void setTien(int tien) {
        this.tien = tien;
    }

    public String getDongTien() {
        return dongTien;
    }

    public void setDongTien(String dongTien) {
        this.dongTien = dongTien;
    }

}
