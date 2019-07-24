package com.ykmimi.productviewservicefeign.controller;

import com.ykmimi.productviewservicefeign.bean.Student;
import com.ykmimi.productviewservicefeign.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RefreshScope
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Value("${version}")
    String version;
    @Value("${author}")
    private String author;

    @RequestMapping("/students")
    public Object students(Model m){
        List<Student> students = studentService.listStudents();
        m.addAttribute("students",students);
        m.addAttribute("version",version);
        m.addAttribute("author",author);
        return "students";
    }
}
