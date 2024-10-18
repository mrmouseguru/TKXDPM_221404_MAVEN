package com.l221404.student_app.ui;

import java.util.List;

import com.l221404.student_app.usecase.ViewStudentListOutputBoundary;
import com.l221404.student_app.usecase.ViewStudentOutputDTO;

public class ViewStudentListPresenter implements ViewStudentListOutputBoundary{

    private List<ViewStudentOutputDTO> listOutputDTO = null;
   

    @Override
    public void present(List<ViewStudentOutputDTO> listOutputDTO) {

        this.listOutputDTO = listOutputDTO;

        //ViewStudentForm
        ViewStudentListForm form = new ViewStudentListForm();
        form.createAndShowGUI(listOutputDTO);
        
    }

    public List<ViewStudentOutputDTO> getListOutputDTO() {
        return listOutputDTO;
    }

}
