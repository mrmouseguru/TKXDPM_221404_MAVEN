package com.l221404.student_app;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.l221404.student_app.database.AddStudentDAOMemory;
import com.l221404.student_app.database.DatabaseMemory;
import com.l221404.student_app.ui.add_student.AddStudentPresenter;
import com.l221404.student_app.usecase.add_student.AddStudentInputBoundary;
import com.l221404.student_app.usecase.add_student.AddStudentInputDTO;
import com.l221404.student_app.usecase.add_student.AddStudentOutputDTO;
import com.l221404.student_app.usecase.add_student.AddStudentUseCase;

public class AddStudentTest {

    @Test
    public void testAddStudent() {

        AddStudentInputBoundary addStudentInputBoundary  = null;

        DatabaseMemory databaseMemory = new DatabaseMemory();
        
        AddStudentPresenter presenter = new AddStudentPresenter();

        AddStudentDAOMemory addStudentDAOMemory = new AddStudentDAOMemory(databaseMemory.getDatabase());

        addStudentInputBoundary = new 
        AddStudentUseCase(addStudentDAOMemory, presenter);

        addStudentInputBoundary.execute(getMockStudent());

        AddStudentOutputDTO addStudentOutputDTO = presenter.getAddStudentOutputDTO();

        assertEquals(getMockStudent().getHoTen(), addStudentOutputDTO.getHoTen());


        
    }

    private AddStudentInputDTO getMockStudent(){
        AddStudentInputDTO student1 = null;
        Calendar calendar1 = Calendar.getInstance();
        
        // Đặt ngày, tháng, năm
        calendar1.set(Calendar.YEAR, 1984);
        calendar1.set(Calendar.MONTH, Calendar.NOVEMBER); // Tháng 11 (0 là tháng 1)
        calendar1.set(Calendar.DAY_OF_MONTH, 13);
        
        // Tạo đối tượng Date từ Calendar
        Date date1 = calendar1.getTime();

        //new PhanMemStudent("Nguyen Van A", date1, "HCM", 5, 5, 5)
         student1 = new AddStudentInputDTO("Nguyen Van A", 
        "Kinh Te", date1, "TPHCM",
        9, 9);

        return student1;
    }



}
