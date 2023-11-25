/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class nhanTraXe {

    private String ngayNhan, gioNhan, ngayTra, gioTra, tenDangNhap, phiGui, loaiXe, loaiThe, maThe, maKhu, maViTri, bienSoXe;
    int loai; // 0:nhan, 1:tra
    long soNgayGui;

    public nhanTraXe() {
    }

    public nhanTraXe(String ngayNhan, String gioNhan, String ngayTra, String gioTra, String tenDangNhap, String phiGui, String loaiXe, String loaiThe, String maThe, String maKhu, String maViTri, String bienSoXe, int loai, long soNgayGui) {
        this.ngayNhan = ngayNhan;
        this.gioNhan = gioNhan;
        this.ngayTra = ngayTra;
        this.gioTra = gioTra;
        this.tenDangNhap = tenDangNhap;
        this.phiGui = phiGui;
        this.loaiXe = loaiXe;
        this.loaiThe = loaiThe;
        this.maThe = maThe;
        this.maKhu = maKhu;
        this.maViTri = maViTri;
        this.bienSoXe = bienSoXe;
        this.loai = loai;
        this.soNgayGui = soNgayGui;
    }

    public long getSoNgayGui() {
        return soNgayGui;
    }

    public void setSoNgayGui(long soNgayGui) {
        this.soNgayGui = soNgayGui;
    }

    public String getMaThe() {
        return maThe;
    }

    public void setMaThe(String maThe) {
        this.maThe = maThe;
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

    public String getBienSoXe() {
        return bienSoXe;
    }

    public void setBienSoXe(String bienSoXe) {
        this.bienSoXe = bienSoXe;
    }

    public String getLoaiThe() {
        return loaiThe;
    }

    public void setLoaiThe(String loaiThe) {
        this.loaiThe = loaiThe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public String getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(String ngayNhan) {
        this.ngayNhan = ngayNhan;
    }

    public String getGioNhan() {
        return gioNhan;
    }

    public void setGioNhan(String gioNhan) {
        this.gioNhan = gioNhan;
    }

    public String getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(String ngayTra) {
        this.ngayTra = ngayTra;
    }

    public String getGioTra() {
        return gioTra;
    }

    public void setGioTra(String gioTra) {
        this.gioTra = gioTra;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getPhiGui() {
        return phiGui;
    }

    public void setPhiGui(String phiGui) {
        this.phiGui = phiGui;
    }

    public int getLoai() {
        return loai;
    }

    public void setLoai(int loai) {
        this.loai = loai;
    }

}
