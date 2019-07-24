package com.ykmimi.productdataservice.controller;

import com.ykmimi.productdataservice.bean.Student;
import com.ykmimi.productdataservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/students")
    public Object students(){
        List<Student> studentList = studentService.listStudents();
        return studentList;
    }
}
