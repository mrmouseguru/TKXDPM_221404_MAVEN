package com.l221404.student_app.database;

import java.util.Map;

import com.l221404.student_app.entity.Student;
import com.l221404.student_app.usecase.add_student.AddStudentDatabaseBoundary;

public class AddStudentDAOMemory implements AddStudentDatabaseBoundary{

    private Map<Integer, Student> database = null;

    private int currentStudentId = 0;

    public AddStudentDAOMemory(Map<Integer, Student> database) {
        this.database = database;
    }



    @Override
    public int addStudent(Student student) {

        this.database.put(++currentStudentId, student);

        return currentStudentId;

        
    }

    public Student findStudentById(int studentId){
        return database.get(studentId);
    }

}
