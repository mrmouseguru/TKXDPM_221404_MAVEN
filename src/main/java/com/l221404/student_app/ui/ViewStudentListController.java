package com.l221404.student_app.ui;

import com.l221404.student_app.usecase.ViewStudentListInputBoundary;

public class ViewStudentListController {

    private ViewStudentListInputBoundary viewSLInputB = null;

    public ViewStudentListController() {
    }

    public ViewStudentListController(ViewStudentListInputBoundary viewSLInputB) {
        this.viewSLInputB = viewSLInputB;
    }

    public void execute(){
        viewSLInputB.execute();;
    }

    

}
