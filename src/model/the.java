/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class the {

    private String maThe, maLoaiThe, bienSoXe, maKhu, maViTri;
    int giaTien;
    boolean theThang, theVip;

    public the() {
    }

    public the(String maThe, String maLoaiThe, String bienSoXe, String maKhu, String maViTri, int giaTien, boolean theThang, boolean theVip) {
        this.maThe = maThe;
        this.maLoaiThe = maLoaiThe;
        this.bienSoXe = bienSoXe;
        this.maKhu = maKhu;
        this.maViTri = maViTri;
        this.giaTien = giaTien;
        this.theThang = theThang;
        this.theVip = theVip;
    }

    public String getMaThe() {
        return maThe;
    }

    public String getMaLoaiThe() {
        return maLoaiThe;
    }

    public void setMaLoaiThe(String maLoaiThe) {
        this.maLoaiThe = maLoaiThe;
    }

    public void setMaThe(String maThe) {
        this.maThe = maThe;
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

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    public boolean isTheThang() {
        return theThang;
    }

    public void setTheThang(boolean theThang) {
        this.theThang = theThang;
    }

    public boolean isTheVip() {
        return theVip;
    }

    public void setTheVip(boolean theVip) {
        this.theVip = theVip;
    }

}
