package com.example.n12_pro1121_md18310.Model;

public class NhanVien {
    private int maNv;
    private String hoTen;
    private int namSinh;
    private String sdt;
    private String email;

    public NhanVien() {
    }

    public NhanVien(int maNv, String hoTen, int namSinh, String sdt, String email) {
        this.maNv = maNv;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.sdt = sdt;
        this.email = email;
    }

    public int getMaNv() {
        return maNv;
    }

    public void setMaNv(int maNv) {
        this.maNv = maNv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
