package com.l221404.student_app.usecase.add_student;

import java.util.Date;

public class AddStudentInputDTO {

    protected String hoTen;
    protected String nganh;
    protected Date ngaySinh;
    protected String diaChi;
    private double diemJava;
    private double diemCss;
    private double diemHtml;

    private double diemMarketing;
    private double diemSales;

    private AddStudentInputDTO(String hoTen, String nganh, Date ngaySinh, String diaChi) {
        this.hoTen = hoTen;
        this.nganh = nganh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public AddStudentInputDTO(String hoTen, String nganh, Date ngaySinh, String diaChi, double diemJava, double diemCss,
            double diemHtml) {
        this(hoTen, nganh, ngaySinh, diaChi);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    public AddStudentInputDTO(String hoTen, String nganh, Date ngaySinh, String diaChi, double diemMarketing,
            double diemSales) {
        this(hoTen, nganh, ngaySinh, diaChi);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public double getDiemCss() {
        return diemCss;
    }

    public double getDiemHtml() {
        return diemHtml;
    }

    public double getDiemMarketing() {
        return diemMarketing;
    }

    public double getDiemSales() {
        return diemSales;
    }


    

}
