package com.l221404.student_app.usecase.add_student;

import com.l221404.student_app.entity.Student;

public interface AddStudentDatabaseBoundary {

    int addStudent(Student student);

    Student findStudentById(int newStudentId);

}
