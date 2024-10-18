package com.l221404.student_app;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.l221404.student_app.database.ViewStudentListDAOMemory;
import com.l221404.student_app.entity.KinhTeStudent;
import com.l221404.student_app.entity.PhanMemStudent;
import com.l221404.student_app.entity.Student;
import com.l221404.student_app.ui.ViewStudentListPresenter;
import com.l221404.student_app.usecase.ViewStudentListInputBoundary;
import com.l221404.student_app.usecase.ViewStudentListUseCase;
import com.l221404.student_app.usecase.ViewStudentOutputDTO;

public class ViewStudentListTest {

    @Test
    public void getViewStudentListTestSucsess() {
        ViewStudentListDAOMemory databaes = new ViewStudentListDAOMemory(getData());

        ViewStudentListPresenter presenter = new ViewStudentListPresenter();

        ViewStudentListInputBoundary vSLUseCase = new ViewStudentListUseCase(presenter, databaes);

        vSLUseCase.execute();

        List<ViewStudentOutputDTO> listOutDTO = presenter
        .getListOutputDTO();

        assertEquals(4, listOutDTO.size());
        
    }

    private List<Student> getData(){
        List<Student> list = new ArrayList<>();
        Calendar calendar1 = Calendar.getInstance();
        
        // Đặt ngày, tháng, năm
        calendar1.set(Calendar.YEAR, 1984);
        calendar1.set(Calendar.MONTH, Calendar.NOVEMBER); // Tháng 11 (0 là tháng 1)
        calendar1.set(Calendar.DAY_OF_MONTH, 13);
        
        // Tạo đối tượng Date từ Calendar
        Date date1 = calendar1.getTime();

        Calendar calendar2 = Calendar.getInstance();
        
        // Đặt ngày, tháng, năm
        calendar2.set(Calendar.YEAR, 2000);
        calendar2.set(Calendar.MONTH, Calendar.SEPTEMBER); // Tháng 11 (0 là tháng 1)
        calendar2.set(Calendar.DAY_OF_MONTH, 9);
        
        // Tạo đối tượng Date từ Calendar
        Date date2 = calendar2.getTime();

        Calendar calendar3 = Calendar.getInstance();
        
        // Đặt ngày, tháng, năm
        calendar3.set(Calendar.YEAR, 2001);
        calendar3.set(Calendar.MONTH, Calendar.AUGUST); // Tháng 11 (0 là tháng 1)
        calendar3.set(Calendar.DAY_OF_MONTH, 8);
        
        // Tạo đối tượng Date từ Calendar
        Date date3 = calendar1.getTime();

        Calendar calendar4 = Calendar.getInstance();
        
        // Đặt ngày, tháng, năm
        calendar4.set(Calendar.YEAR, 2002);
        calendar4.set(Calendar.MONTH, Calendar.JANUARY); // Tháng 11 (0 là tháng 1)
        calendar4.set(Calendar.DAY_OF_MONTH, 1);
        
        // Tạo đối tượng Date từ Calendar
        Date date4 = calendar1.getTime();

        
        list.add(new PhanMemStudent("Nguyen Van A", date1, "HCM", 5, 5, 5));
        list.add(new KinhTeStudent("Nguyen Van B", date2, "HN", 6, 6));
        list.add(new PhanMemStudent("Nguyen Thi C", date3, "DN", 8, 8, 8));
        list.add(new KinhTeStudent("Tran Van Mít", date4, "YB", 9, 9));

        return list;
    }


}
