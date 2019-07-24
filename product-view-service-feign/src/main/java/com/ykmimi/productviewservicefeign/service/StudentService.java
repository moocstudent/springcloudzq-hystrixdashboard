package com.ykmimi.productviewservicefeign.service;

import com.ykmimi.productviewservicefeign.bean.Student;
import com.ykmimi.productviewservicefeign.client.StudentClientFeign;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentService {
    @Resource
    private StudentClientFeign studentClientFeign;

    public List<Student> listStudents(){
        return studentClientFeign.listStudent();
    }
}
