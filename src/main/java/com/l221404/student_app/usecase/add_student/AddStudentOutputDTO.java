package com.l221404.student_app.usecase.add_student;

import java.util.Date;

public class AddStudentOutputDTO {
    protected int maSV;
    protected String hoTen;
    protected Date ngaySinh;
    protected String diaChi;
    protected String nganh;
    
    protected double diemTB;

    protected String hocLuc;

    public AddStudentOutputDTO(int maSV, String hoTen, Date ngaySinh, String diaChi, String nganh, double diemTB,
            String hocLuc) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.nganh = nganh;
        this.diemTB = diemTB;
        this.hocLuc = hocLuc;
    }

    public int getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getNganh() {
        return nganh;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public String getHocLuc() {
        return hocLuc;
    }

    

    

}
