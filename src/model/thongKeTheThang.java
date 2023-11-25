/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class thongKeTheThang {

    private String maThe, loaiXe, ngayDangKy, ngayDongTien;
    int tien;

    public thongKeTheThang() {
    }

    public thongKeTheThang(String maThe, String loaiXe, String ngayDangKy, String ngayDongTien, int tien) {
        this.maThe = maThe;
        this.loaiXe = loaiXe;
        this.ngayDangKy = ngayDangKy;
        this.ngayDongTien = ngayDongTien;
        this.tien = tien;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public String getMaThe() {
        return maThe;
    }

    public void setMaThe(String maThe) {
        this.maThe = maThe;
    }

    public String getNgayDangKy() {
        return ngayDangKy;
    }

    public void setNgayDangKy(String ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

    public String getNgayDongTien() {
        return ngayDongTien;
    }

    public void setNgayDongTien(String ngayDongTien) {
        this.ngayDongTien = ngayDongTien;
    }

    public int getTien() {
        return tien;
    }

    public void setTien(int tien) {
        this.tien = tien;
    }

}
