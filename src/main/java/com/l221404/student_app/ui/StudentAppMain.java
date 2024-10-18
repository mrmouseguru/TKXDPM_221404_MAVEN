package com.l221404.student_app.ui;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.l221404.student_app.database.ViewStudentListDAOMemory;
import com.l221404.student_app.entity.KinhTeStudent;
import com.l221404.student_app.entity.PhanMemStudent;
import com.l221404.student_app.entity.Student;
import com.l221404.student_app.usecase.ViewStudentListUseCase;

public class StudentAppMain {

    public static void main(String[] args) {

        ViewStudentListDAOMemory dataDaoMemory = new ViewStudentListDAOMemory(getStudentList());
        ViewStudentListPresenter presenter = new ViewStudentListPresenter();

        ViewStudentListUseCase viewStudentListUseCase = new 
        ViewStudentListUseCase(presenter, dataDaoMemory);

        ViewStudentListController controller = 
        new ViewStudentListController(viewStudentListUseCase);

        controller.execute();
    }

     private static List<Student> getStudentList() {
        List<Student> students = new ArrayList<>();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            students.add(new PhanMemStudent("Nguyen Van A", sdf.parse("10/10/2003"), "HCM", 5, 5, 5));
            students.add(new KinhTeStudent("Nguyen Van B", sdf.parse("09/09/2000"), "HN", 6, 6));
            students.add(new PhanMemStudent("Nguyen Thi C", sdf.parse("08/08/2001"), "DN", 8, 8, 8));
            students.add(new KinhTeStudent("Tran Van Mít", sdf.parse("01/01/2002"), "YB", 9, 9));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

}
