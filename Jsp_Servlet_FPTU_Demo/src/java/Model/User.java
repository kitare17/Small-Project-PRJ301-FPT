/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author PC
 */
public class User implements Serializable{

    private String id;
    private String ten;
    private boolean gioiTinh;
    private String ngaySinh;
    private String quocTich;
    private String diaChi;
    private String dienThoai;
    private String nganhHoc;

    public User() {
    }

    public User(String id, String ten, boolean gioiTinh, String ngaySinh, String quocTich, String diaChi, String dienThoai, String nganhHoc) {
        this.id = id;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.quocTich = quocTich;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.nganhHoc = nganhHoc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", ten=" + ten + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh + ", quocTich=" + quocTich + ", diaChi=" + diaChi + ", dienThoai=" + dienThoai + ", nganhHoc=" + nganhHoc + '}';
    }
    
}
