/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class dangKyTheVip {
    private String maThe, maLoaiThe, bienSoXe, maKhu, maViTri, tenKH, CCCD, soDienThoai, ngayDangky, ngayHetHan, tenNhanVien;
    int tien;

    public dangKyTheVip() {
    }

    public dangKyTheVip(String maThe, String maLoaiThe, String bienSoXe, String maKhu, String maViTri, String tenKH, String CCCD, String soDienThoai, String ngayDangky, String ngayHetHan, String tenNhanVien, int tien) {
        this.maThe = maThe;
        this.maLoaiThe = maLoaiThe;
        this.bienSoXe = bienSoXe;
        this.maKhu = maKhu;
        this.maViTri = maViTri;
        this.tenKH = tenKH;
        this.CCCD = CCCD;
        this.soDienThoai = soDienThoai;
        this.ngayDangky = ngayDangky;
        this.ngayHetHan = ngayHetHan;
        this.tenNhanVien = tenNhanVien;
        this.tien = tien;
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

    public String getMaKhu() {
        return maKhu;
    }

    public void setMaKhu(String maKhu) {
        this.maKhu = maKhu;
    }

    public String getMaViTri() {
        return maViTri;
    }

    public void setMaViTri(String maViTri) {
        this.maViTri = maViTri;
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

    public String getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(String ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
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
    
}
