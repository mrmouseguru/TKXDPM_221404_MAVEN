package com.l221404.student_app.database;

import java.util.HashMap;
import java.util.Map;

import com.l221404.student_app.entity.Student;

public class DatabaseMemory {

    private Map<Integer, Student> database = new HashMap<>();


    public Map<Integer, Student> getDatabase() {
        return database;
    }

}
