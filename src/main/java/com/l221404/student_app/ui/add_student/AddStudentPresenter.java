package com.l221404.student_app.ui.add_student;

import com.l221404.student_app.usecase.add_student.AddStudentOuputBoundary;
import com.l221404.student_app.usecase.add_student.AddStudentOutputDTO;

public class AddStudentPresenter implements AddStudentOuputBoundary{

    private AddStudentOutputDTO addStudentOutputDTO = null;
    @Override
    public void presenter(AddStudentOutputDTO addStudentOutputDTO) {
        this.addStudentOutputDTO = addStudentOutputDTO;
    }

    public AddStudentOutputDTO getAddStudentOutputDTO() {
        return addStudentOutputDTO;
    }

}
