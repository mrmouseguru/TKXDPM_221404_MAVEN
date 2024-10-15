package com.l221404.student_app.database;

import java.util.List;

import com.l221404.student_app.entity.Student;
import com.l221404.student_app.usecase.ViewStudentListDatabaseBoundary;

public class ViewStudentListDAOMemory implements ViewStudentListDatabaseBoundary{

    private List<Student> database = null;

    

    public ViewStudentListDAOMemory(List<Student> database) {
        this.database = database;
    }



    @Override
    public List<Student> getStudentList() {
        return database;
    }

}
