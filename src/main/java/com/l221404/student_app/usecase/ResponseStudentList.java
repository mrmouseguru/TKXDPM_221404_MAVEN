package com.l221404.student_app.usecase;

import java.util.List;

import com.l221404.student_app.entity.Student;

public class ResponseStudentList implements ResponseData{

    private String message = "GET_LIST_OK";
    private List<Student> list = null;

    public ResponseStudentList(List<Student> list) {
        this.list = list;
    }

    public List<Student> getList() {
        return list;
    }

    public String getMessage() {
        return message;
    }

    

}
