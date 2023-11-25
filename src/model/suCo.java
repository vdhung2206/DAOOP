/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class suCo {

    private String maSuCo, bienSoXe, moTa, tenKH, SDT, tenNV, ngayGhiNhan, gioGhiNhan;
    int chiPhi, loai;

    public suCo() {
    }

    public suCo(String maSuCo, String bienSoXe, String moTa, String tenKH, String SDT, String tenNV, String ngayGhiNhan, String gioGhiNhan, int chiPhi, int loai) {
        this.maSuCo = maSuCo;
        this.bienSoXe = bienSoXe;
        this.moTa = moTa;
        this.tenKH = tenKH;
        this.SDT = SDT;
        this.tenNV = tenNV;
        this.ngayGhiNhan = ngayGhiNhan;
        this.gioGhiNhan = gioGhiNhan;
        this.chiPhi = chiPhi;
        this.loai = loai;
    }

    public int getLoai() {
        return loai;
    }

    public void setLoai(int loai) {
        this.loai = loai;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getNgayGhiNhan() {
        return ngayGhiNhan;
    }

    public void setNgayGhiNhan(String ngayGhiNhan) {
        this.ngayGhiNhan = ngayGhiNhan;
    }

    public String getGioGhiNhan() {
        return gioGhiNhan;
    }

    public void setGioGhiNhan(String gioGhiNhan) {
        this.gioGhiNhan = gioGhiNhan;
    }

    public String getMaSuCo() {
        return maSuCo;
    }

    public void setMaSuCo(String maSuCo) {
        this.maSuCo = maSuCo;
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

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public int getChiPhi() {
        return chiPhi;
    }

    public void setChiPhi(int chiPhi) {
        this.chiPhi = chiPhi;
    }
}
