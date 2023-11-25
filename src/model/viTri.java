/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class viTri {
    private String maViTri;
    private boolean coXe;
    public viTri(){
        coXe = false;
    }
    public viTri(String maViTri){
        this.maViTri = maViTri;
        coXe = false;
    }

    public String getMaViTri() {
        return maViTri;
    }

    public void setMaViTri(String maViTri) {
        this.maViTri = maViTri;
    }

    public boolean isCoXe() {
        return coXe;
    }

    public void setCoXe(boolean coXe) {
        this.coXe = coXe;
    }
}
