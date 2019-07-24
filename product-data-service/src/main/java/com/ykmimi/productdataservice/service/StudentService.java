package com.ykmimi.productdataservice.service;

import com.ykmimi.productdataservice.bean.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Value("${server.port}")
    private String port;

    public List<Student> listStudents(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"zhang3",18,"man","没有最好,只有更好","服务器端口:"+port));
        studentList.add(new Student(2,"li4",18,"man","天晴了雨停了,你又觉得你行了","服务器端口:"+port));
        studentList.add(new Student(2,"wang5",18,"man","努力到无能为力,拼搏到感动自己","服务器端口:"+port));
        return studentList;
    }
}
