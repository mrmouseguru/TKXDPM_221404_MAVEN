package com.l221404.student_app.usecase;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.l221404.student_app.entity.Student;

public class ViewStudentListUseCase implements ViewStudentListInputBoundary{
    //fields
    private ViewStudentListOutputBoundary vSLOutputBoundary = null;
    private ViewStudentListDatabaseBoundary vSLDBBoundary = null;

    

    public ViewStudentListUseCase(ViewStudentListOutputBoundary vSLOutputBoundary,
            ViewStudentListDatabaseBoundary vSLDBBoundary) {
        this.vSLOutputBoundary = vSLOutputBoundary;
        this.vSLDBBoundary = vSLDBBoundary;
    }



    @Override
    public void execute() {

        //lay danh sach sinh vien
        List<Student> studentList = vSLDBBoundary.getStudentList();
        List<ViewStudentOutputDTO> listOutputDTO = new ArrayList<>();

        //chuyển danh sách Student (có quy tắc nghiệp vụ)
        //thành ViewStudentOuputDTO(chỉ có dữ liệu)
        for (Student student : studentList) {
            String hoTen = student.getHoTen();
            Date ngaySinh = student.getNgaySinh();
            String diaChi = student.getDiaChi();
            String nganh = student.getNganh();
            double diemTB = student.tinhDiemTB();
            String hocLuc = student.getHocLuc();


            ViewStudentOutputDTO viewStudentOutputDTO = new ViewStudentOutputDTO(hoTen, ngaySinh, diaChi, nganh, diemTB, hocLuc);
            listOutputDTO.add(viewStudentOutputDTO);
            
        }

        //chuyen danh sach cho nguoi dung
        ResponseStudentList rsStudentList = new ResponseStudentList(studentList);
        vSLOutputBoundary.present(listOutputDTO);
    }

}
