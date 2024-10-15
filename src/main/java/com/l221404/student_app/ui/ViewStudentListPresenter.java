package com.l221404.student_app.ui;

import com.l221404.student_app.usecase.ResponseData;
import com.l221404.student_app.usecase.ResponseStudentList;
import com.l221404.student_app.usecase.ViewStudentListOutputBoundary;

public class ViewStudentListPresenter implements ViewStudentListOutputBoundary{

    private ResponseStudentList responseStudentList = null;
    @Override
    public void exportData(ResponseData resData) {

        responseStudentList = (ResponseStudentList)resData;
        
    }

    public ResponseStudentList getResponseStudentList() {
        return responseStudentList;
    }

}
