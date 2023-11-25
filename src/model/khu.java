package model;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class khu {
    private String maKhu, loaiKhu,loaiXe;
    int sucChua, conLai;
    public khu(){
        
    }

    public khu(String maKhu, String loaiKhu, String loaiXe, int sucChua, int conLai) {
        this.maKhu = maKhu;
        this.loaiKhu = loaiKhu;
        this.loaiXe = loaiXe;
        this.sucChua = sucChua;
        this.conLai = conLai;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }



    public int getConLai() {
        return conLai;
    }

    public void setConLai(int conLai) {
        this.conLai = conLai;
    }
    

    public String getMaKhu() {
        return maKhu;
    }

    public void setMaKhu(String maKhu) {
        this.maKhu = maKhu;
    }

    public String getLoaiKhu() {
        return loaiKhu;
    }

    public void setLoaiKhu(String loaiKhu) {
        this.loaiKhu = loaiKhu;
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }
}
