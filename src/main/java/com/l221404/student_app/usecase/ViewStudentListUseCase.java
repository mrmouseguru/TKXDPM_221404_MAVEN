package com.l221404.student_app.usecase;

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

        //chuyen danh sach cho nguoi dung
        ResponseStudentList rsStudentList = new ResponseStudentList(studentList);
        vSLOutputBoundary.exportData(rsStudentList);
    }

}
