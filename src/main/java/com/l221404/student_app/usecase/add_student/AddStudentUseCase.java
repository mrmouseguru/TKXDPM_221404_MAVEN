package com.l221404.student_app.usecase.add_student;

import java.util.Date;

import com.l221404.student_app.entity.KinhTeStudent;
import com.l221404.student_app.entity.PhanMemStudent;
import com.l221404.student_app.entity.Student;

public class AddStudentUseCase implements AddStudentInputBoundary{
    private AddStudentDatabaseBoundary addStudentDatabaseBoundary = null;
    private AddStudentOuputBoundary addStudentOuputBoundary = null;

    

    public AddStudentUseCase(AddStudentDatabaseBoundary addStudentDatabaseBoundary,
            AddStudentOuputBoundary addStudentOuputBoundary) {
        this.addStudentDatabaseBoundary = addStudentDatabaseBoundary;
        this.addStudentOuputBoundary = addStudentOuputBoundary;
    }

    @Override
    public void execute(AddStudentInputDTO addStudentInputDTO) {
        
        //validate
        Student student = null;
        String hoTen = addStudentInputDTO.getHoTen();
        Date ngaySinh = addStudentInputDTO.getNgaySinh();
        String diaChi = addStudentInputDTO.getDiaChi();
        String nganh = addStudentInputDTO.getNganh();

        if(nganh.equals("Phan Mem")){
            student = new PhanMemStudent(hoTen, ngaySinh, diaChi, 
            addStudentInputDTO.getDiemJava(), addStudentInputDTO.getDiemCss(),
             addStudentInputDTO.getDiemHtml());
        }else{
            student = new KinhTeStudent(hoTen, ngaySinh, diaChi, 
            addStudentInputDTO.getDiemMarketing(), 
            addStudentInputDTO.getDiemSales());
        }

        int newStudentId = addStudentDatabaseBoundary.addStudent(student);

        Student newStudent = addStudentDatabaseBoundary.findStudentById(newStudentId);
        //chuyen newStudent => DTO

        AddStudentOutputDTO addStudentOutputDTO = new AddStudentOutputDTO
        (newStudent.getMaSV(), newStudent.getHoTen(), newStudent.getNgaySinh(), 
        newStudent.getDiaChi(), newStudent.getNganh(), newStudent.tinhDiemTB(), 
        newStudent.getHocLuc());

        addStudentOuputBoundary.presenter(addStudentOutputDTO);

    }

    private boolean validateNgaySinh(Date ngaySinh){
        //TO-DO
        return false;
    }

    private boolean valiateDiem(double diem){
        //TO-DO
        return false;
    }

}
