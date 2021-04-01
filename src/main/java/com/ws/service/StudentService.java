package com.ws.service;

import com.ws.domain.Student;

import java.util.List;

public interface StudentService {

    int addStudent(Student student);

    List<Student> findStudents();
}
